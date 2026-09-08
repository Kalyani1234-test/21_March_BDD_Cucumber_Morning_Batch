package AppStepDef;

import java.util.List;

import org.openqa.selenium.WebDriver;
import POM_Classes.HomePage;
import POM_Classes.Therapists_and_Psychiatrists;
import QA.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Therapists_and_Psychiatrists_Step_Def 
{
	//Step Definition Class=2
	//Object of POM-1
	HomePage Hp1=new HomePage(DriverFactory.getdriver());  //driver
	 
	//Object of POM-2
	Therapists_and_Psychiatrists  Tp2=new Therapists_and_Psychiatrists (DriverFactory.getdriver()); //driver
	
	@Given("User is on the Therapists and Psychiatrists page")
	public void user_is_on_the_therapists_and_psychiatrists_page() throws InterruptedException 
	{
          WebDriver driver=DriverFactory.getdriver();
          driver.get("https://www.amahahealth.com/");
          
          Hp1.clickonsignInbutton();
          Thread.sleep(2000);
          
          Hp1.enterEmailAddress("atelkalyani25@gmail.com");
          Thread.sleep(2000);
          
          Hp1.clickonContinueButton1();
          Thread.sleep(2000);
           
          Hp1.clickUsepasswordLoginLink();
          Thread.sleep(2000);
         
          Hp1.enterPassword("Kallu@1234");
          Thread.sleep(2000);
          
          Hp1.clickContinueButton2();
          
          String text= Tp2.Applicationpage();  //Therapists & Psychiatrists
          System.out.println("Navigate to:"+text);
          
          
	}

	@When("User clicks on the Psychiatrist tab")
	public void user_clicks_on_the_psychiatrist_tab() 
	{
        Tp2.clickonPsychiatristTab();
        System.out.println("Clicked on Psychiatrists tab");

	}

	@Then("Psychiatrist list should be displayed")
	public void psychiatrist_list_should_be_displayed() 
	{
          List<String>  NameofDr= Tp2.Psychiatristlist();   //6 Dr name
                               //Dr Dean Creado       Dr Anjali Prakash
                              //Dr Khushboo Kansal   Dr Jeetinder Singh
                              //Dr Mihika Shidore   Dr Vani Kulhalli
          System.out.println("Name of Available Psychiatrist:"+NameofDr);

	}
}
