package com.assetvantage.pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetvantage.baseClass.browser;

public class generalLedger extends browser {

	public generalLedger(WebDriver driver) {
		browser.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators are visible after clicking on General Ledger
	@FindBy(xpath="//*[@id='main-container']/div[2]/div[1]/ul/li[1]")
	WebElement balanceSheet;
	@FindBy(xpath="//*[@id='main-container']/div[2]/div[1]/ul/li[2]")
	WebElement incomeStatement;
	@FindBy(xpath="//*[@id='main-container']/div[2]/div[1]/ul/li[3]")
	WebElement trialBalance;
	protected synchronized WebElement getBalanceSheet() {
		return balanceSheet;
	}
	protected synchronized WebElement getIncomeStatement() {
		return incomeStatement;
	}
	protected synchronized WebElement getTrialBalance() {
		return trialBalance;
	}
	protected synchronized void setBalanceSheet(WebElement balanceSheet) {
		this.balanceSheet = balanceSheet;
	}
	protected synchronized void setIncomeStatement(WebElement incomeStatement) {
		this.incomeStatement = incomeStatement;
	}
	protected synchronized void setTrialBalance(WebElement trialBalance) {
		this.trialBalance = trialBalance;
	}
	
	public void clickOnBalanceSheet() {
		getBalanceSheet().click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}// End of class
