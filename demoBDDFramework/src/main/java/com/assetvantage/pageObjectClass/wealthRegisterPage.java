package com.assetvantage.pageObjectClass;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetvantage.baseClass.browser;
import com.assetvantage.commonUtils.Log;
import com.assetvantage.commonUtils.screenshotCapture;
import com.assetvantage.interfaces.InterfaceAsaService;

public class wealthRegisterPage extends browser {

	InterfaceAsaService log = new Log();
	InterfaceAsaService screenshot = new screenshotCapture();

	public wealthRegisterPage(WebDriver driver) {
		browser.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(xpath = "//table[@class='table']//following-sibling::button[@id='expandExelId']") })
	List<WebElement> expandAll;
	@FindBy(xpath = "//*[@class='select2-selection__rendered' and contains(@title,'QA Aniket Patil')]")
	WebElement entityOrgroups;
	@FindBy(xpath = "//*[@class='select2-selection__rendered' and contains(@title,'QA Aniket Patil')]")
	WebElement entityOrgroupsListDropdown;
	@FindBy(css = "input#txntodate.txntodate.hasDatepicker")
	WebElement selectDate;
	@FindBy(css = "button#go.goslidein.btn.btn-small.btn-primary.pull-left")
	WebElement processButton;
	@FindAll({ @FindBy(xpath = "//*[contains(@class,'level') and contains(@id,'_')]") })
	List<WebElement> allRows;
	@FindAll({ @FindBy(xpath = "//*[contains(@class,'level') and contains(@id,'_')]/td[8]") })
	List<WebElement> purchaseValue;
	@FindAll({ @FindBy(xpath = "//*[contains(@class,'level') and contains(@id,'_')]/td[9]") })
	List<WebElement> valueOnToday;
	@FindAll({ @FindBy(xpath = "//*[contains(@class,'level') and contains(@id,'_')]/td[10]") })
	List<WebElement> unrealizedGainOrLossinINR;
	@FindAll({ @FindBy(xpath = "//*[contains(@class,'level') and contains(@id,'_')]/td[11]") })
	List<WebElement> unrealizedGainOrLossPercentage;
	@FindAll({ @FindBy(xpath = "//*[contains(@class,'level') and contains(@id,'_')]/td[2]") })
	List<WebElement> irrPercentage;
	@FindAll({ @FindBy(xpath = "//*[contains(@class,'level') and contains(@id,'_')]/td[1]") })
	List<WebElement> productName;
	@FindAll({ @FindBy(xpath = "//*[contains(@class,'level') and contains(@id,'_')]/td[4]") })
	List<WebElement> allocations;
	@FindAll({ @FindBy(xpath = "//*[contains(@class,'level') and contains(@id,'_')]/td[5]") })
	List<WebElement> quantity;

	
	
	protected synchronized List<WebElement> getExpandAll() {
		return expandAll;
	}

	protected synchronized WebElement getEntityOrgroups() {
		return entityOrgroups;
	}

	protected synchronized WebElement getEntityOrgroupsListDropdown() {
		return entityOrgroupsListDropdown;
	}

	protected synchronized WebElement getSelectDate() {
		return selectDate;
	}

	protected synchronized WebElement getProcessButton() {
		return processButton;
	}

	protected synchronized List<WebElement> getAllRows() {
		return allRows;
	}

	protected synchronized List<WebElement> getPurchaseValue() {
		return purchaseValue;
	}

	protected synchronized List<WebElement> getValueOnToday() {
		return valueOnToday;
	}

	protected synchronized List<WebElement> getUnrealizedGainOrLossinINR() {
		return unrealizedGainOrLossinINR;
	}

	protected synchronized List<WebElement> getUnrealizedGainOrLossPercentage() {
		return unrealizedGainOrLossPercentage;
	}

	protected synchronized List<WebElement> getIrrPercentage() {
		return irrPercentage;
	}

	protected synchronized List<WebElement> getProductName() {
		return productName;
	}

	protected synchronized List<WebElement> getAllocations() {
		return allocations;
	}

	protected synchronized List<WebElement> getQuantity() {
		return quantity;
	}

	
	protected synchronized void setExpandAll(List<WebElement> expandAll) {
		this.expandAll = expandAll;
	}

	protected synchronized void setEntityOrgroups(WebElement entityOrgroups) {
		this.entityOrgroups = entityOrgroups;
	}

	protected synchronized void setEntityOrgroupsListDropdown(WebElement entityOrgroupsListDropdown) {
		this.entityOrgroupsListDropdown = entityOrgroupsListDropdown;
	}

	protected synchronized void setSelectDate(WebElement selectDate) {
		this.selectDate = selectDate;
	}

	protected synchronized void setProcessButton(WebElement processButton) {
		this.processButton = processButton;
	}

	protected synchronized void setAllRows(List<WebElement> allRows) {
		this.allRows = allRows;
	}

	protected synchronized void setPurchaseValue(List<WebElement> purchaseValue) {
		this.purchaseValue = purchaseValue;
	}

	protected synchronized void setValueOnToday(List<WebElement> valueOnToday) {
		this.valueOnToday = valueOnToday;
	}

	protected synchronized void setUnrealizedGainOrLossinINR(List<WebElement> unrealizedGainOrLossinINR) {
		this.unrealizedGainOrLossinINR = unrealizedGainOrLossinINR;
	}

	protected synchronized void setUnrealizedGainOrLossPercentage(List<WebElement> unrealizedGainOrLossPercentage) {
		this.unrealizedGainOrLossPercentage = unrealizedGainOrLossPercentage;
	}

	protected synchronized void setIrrPercentage(List<WebElement> irrPercentage) {
		this.irrPercentage = irrPercentage;
	}

	protected synchronized void setProductName(List<WebElement> productName) {
		this.productName = productName;
	}

	protected synchronized void setAllocations(List<WebElement> allocations) {
		this.allocations = allocations;
	}

	protected synchronized void setQuantity(List<WebElement> quantity) {
		this.quantity = quantity;
	}

	public void fetchReport() throws IOException {
		getProcessButton().click();
		log.info("Clicked on process");
		screenshot.takeScreenShotofCurrentpage();
	}

	public void expandTheReport() throws IOException {
		getExpandAll().get(0).click();
		log.info("Clicked on Expand button");
		screenshot.takeScreenShotofCurrentpage();
	}

	public void getDetailsOfWealthRegister() {

		int count = 0;
		for (int i = 0; i < getAllRows().size(); i++) {
			String productName = getProductName().get(i).getText().toString();
			double IRR = Double.parseDouble(getIrrPercentage().get(i).getText().replace("%", ""));
			double allocation = Double.parseDouble(getAllocations().get(i).getText().replace("%", ""));
			double purchaseValue = Double.parseDouble(getPurchaseValue().get(i).getText().replace(",", ""));
			double valueOnToday = Double.parseDouble(getValueOnToday().get(i).getText().replace(",", ""));
			double unrealizedValue = Double
					.parseDouble(getUnrealizedGainOrLossinINR().get(i).getText().replace(",", ""));
			double unrealizedValuePercentage = Double
					.parseDouble(getUnrealizedGainOrLossPercentage().get(i).getText().replace("%", ""));

			System.out.println(productName + " " + IRR + " " + allocation + " " + purchaseValue + " " + valueOnToday
					+ " " + unrealizedValue + " " + unrealizedValuePercentage);
			count++;
			System.out.println("Completed verification of ROW No: " + count);
			try {
				screenshot.takeScreenShotofCurrentpage();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
} // End of class
