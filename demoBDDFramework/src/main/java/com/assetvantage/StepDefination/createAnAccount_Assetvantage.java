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
import com.assetvantage.pageObjectClass.accountsPage;
import com.assetvantage.pageObjectClass.homePageCommon;
import com.assetvantage.pageObjectClass.master;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class createAnAccount_Assetvantage extends browser {

	InterfaceAsaService log = new Log();
	InterfaceAsaService ss = new screenshotCapture();

	
	@Given("^user navigates to menu- master - accounts$")
	public void user_navigates_to_menu_master_accounts() {
		homePageCommon hpc = new homePageCommon(driver);
		hpc.clickOnMenuThenClickOnMaster();
		master m = new master(driver);
		m.clickOnAccounts();
		accountsPage ap = new accountsPage(driver);
		ap.custodian_AccountAdd();

	}

	@Then("^verify that user is able to create account$")
	public void verify_that_user_is_able_to_create_account() {
		accountsPage ap = new accountsPage(driver);
		ap.viewCreatedAccount();
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
