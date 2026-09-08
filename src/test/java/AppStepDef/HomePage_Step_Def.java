package AppStepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM_Classes.HomePage;
import QA.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_Step_Def
{
	//Step Definition Class-1
	
	HomePage Hp= new HomePage(DriverFactory.getdriver());   //driver
	
	@Given("user is on the Home Page")
	public void user_is_on_the_home_page() 
	{
        WebDriver driver=DriverFactory.getdriver();  //driver
        driver.get("https://www.amahahealth.com/");
        System.out.println("Enter URL and Reached on Home Page");
     }

	@Then("HomePage title should be {string}")  //Amaha - Trusted Psychiatrists, Therapists & In-patient Care
	public void home_page_title_should_be(String TitleofWeb)   
	{
		String WebTitle=Hp.getTitleofApp();  //Amaha - Trusted Psychiatrists, Therapists & In-patient Care
		Assert.assertEquals(WebTitle, TitleofWeb);
		System.out.println("Webpage Tiitle: "+ WebTitle);
	}

	@Then("the application logo should be displayed")
	public void the_application_logo_should_be_displayed() throws InterruptedException 
	{
		Thread.sleep(2000);
        boolean LogoElement=Hp.verifyLogoofApp();
        Assert.assertTrue(LogoElement);
        System.out.println("Logo is Displayed");
                  
	}
	@Given("user clicks on Sign-in button")
	public void user_clicks_on_sign_in_button() throws InterruptedException 
	{
		Thread.sleep(2000);
       Hp.clickonsignInbutton();
       System.out.println("Clicked on Sign-In Button");
	}

	@When("user enters a valid {string} address")
	public void user_enters_a_valid_address(String EM) throws InterruptedException
	{
		Thread.sleep(2000);
		Hp.enterEmailAddress(EM); //
		System.out.println("Entered an Email");
	}

	@When("user clicks on Continue button")
	public void user_clicks_on_continue_button() throws InterruptedException 
	{
		Thread.sleep(2000);
		Hp.clickonContinueButton1();
		System.out.println("clicked on Continue Button");
	}

	@When("user clicks on the Use password to login link")
	public void user_clicks_on_the_use_password_to_login_link() throws InterruptedException 
	{
		Thread.sleep(2000);
		Hp.clickUsepasswordLoginLink();
		System.out.println("Clicked on Password Link");
	}

	@When("user enters a valid {string}")
	public void user_enters_a_valid(String PSW) throws InterruptedException 
	{
		Thread.sleep(2000);
		Hp.enterPassword(PSW);
		System.out.println("Entered Password");
	}

	@When("user click on Continue button")
	public void user_click_on_continue_button() throws InterruptedException 
	{
		   Thread.sleep(2000);
          Hp.clickContinueButton2();
		System.out.println("Clicked on Continue Button");
	}

	@Then("user is navigated to {string} page")
	public void user_is_navigated_to_page(String Webpagename) throws InterruptedException 
	{
		
		String NameofWebpage=Hp.verifyTherapistsdandPsychiatristsPage();
		Assert.assertEquals(NameofWebpage, Webpagename);
		System.out.println("Navigated to: " + NameofWebpage);
	}
}
