package com.assetvantage.pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetvantage.baseClass.browser;

public class master extends browser {

	public master(WebDriver driver) {
		browser.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css = "div.panel-left.slidein")
	WebElement leftSideArrowButton;
//Accounts & Entity	
	@FindBy(css = "li.accountsact")
	WebElement Accounts;
	@FindBy(css = "")
	WebElement Address;
	@FindBy(css = "")
	WebElement chartOfAccount;
	@FindBy(css = "")
	WebElement checkBook;
	@FindBy(xpath = "//*[@id='main-container']/div[2]/div[1]/ul/li[6]")
	WebElement entityOrGroup;
	@FindBy(css = "")
	WebElement positions;
//Investments Master
	@FindBy(css = "")
	WebElement advisor;
	@FindBy(css = "")
	WebElement creditRating;
//Report Masters
	@FindBy(css = "")
	WebElement AlertNotificationSetup;

	protected synchronized WebElement getAccounts() {
		return Accounts;
	}

	protected synchronized WebElement getEntityOrGroup() {
		return entityOrGroup;
	}

	protected synchronized void setAccounts(WebElement accounts) {
		this.Accounts = accounts;
	}

	protected synchronized void setEntityOrGroup(WebElement entityOrGroup) {
		this.entityOrGroup = entityOrGroup;
	}

	public void clickOnAccounts() {
		getAccounts().click();
	}

	public void clickOnEntity() {
		getEntityOrGroup().click();
	}
}
