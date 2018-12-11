package com.assetvantage.pageObjectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetvantage.baseClass.browser;

public class homePageCommon extends browser {

	public homePageCommon(WebDriver driver) {
		browser.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "span.glyphicons.glyphicons-list-numbered")
	WebElement accounts;
	@FindBy(css = "span.glyphicon.glyphicon-map-marker")
	WebElement positions;
	@FindBy(css = "span.glyphicons.glyphicons-bell")
	WebElement notifications;
	@FindBy(css = "a#hamburgerslidingmenu")
	WebElement menu;
	@FindBy(css = "a#masters")
	WebElement menu_masters;
	@FindBy(css = "a#dashboard")
	WebElement menu_dashboard;
	@FindBy(css = "a#transaction")
	WebElement menu_transaction;
	@FindBy(css = "a#analytics")
	WebElement menu_analytics;
	@FindBy(css = "a#generalLedger")
	WebElement menu_generalLedger;
	@FindBy(css = "a#taxReports")
	WebElement menu_taxReports;
	@FindBy(css = "a#documents")
	WebElement menu_documents;
	@FindBy(xpath = "//*[@id='main-container']/div[1]/div[1]/ul/li[2]") // removed /a
	WebElement entity;
	@FindBy(xpath = "//*[@id='main-container']/div[1]/div[1]/ul/li[3]/a")
	WebElement syncAccounts;
	@FindBy(xpath = "//*[@id='main-container']/div[1]/div[1]/ul/li[4]/a")
	WebElement syncPostTransactions;
	@FindBy(css = "input#positionid.ta_add_positionid")
	WebElement invesmentSearch;

	// ****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************

	protected synchronized WebElement getAccounts() {
		return accounts;
	}

	protected synchronized WebElement getPositions() {
		return positions;
	}

	protected synchronized WebElement getNotifications() {
		return notifications;
	}

	protected synchronized WebElement getMenu() {
		return menu;
	}

	protected synchronized WebElement getMenu_masters() {
		return menu_masters;
	}

	protected synchronized WebElement getMenu_dashboard() {
		return menu_dashboard;
	}

	protected synchronized WebElement getMenu_transaction() {
		return menu_transaction;
	}

	protected synchronized WebElement getMenu_analytics() {
		return menu_analytics;
	}

	protected synchronized WebElement getMenu_generalLedger() {
		return menu_generalLedger;
	}

	protected synchronized WebElement getMenu_taxReports() {
		return menu_taxReports;
	}

	protected synchronized WebElement getMenu_documents() {
		return menu_documents;
	}

	protected synchronized WebElement getEntity() {
		return entity;
	}

	protected synchronized WebElement getSyncAccounts() {
		return syncAccounts;
	}

	protected synchronized WebElement getSyncPostTransactions() {
		return syncPostTransactions;
	}

	protected synchronized WebElement getInvesmentSearch() {
		return invesmentSearch;
	}

	protected synchronized void setAccounts(WebElement accounts) {
		this.accounts = accounts;
	}

	protected synchronized void setPositions(WebElement positions) {
		this.positions = positions;
	}

	protected synchronized void setNotifications(WebElement notifications) {
		this.notifications = notifications;
	}

	protected synchronized void setMenu(WebElement menu) {
		this.menu = menu;
	}

	protected synchronized void setMenu_masters(WebElement menu_masters) {
		this.menu_masters = menu_masters;
	}

	protected synchronized void setMenu_dashboard(WebElement menu_dashboard) {
		this.menu_dashboard = menu_dashboard;
	}

	protected synchronized void setMenu_transaction(WebElement menu_transaction) {
		this.menu_transaction = menu_transaction;
	}

	protected synchronized void setMenu_analytics(WebElement menu_analytics) {
		this.menu_analytics = menu_analytics;
	}

	protected synchronized void setMenu_generalLedger(WebElement menu_generalLedger) {
		this.menu_generalLedger = menu_generalLedger;
	}

	protected synchronized void setMenu_taxReports(WebElement menu_taxReports) {
		this.menu_taxReports = menu_taxReports;
	}

	protected synchronized void setMenu_documents(WebElement menu_documents) {
		this.menu_documents = menu_documents;
	}

	protected synchronized void setEntity(WebElement entity) {
		this.entity = entity;
	}

	protected synchronized void setSyncAccounts(WebElement syncAccounts) {
		this.syncAccounts = syncAccounts;
	}

	protected synchronized void setSyncPostTransactions(WebElement syncPostTransactions) {
		this.syncPostTransactions = syncPostTransactions;
	}

	protected synchronized void setInvesmentSearch(WebElement invesmentSearch) {
		this.invesmentSearch = invesmentSearch;
	}

	// ********************************************************************************************************************************************************************************************************************************

	public void clickOnEntityPresentOnHomepage() {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		getEntity().click();
	}

	private void clickonMenubutton() {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		getMenu().click();
	}

	public void clickOnMenuThenClickOnAnalytics() {
		clickonMenubutton();
		getMenu_analytics().click();
	}

	public void clickOnMenuThenClickOnMaster() {
		clickonMenubutton();
		getMenu_masters().click();

	}

}
