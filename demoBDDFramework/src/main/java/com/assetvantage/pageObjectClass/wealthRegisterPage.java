package com.assetvantage.pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetvantage.baseClass.browser;

public class wealthRegisterPage extends browser {

	public wealthRegisterPage(WebDriver driver) {
		browser.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='select2-selection__rendered' and contains(@title,'QA Aniket Patil')]")
	WebElement entityOrgroups;
	@FindBy(xpath = "//*[@class='select2-selection__rendered' and contains(@title,'QA Aniket Patil')]")
	WebElement entityOrgroupsListDropdown;
	@FindBy(css = "input#txntodate.txntodate.hasDatepicker")
	WebElement selectDate;
	@FindBy(css = "button#go.goslidein.btn.btn-small.btn-primary.pull-left")
	WebElement processButton;

	protected synchronized WebElement getEntityOrgroups() {
		return entityOrgroups;
	}

	protected synchronized WebElement getSelectDate() {
		return selectDate;
	}

	protected synchronized WebElement getProcessButton() {
		return processButton;
	}

	protected synchronized void setEntityOrgroups(WebElement entityOrgroups) {
		this.entityOrgroups = entityOrgroups;
	}

	protected synchronized void setSelectDate(WebElement selectDate) {
		this.selectDate = selectDate;
	}

	protected synchronized void setProcessButton(WebElement processButton) {
		this.processButton = processButton;
	}

	public void fetchReport() {
		getProcessButton().click();
	}
} // End of class
