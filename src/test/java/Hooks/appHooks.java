package Hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import QA.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class appHooks 
{
	WebDriver driver;
	DriverFactory df;
	
	@Before
    public void LaunchBrowser() throws IOException
    {
      	//Create Object of FileInputStream Class
    	  FileInputStream file = new FileInputStream("C:\\Users\\Ritesh Pise\\eclipse-workspace\\21_March_BDD_Framework\\src\\test\\resources\\config.properties");
    	  
    	  //Create Object of Properties Class
    	    Properties prop= new Properties();
    	    
    	    //Load the properties file
    	    prop.load(file);
    	    
    	    String Browsername= prop.getProperty("Browser");  //Chrome
    	    
    	    //Create Object of DriverFactory Class
    	    df=new DriverFactory();
    	    
    	    driver= df.initBrowseer(Browsername);  //Chrome //driver
    	    
    	    driver.manage().window().maximize();
    	    
    }
	@After
	public void teardown()
	{
		driver.quit();
	}
	
	@AfterStep
	public void postaction(io.cucumber.java.Scenario SC)  //Pass Fail
	{
		if(SC.isFailed())  //Pass==Fail--->fail(False)
			                //fail==fail--->pass(true)
		{
			byte[] Screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			SC.attach(Screenshot, "image/png", Screenshot.toString());
		}
	}
	
    
}
