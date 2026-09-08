package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		
	     //feature="path of Apptestfolder"
			
			features="C:\\Users\\Ritesh Pise\\eclipse-workspace\\21_March_BDD_Framework\\src\\test\\resources\\Apptestfolder",
			
			//glue="packagename of AppStepDef" and package name of Hooks 
			
			glue={"AppStepDef","Hooks"},
	//plugin = {"pretty"} : prints the execution results in a clean, readable format in the console.
			
		 plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}
			)

public class RunnerClass extends AbstractTestNGCucumberTests
{

}
