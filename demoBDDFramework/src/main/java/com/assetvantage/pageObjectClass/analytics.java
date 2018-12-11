package com.assetvantage.pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetvantage.baseClass.browser;

public class analytics {

	public analytics(WebDriver driver) {
		browser.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Consolidated Performance
	@FindBy(css = "#wealthregister")
	WebElement wealthRegisterLink;
	@FindBy(css = "#portfolioperformance")
	WebElement portFolioPerformance;
	@FindBy(xpath = "//*[@id='slidemenu']/ul/li[4]")
	WebElement assetAllocation;
	@FindBy(css = "#GainsReport")
	WebElement gainsReport;
	@FindBy(xpath = "//*[@id='slidemenu']/ul/li[6]/a")
	WebElement incomeAndExpense;

//Asset Class Performance
	protected synchronized WebElement getWealthRegisterLink() {
		return wealthRegisterLink;
	}

	protected synchronized void setWealthRegisterLink(WebElement wealthRegisterLink) {
		this.wealthRegisterLink = wealthRegisterLink;
	}

	public void clickOnWealthRegisterLink() {
		getWealthRegisterLink().click();
	}

} // End of class
