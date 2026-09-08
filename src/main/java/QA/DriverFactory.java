package QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory 
{

	   static WebDriver driver;
	   
	public WebDriver initBrowseer(String Browser)  //Chrome Firefox
	{
		   //Chrome
		if(Browser.equals("Chrome"))  //true
		{
			driver= new ChromeDriver();
		}
		else if (Browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		return driver;  //URL, Maximize, Minimize
	}
	
	public static WebDriver getdriver()
	{
		return driver;  //Only driver required
		
	}
	
}
