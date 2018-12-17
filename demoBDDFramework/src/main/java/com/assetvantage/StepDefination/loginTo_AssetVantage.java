package com.assetvantage.StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import com.assetvantage.baseClass.browser;
import com.assetvantage.commonUtils.Log;
import com.assetvantage.commonUtils.screenshotCapture;
import com.assetvantage.interfaces.InterfaceAsaService;
import com.assetvantage.pageObjectClass.logInPage;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginTo_AssetVantage extends browser {

	InterfaceAsaService log = new Log();
	InterfaceAsaService ss = new screenshotCapture();

	@Given("^user is on login page$")
	public void gotoLoginPage() throws Exception {

		log.info("Login page is displayed");
		ss.takeScreenShotofCurrentpage();
	}

	@When("^user throws \"(.*)\" and \"(.*)\" and click on Login button$")
	public void loginWithCredentials(String username, String password) throws IOException // \"(.*)\"
	{
		logInPage lp = new logInPage(driver);
		lp.loginToApp(username, password);
		log.info("Login successful");
		ss.takeScreenShotofCurrentpage();
	}

	@Then("^Asset Vantage home page is displayed$")
	public void verifyPageName() {
		log.info(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Asset Vantage: Expected Data Automation (staging)"),
				"test success");
	}

	@After
	public void ifTestFails(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File sourcePath = ts.getScreenshotAs(OutputType.FILE);
				File destinationPath = new File(
						"C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\target\\cucumber-reports\\screenshots\\"
								+ screenshotName + ".png");
				FileUtils.copyFile(sourcePath, destinationPath);
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

} // end of class
