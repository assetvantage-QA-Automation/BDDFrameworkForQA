package com.assetvantage.commonUtils;

import java.io.File;
import java.net.InetAddress;
import com.assetvantage.baseClass.browser;
import com.cucumber.listener.Reporter;

public class cucumberReportAfterExecution extends browser {

	public cucumberReportAfterExecution() throws Exception  {
		Reporter.loadXMLConfig(new File(
				"C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\configFiles\\extent-config.xml"));
		Reporter.addScenarioLog("User Name ------------> " + System.getProperty("user.name"));
		Reporter.addScenarioLog("Time Zone ------------> " + System.getProperty("user.timezone"));
		Reporter.addScenarioLog(
				"Machine -------------->" + "Processors Identifier : " + System.getenv("PROCESSOR_IDENTIFIER") + "\n"
						+ "Processors Arc1 --------------> : " + System.getenv("PROCESSOR_ARCHITECTURE") + "\n"
						+ "Processors Arc2 --------------> : " + System.getenv("PROCESSOR_ARCHITEW6432") + "\n"
						+ "Number of Processors --------------> : " + System.getenv("NUMBER_OF_PROCESSORS"));
		Reporter.addScenarioLog("Selenium ------------->" + " 3.7.0");
		Reporter.addScenarioLog("IP Address ----------------> " + InetAddress. getLocalHost());
		Reporter.addScenarioLog("Java Version ---------> " + System.getProperty("java.version"));
		//Reporter.addScenarioLog("Browser Name ---------> " + System.getenv("CBT_BROWSER").toUpperCase());
		teardown();

	}

}
