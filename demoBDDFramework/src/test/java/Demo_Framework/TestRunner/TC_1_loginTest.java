package Demo_Framework.TestRunner;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.assetvantage.baseClass.browser;
import com.assetvantage.commonUtils.Log;
import com.assetvantage.commonUtils.cucumberReportAfterExecution;
import com.assetvantage.interfaces.InterfaceAsaService;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = "D:\\EclipseWorkspace\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\featureFile", //logIn.feature", //the path of the feature files
		glue={"com.assetvantage"}, //the path of the step definition files
		plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false, //to check the mapping is proper between feature file and step def file
		tags = "@SmokeTest" //{ "~@RegressionTest", "~@End2End"}			
		)

public class TC_1_loginTest {
	

	private TestNGCucumberRunner testNGCucumberRunner;

	InterfaceAsaService log = new Log();
	@Parameters({"browser"})
    @BeforeClass(alwaysRun = true)
    public void setUpClass(String browser) throws Exception {
    	BasicConfigurator.configure();
    	log.startTestCase(getClass().getName());
    	browser br = new browser();
		br.openBrowserandNavigate(browser);
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
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
		
		cucumberReportAfterExecution crae = new cucumberReportAfterExecution();
		testNGCucumberRunner.finish();

	}
}
