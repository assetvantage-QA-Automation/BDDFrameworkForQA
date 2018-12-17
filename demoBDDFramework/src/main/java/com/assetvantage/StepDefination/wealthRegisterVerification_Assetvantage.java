package com.assetvantage.StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import com.assetvantage.baseClass.browser;
import com.assetvantage.commonUtils.Log;
import com.assetvantage.commonUtils.screenshotCapture;
import com.assetvantage.interfaces.InterfaceAsaService;
import com.assetvantage.pageObjectClass.analytics;
import com.assetvantage.pageObjectClass.homePageCommon;
import com.assetvantage.pageObjectClass.logInPage;
import com.assetvantage.pageObjectClass.wealthRegisterPage;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class wealthRegisterVerification_Assetvantage extends browser {

	InterfaceAsaService log = new Log();
	InterfaceAsaService ss = new screenshotCapture();

	@Given("^user logs into portal with \"(.*)\" and \"(.*)\"$") // \"(.*)\"
	public void loginToPortal(String username, String password) throws Exception {

		logInPage lp = new logInPage(driver);
		lp.loginToApp(username, password);
		log.info("Login successful");
		ss.takeScreenShotofCurrentpage();
	}

	@When("^user clicks on menu - analytics and clicks on wealth register$")
	public void navigateToWealthRegister() {
		homePageCommon hpc = new homePageCommon(driver);
		hpc.clickOnMenuThenClickOnAnalytics();
	}

	@Then("^wealth register page is displayed$")
	public void verifyWealthRegisterPage() {
		log.info("Page name is: " + driver.getTitle());
	}

	@Then("^user search the details by entering correct entity and date and clicked on process$")
	public void searchForReport() throws IOException {
		analytics a = new analytics(driver);
		a.clickOnWealthRegisterLink();
		wealthRegisterPage wrp = new wealthRegisterPage(driver);
		wrp.fetchReport();
		ss.takeScreenShotofCurrentpage();
	}

	@Then("^All Denominated Assets are displayed on page$")
	public void detailedReportIsDisplayed() throws IOException, InterruptedException {
		wealthRegisterPage wrp = new wealthRegisterPage(driver);
		Thread.sleep(5000);
		wrp.expandTheReport();

	}

	@Then("^user verify the details with given JSON$")
	public void verifyReportWithJSON() {
		wealthRegisterPage wrp = new wealthRegisterPage(driver);
		wrp.getDetailsOfWealthRegister();

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

}
