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
import com.assetvantage.pageObjectClass.balanceSheetPage;
import com.assetvantage.pageObjectClass.generalLedger;
import com.assetvantage.pageObjectClass.homePageCommon;
import com.assetvantage.pageObjectClass.logInPage;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class balanceSheetVerification_Assetvantage extends browser {

	InterfaceAsaService log = new Log();
	InterfaceAsaService ss = new screenshotCapture();

	@Given("^user is logged into portal with \"(.*)\" and \"(.*)\"$") //
	public void loginToPortal(String username, String password) throws Exception {
		browser br = new browser();
		br.openBrowserandNavigate();
		log.info("Login page is displayed");
		ss.takeScreenShotofCurrentpage();
		logInPage lp = new logInPage(driver);
		lp.loginToApp(username, password);
		log.info("Login successful");
		ss.takeScreenShotofCurrentpage();
	}

	@When("^user Clicks on menu - General Ledger and clicks on Balance Sheet$")
	public void navigateToWealthRegister() {
		homePageCommon hpc = new homePageCommon(driver);
		hpc.clickOnMenuThenClickOnGeneralLedger();
	}

	@Then("^Balance Sheet page is displayed$")
	public void verifyWealthRegisterPage() {
		log.info("Page name is: " + driver.getTitle());
	}

	@Then("^user Search the details by entering correct entity and date and clicked on process$")
	public void searchForReport() {
		generalLedger gl = new generalLedger(driver);
		gl.clickOnBalanceSheet();
		balanceSheetPage bs = new balanceSheetPage(driver);
		bs.fetchReport();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("^All  Equities and Liabilities are displayed on page$")
	public void detailedReportIsDisplayed() {
		balanceSheetPage bs = new balanceSheetPage(driver);
		bs.expandTheReport();

	}

	@Then("^User verify the details with given JSON \"(.*)\"$")
	public void verifyReportWithJSON(String filePath) {
		balanceSheetPage bs = new balanceSheetPage(driver);
		bs.verifyBalanceSheetValues(filePath);
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
