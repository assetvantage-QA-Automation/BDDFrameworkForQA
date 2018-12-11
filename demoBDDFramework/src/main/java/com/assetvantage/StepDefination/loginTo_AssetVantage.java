package com.assetvantage.StepDefination;

import java.io.IOException;

import org.testng.Assert;

import com.assetvantage.baseClass.browser;
import com.assetvantage.commonUtils.Log;
import com.assetvantage.commonUtils.screenshotCapture;
import com.assetvantage.interfaces.InterfaceAsaService;
import com.assetvantage.pageObjectClass.logInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginTo_AssetVantage extends browser{
	
	InterfaceAsaService log=new Log();
	InterfaceAsaService ss=new screenshotCapture();

	
	@Given("^user is on login page$")
    public void gotoLoginPage() throws Exception 
    {
		browser br=new browser();
		br.openBrowserandNavigate();
		log.info("Login page is displayed");
		ss.takeScreenShotofCurrentpage();
    }

	@When("^user throws \"(.*)\" and \"(.*)\" and click on Login button$")
	public void loginWithCredentials(String username, String password) throws IOException         // \"(.*)\"
	{
		logInPage lp=new logInPage(driver);
		lp.loginToApp(username, password);
		log.info("Login successful");
		ss.takeScreenShotofCurrentpage();
	}
	
	@Then("^Asset Vantage home page is displayed$")
	public void verifyPageName()
	{
		log.info(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Asset Vantage: Expected Data Automation (staging)"), "test success");
	}





} //end of class
