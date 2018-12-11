package com.assetvantage.StepDefination;

import com.assetvantage.baseClass.browser;
import com.assetvantage.commonUtils.Log;
import com.assetvantage.commonUtils.screenshotCapture;
import com.assetvantage.interfaces.InterfaceAsaService;
import com.assetvantage.pageObjectClass.accountsPage;
import com.assetvantage.pageObjectClass.homePageCommon;
import com.assetvantage.pageObjectClass.logInPage;
import com.assetvantage.pageObjectClass.master;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createAnAccount_Assetvantage extends browser {
	
	InterfaceAsaService log=new Log();
	InterfaceAsaService ss=new screenshotCapture();
	
	@Given("^user is able to login with \"(.*)\" and \"(.*)\"$")
	public void user_is_able_to_login(String username, String password) throws Exception {             //    \"(.*)\"
		browser br=new browser();
		br.openBrowserandNavigate();
		log.info("Login page is displayed");
		ss.takeScreenShotofCurrentpage();
		logInPage lp=new logInPage(driver);
		lp.loginToApp(username, password);
		log.info("Login successful");
		ss.takeScreenShotofCurrentpage();
	}
	
	@When("^user navigates to menu- master - accounts$")
	public void user_navigates_to_menu_master_accounts() {
		homePageCommon hpc=new homePageCommon(driver);
		hpc.clickOnMenuThenClickOnMaster();
		master m=new master(driver);
		m.clickOnAccounts();
		accountsPage ap=new accountsPage(driver);
		ap.custodian_AccountAdd();
		
	}
    
	@Then("^verify that user is able to create account$")
	public void verify_that_user_is_able_to_create_account() {
		accountsPage ap=new accountsPage(driver);
		ap.viewCreatedAccount();
	}
	
}
