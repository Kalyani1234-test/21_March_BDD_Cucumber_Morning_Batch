package POM_Classes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Therapists_and_Psychiatrists 
{
	   //POM Class-2
	
		WebDriver driver;   //driver
		
		//1. Instance variables/ Data members should be declared globally with access level private by using @Findby Annotation
		//Instance variables= Non Static Variable
		//Data members= variables
		
		@FindBy(xpath="//span[text()='Therapists & Psychiatrists']") private WebElement TP1;
		
		@FindBy(xpath="//span[text()='Psychiatrist']")private WebElement PsychiatristTab;
		
		@FindBy(xpath="//span[@class='sc-iCECmn llsPid prod-h1 ProfileCardNew__NameText-sc-a47aa7bb-11 eetdkP']") private List<WebElement>Psychiatristlist;

		//2. Initialize within a constructor with access level public using PageFactory Class

         public Therapists_and_Psychiatrists(WebDriver driver)
         {
        	        this.driver=driver;
        	 
        	      PageFactory.initElements(driver, this);
         }
       //3. Utilize within a method with access level public
         
         
         public String Applicationpage()
         {
        	        String pagetitle= TP1.getText();
        	         return pagetitle;
         }
         public void clickonPsychiatristTab()
         {
        	      PsychiatristTab.click();
         }
         public List<String> Psychiatristlist()
         {
        	    List<String> Allnames= new ArrayList<String>(); //Upcasting
        	                                   //Dr Dean Creado       Dr Anjali Prakash
        	                                   //Dr Khushboo Kansal   Dr Jeetinder Singh
        	                                    //Dr Mihika Shidore   Dr Vani Kulhalli
            for(WebElement Psychiatrist: Psychiatristlist)
        	   {
        	         String name=Psychiatrist.getText();
        	          Allnames.add(name);
            }
            
            return Allnames;
         }
 
         
}
