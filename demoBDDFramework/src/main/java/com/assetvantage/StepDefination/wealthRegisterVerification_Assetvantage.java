package com.assetvantage.StepDefination;

import com.assetvantage.baseClass.browser;
import com.assetvantage.commonUtils.Log;
import com.assetvantage.commonUtils.screenshotCapture;
import com.assetvantage.interfaces.InterfaceAsaService;
import com.assetvantage.pageObjectClass.analytics;
import com.assetvantage.pageObjectClass.homePageCommon;
import com.assetvantage.pageObjectClass.logInPage;
import com.assetvantage.pageObjectClass.wealthRegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class wealthRegisterVerification_Assetvantage extends browser {

	InterfaceAsaService log=new Log();
	InterfaceAsaService ss=new screenshotCapture();
	
	@Given("^user logs into portal with \"(.*)\" and \"(.*)\"$")            //  \"(.*)\"
	public void loginToPortal(String username, String password) throws Exception {   
		browser br=new browser();
		br.openBrowserandNavigate();
		log.info("Login page is displayed");
		ss.takeScreenShotofCurrentpage();
		logInPage lp=new logInPage(driver);
		lp.loginToApp(username, password);
		log.info("Login successful");
		ss.takeScreenShotofCurrentpage();
	}
	@When("^user clicks on menu - analytics and clicks on wealth register$")
	public void navigateToWealthRegister() {
		homePageCommon hpc=new homePageCommon(driver);
		hpc.clickOnMenuThenClickOnAnalytics();
	}
	@Then("^wealth register page is displayed$")
	public void verifyWealthRegisterPage() {
		log.info("Page name is: "+driver.getTitle());
	}
	@Then("^user search the details by entering correct entity and date and clicked on process$")
	public void searchForReport() {
		analytics a=new analytics(driver);
		a.clickOnWealthRegisterLink();
		wealthRegisterPage wrp=new wealthRegisterPage(driver);
		wrp.fetchReport();
	}
	@Then("^All Denominated Assets are displayed on page$")
	public void detailedReportIsDisplayed() {
		
	}
	@Then("^user verify the details with given JSON$")
	public void verifyReportWithJSON() {
		
	}
	
	
	
	
	
	

}
