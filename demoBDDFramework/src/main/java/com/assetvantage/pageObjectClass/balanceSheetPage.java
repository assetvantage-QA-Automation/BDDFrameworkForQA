package com.assetvantage.pageObjectClass;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.assetvantage.baseClass.browser;
import com.assetvantage.commonUtils.Log;
import com.assetvantage.commonUtils.readJSON_file;
import com.assetvantage.interfaces.InterfaceAsaService;

public class balanceSheetPage extends browser {

	InterfaceAsaService log = new Log();

	public balanceSheetPage(WebDriver driver) {
		browser.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button#go.goslidein.btn.btn-small.btn-primary.pull-left")
	WebElement processButton;
	@FindBy(xpath = "//*[@class='select2-selection__rendered' and contains(@title,'QA Aniket Patil')]")
	WebElement entityOrgroups;
	@FindBy(xpath = "//*[@class='select2-selection__rendered' and contains(@title,'QA Aniket Patil')]")
	WebElement entityOrgroupsListDropdown;
	@FindBy(css = ".glyphicons.glyphicons-fit-image-to-frame")
	WebElement selectDate;
	@FindBy(xpath = "//button[@id='btnExpandAll' and @title='Expand All']")
	WebElement expandAll;
	@FindAll({ @FindBy(xpath = "//*[@class='fancytree-expander' and @role='button']") })
	List<WebElement> expanderSmallButtons;

	// Common locator for all Row verification
	@FindAll({ @FindBy(css = ".fancytree-title") })
	List<WebElement> productNames;

	// Common locator for ENTIRE Row verification
	@FindAll({ @FindBy(xpath = "//tr[@role='row']/td[5]") })
	List<WebElement> valuation;
	@FindAll({ @FindBy(xpath = "//td[contains(@class,'costBasis')]") })
	List<WebElement> costBasis;
	@FindAll({ @FindBy(xpath = "//tr[@role='row']/td[7]") })
	List<WebElement> difference;
	// rnd

	@FindAll({ @FindBy(xpath = "//tr[@role='row']") })
	List<WebElement> allRows;

	protected synchronized InterfaceAsaService getLog() {
		return log;
	}

	protected synchronized WebElement getProcessButton() {
		return processButton;
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

	protected synchronized WebElement getExpandAll() {
		return expandAll;
	}

	protected synchronized List<WebElement> getExpanderSmallButtons() {
		return expanderSmallButtons;
	}

	protected synchronized List<WebElement> getProductNames() {
		return productNames;
	}

	protected synchronized List<WebElement> getValuation() {
		return valuation;
	}

	protected synchronized List<WebElement> getCostBasis() {
		return costBasis;
	}

	protected synchronized List<WebElement> getDifference() {
		return difference;
	}

	protected synchronized List<WebElement> getAllRows() {
		return allRows;
	}

	protected synchronized void setLog(InterfaceAsaService log) {
		this.log = log;
	}

	protected synchronized void setProcessButton(WebElement processButton) {
		this.processButton = processButton;
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

	protected synchronized void setExpandAll(WebElement expandAll) {
		this.expandAll = expandAll;
	}

	protected synchronized void setExpanderSmallButtons(List<WebElement> expanderSmallButtons) {
		this.expanderSmallButtons = expanderSmallButtons;
	}

	protected synchronized void setProductNames(List<WebElement> productNames) {
		this.productNames = productNames;
	}

	protected synchronized void setValuation(List<WebElement> valuation) {
		this.valuation = valuation;
	}

	protected synchronized void setCostBasis(List<WebElement> costBasis) {
		this.costBasis = costBasis;
	}

	protected synchronized void setDifference(List<WebElement> difference) {
		this.difference = difference;
	}

	protected synchronized void setAllRows(List<WebElement> allRows) {
		this.allRows = allRows;
	}

	public void fetchReport() {
		getProcessButton().click();

	}

	public void expandTheReport() {
		getExpandAll().click();
//		for (WebElement e : getExpanderSmallButtons()) {
//			e.click();
//			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//			log.info("Clicked on Expand button");
//		}

	}

	public void verifyBalanceSheetValues(String JSONpath) {
		int counter=0;
		for (int i=0;i<getAllRows().size();i++) {
			String productName=getProductNames().get(i).getText().toString();
			System.out.print(productName+ " ===================>         ");
			
			String valuation=getValuation().get(i).getText().replace(",","");
			double valuationF=Double.parseDouble(valuation);
			System.out.print(valuationF+ "  ");
			
			String costBasis=getCostBasis().get(i).getText().replace(",","");
			double costBasisF=Double.parseDouble(costBasis);
			System.out.print(costBasisF+ "  ");
			
			String difference=getCostBasis().get(i).getText().replace(",","");
			double differenceF=Double.parseDouble(difference);
			System.out.print(differenceF+ "  ");
			
			readJSON_file rj=new readJSON_file();
			rj.readJson(JSONpath, counter,productName , valuationF,costBasisF, differenceF);
			
			counter++;
			
			System.out.println("Verification completed for ROW NUMBER: "+counter);
			System.out.println();
			//if(counter==2) break;
		}
	}

}
