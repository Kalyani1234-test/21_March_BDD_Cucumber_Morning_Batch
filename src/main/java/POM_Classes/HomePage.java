package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//POM Class-1
	
	WebDriver driver;
	
	//1. Instance variables/ Data members should be declared globally with access level private by using @Findby Annotation
	//Instance variables= Non Static Variable
	//Data members= variables
	
	@FindBy(xpath="(//img[@alt='Amaha Logo'])[1]")private WebElement Logo;  //private WebElement Logo=driver.findElement(By.xpath="(//img[@alt='Amaha Logo'])[1]");
	
	@FindBy(css="#sign-in-btn") private WebElement Signinbtn;
	
	@FindBy(xpath="//input[@placeholder='Email address or Phone Number']") private WebElement EmailAddress;
	
	@FindBy(id="continue-btn") private WebElement ContinueBtn1;
	
	@FindBy(xpath="//h5[text()='Use password to login']") private WebElement PasswordLink;
	
	@FindBy(xpath="//input[@placeholder='Enter Password']") private WebElement Password;
	
	@FindBy(css="#password-continue-btn") private WebElement ContinueBtn2;
	//@FindBy(xpath="//button[text()='CONTINUE']") private WebElement ContinueBtn2;
	
	@FindBy(xpath="//span[text()='Therapists & Psychiatrists']") private WebElement TherapistsdandPsychiatrists;
	
     // @FindBy(xpath="(//span[@class='sc-iCECmn kniCY help-h5-m'])[2]") private WebElement TherapistsdandPsychiatrists;
	//2. Initialize within a constructor with access level public using PageFactory Class

	   public HomePage(WebDriver driver)
	   {
		   this.driver=driver;
		   
		   PageFactory.initElements(driver,this);
	   }

	  // 3. Utilize within a method with access level public

       public String getTitleofApp()
	   {
		  String title= driver.getTitle();  //Amaha - Trusted Psychiatrists, Therapists & In-patient Care
		  return title;
       }
		           
      public boolean verifyLogoofApp()
	   {
		   boolean logoelement= Logo.isDisplayed(); //true
		     return logoelement;
	   }
		          
      public void clickonsignInbutton()
      {
		 Signinbtn.click();           	  
      }
		           
      public void enterEmailAddress(String Email)
	  {
		EmailAddress.sendKeys(Email);
	  }
		          
      public void clickonContinueButton1()
	  {	        	       
    	     ContinueBtn1.click();           
	  }
		          
      public void clickUsepasswordLoginLink()           
      {        	       
    	     PasswordLink.click();          
      }
		     
      public void enterPassword(String Pass)
      {
    	     Password.sendKeys(Pass);
      }
      public void clickContinueButton2()           
      {            	  
    	     ContinueBtn2.click();           
      }           
      public String verifyTherapistsdandPsychiatristsPage()	          
      {	        	     
    	       String Page=TherapistsdandPsychiatrists.getText();        	    
            return Page;          
      }
		
		












}
