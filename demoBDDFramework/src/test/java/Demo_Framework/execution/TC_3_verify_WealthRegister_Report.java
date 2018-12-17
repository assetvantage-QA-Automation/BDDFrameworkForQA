package Demo_Framework.execution;

import java.io.File;
import java.net.InetAddress;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.assetvantage.baseClass.browser;
import com.assetvantage.commonUtils.Log;
import com.assetvantage.interfaces.InterfaceAsaService;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = "C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\featureFile\\wealthRegisterVerification.feature", //the path of the feature files
		glue={"com.assetvantage"}, //the path of the step definition files
		plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)

public class TC_3_verify_WealthRegister_Report extends browser {
    
	TestNGCucumberRunner testNGCucumberRunner;
    InterfaceAsaService log=new Log();
    
    
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
    	BasicConfigurator.configure();
    	log.startTestCase(getClass().getName());
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
	@Test(groups = "cucumber", description = "Check WR report", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {

		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		
	}
	
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
    
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
    	log.endTestCase(getClass().getName());
    	
    	Reporter.loadXMLConfig(new File("C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\configFiles\\extent-config.xml"));
    	Reporter.addScenarioLog("User Name ------------> "+ System.getProperty("user.name"));
	    Reporter.addScenarioLog("Time Zone ------------> "+ System.getProperty("user.timezone"));
	    Reporter.addScenarioLog("Machine -------------->"+ 	System.getenv("PROCESSOR_IDENTIFIER")+"\n"+System.getenv("PROCESSOR_ARCHITECTURE")+"\n"+System.getenv("PROCESSOR_ARCHITEW6432")+"\n"+ "Number of Processors"+System.getenv("NUMBER_OF_PROCESSORS"));
	    Reporter.addScenarioLog("Selenium ------------->"+ " 3.7.0");
	    Reporter.addScenarioLog("IP Address ----------------> "+ InetAddress. getLocalHost());
	    Reporter.addScenarioLog("Java Version ---------> "+ System.getProperty("java.version"));
	    testNGCucumberRunner.finish();
	    //driver.quit();
    }
}


	


