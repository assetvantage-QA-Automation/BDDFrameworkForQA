package com.assetvantage.pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetvantage.baseClass.browser;
import com.assetvantage.commonUtils.Log;
import com.assetvantage.commonUtils.screenshotCapture;
import com.assetvantage.commonUtils.textGenerator;
import com.assetvantage.interfaces.InterfaceAsaService;

public class accountsPage {

	InterfaceAsaService log = new Log();
	InterfaceAsaService screenshot = new screenshotCapture();

	public accountsPage(WebDriver driver) {
		browser.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "i.glyphicons.glyphicons-plus")
	WebElement plusButton;
	@FindBy(xpath = "//*[@id='go' and @tabindex]")
	WebElement okButton;
	@FindBy(css = "span#select2-txttype-container.select2-selection__rendered	")
	WebElement accountType;
	@FindBy(css = "span#select2-txtentity-container.select2-selection__rendered") // to select dropdown
																					// "//*[@id='templateSelect' and
																					// contains(@Text,'Test')]"
	WebElement firstHolderName;
	@FindBy(css = "input#txtname.accName.account_element.ta_add_name")
	WebElement accountName;
	@FindBy(css = "input#txtaccountnumber.account_element.ta_add_accountnumber")
	WebElement accountNumber;
	@FindBy(css = "span#select2-txtcurrency-container.select2-selection__rendered")
	WebElement currency;
	@FindBy(css = "span#select2-txtfor-container.select2-selection__rendered")
	WebElement For;
	@FindBy(xpath = "//*[@class='select2-results__option' and contains(@title,'Bank A')]")
	WebElement ForDropdownlist;
	@FindBy(css = "span#select2-txtshortcode-container.select2-selection__rendered")
	WebElement shortCode;
	@FindBy(xpath = "//*[@class='select2-results__option' and @title='CA']")
	WebElement shortCodeDropdownList;
	@FindBy(css = "#txtdisplayname")
	WebElement displayName;
	@FindBy(css = "span#select2-txtdefaultlot-container.select2-selection__rendered")
	WebElement defaultLotRelief;
	@FindBy(css = "span#select2-txtdefaultbankacc-container.select2-selection__rendered")
	WebElement default_Payee_Payor_Bank_Account;
	@FindBy(xpath = "//*[@class='select2-results__option' and contains(@title,'Ab')]")
	WebElement default_Payee_Payor_Bank_AccountDropDownList;

	@FindBy(css = "button#saveButton.btn.pull-left.glyphicons.glyphicons-floppy-saved")
	WebElement saveButton111;
	@FindBy(css = "input#txt2ndholder.account_element.ta_add_twondholder")
	WebElement FndHolder;
	@FindBy(css = "input#txt3rdholder.account_element.ta_add_3rdholder")
	WebElement SeconddHolder;
	@FindBy(css = "input#txtnominee.account_element.ta_add_nominee")
	WebElement nominee;
	@FindBy(css = "input#txtopeningbalance.ta_add_openingbalance")
	WebElement openingBalance;
	@FindBy(css = "div#txtaddressacc.transaction-form-input.account_element")
	WebElement address;

	protected synchronized InterfaceAsaService getLog() {
		return log;
	}

	protected synchronized InterfaceAsaService getScreenshot() {
		return screenshot;
	}

	protected synchronized WebElement getPlusButton() {
		return plusButton;
	}

	protected synchronized WebElement getOkButton() {
		return okButton;
	}

	protected synchronized WebElement getAccountType() {
		return accountType;
	}

	protected synchronized WebElement getFirstHolderName() {
		return firstHolderName;
	}

	protected synchronized WebElement getAccountName() {
		return accountName;
	}

	protected synchronized WebElement getAccountNumber() {
		return accountNumber;
	}

	protected synchronized WebElement getCurrency() {
		return currency;
	}

	protected synchronized WebElement getFor() {
		return For;
	}

	protected synchronized WebElement getForDropdownlist() {
		return ForDropdownlist;
	}

	protected synchronized WebElement getShortCode() {
		return shortCode;
	}

	protected synchronized WebElement getShortCodeDropdownList() {
		return shortCodeDropdownList;
	}

	protected synchronized WebElement getDisplayName() {
		return displayName;
	}

	protected synchronized WebElement getDefaultLotRelief() {
		return defaultLotRelief;
	}

	protected synchronized WebElement getDefault_Payee_Payor_Bank_Account() {
		return default_Payee_Payor_Bank_Account;
	}

	protected synchronized WebElement getDefault_Payee_Payor_Bank_AccountDropDownList() {
		return default_Payee_Payor_Bank_AccountDropDownList;
	}

	protected synchronized WebElement getSaveButton111() {
		return saveButton111;
	}

	protected synchronized WebElement getFndHolder() {
		return FndHolder;
	}

	protected synchronized WebElement getSeconddHolder() {
		return SeconddHolder;
	}

	protected synchronized WebElement getNominee() {
		return nominee;
	}

	protected synchronized WebElement getOpeningBalance() {
		return openingBalance;
	}

	protected synchronized WebElement getAddress() {
		return address;
	}

	protected synchronized void setLog(InterfaceAsaService log) {
		this.log = log;
	}

	protected synchronized void setScreenshot(InterfaceAsaService screenshot) {
		this.screenshot = screenshot;
	}

	protected synchronized void setPlusButton(WebElement plusButton) {
		this.plusButton = plusButton;
	}

	protected synchronized void setOkButton(WebElement okButton) {
		this.okButton = okButton;
	}

	protected synchronized void setAccountType(WebElement accountType) {
		this.accountType = accountType;
	}

	protected synchronized void setFirstHolderName(WebElement firstHolderName) {
		this.firstHolderName = firstHolderName;
	}

	protected synchronized void setAccountName(WebElement accountName) {
		this.accountName = accountName;
	}

	protected synchronized void setAccountNumber(WebElement accountNumber) {
		this.accountNumber = accountNumber;
	}

	protected synchronized void setCurrency(WebElement currency) {
		this.currency = currency;
	}

	protected synchronized void setFor(WebElement for1) {
		For = for1;
	}

	protected synchronized void setForDropdownlist(WebElement forDropdownlist) {
		ForDropdownlist = forDropdownlist;
	}

	protected synchronized void setShortCode(WebElement shortCode) {
		this.shortCode = shortCode;
	}

	protected synchronized void setShortCodeDropdownList(WebElement shortCodeDropdownList) {
		this.shortCodeDropdownList = shortCodeDropdownList;
	}

	protected synchronized void setDisplayName(WebElement displayName) {
		this.displayName = displayName;
	}

	protected synchronized void setDefaultLotRelief(WebElement defaultLotRelief) {
		this.defaultLotRelief = defaultLotRelief;
	}

	protected synchronized void setDefault_Payee_Payor_Bank_Account(WebElement default_Payee_Payor_Bank_Account) {
		this.default_Payee_Payor_Bank_Account = default_Payee_Payor_Bank_Account;
	}

	protected synchronized void setDefault_Payee_Payor_Bank_AccountDropDownList(
			WebElement default_Payee_Payor_Bank_AccountDropDownList) {
		this.default_Payee_Payor_Bank_AccountDropDownList = default_Payee_Payor_Bank_AccountDropDownList;
	}

	protected synchronized void setSaveButton111(WebElement saveButton111) {
		this.saveButton111 = saveButton111;
	}

	protected synchronized void setFndHolder(WebElement fndHolder) {
		FndHolder = fndHolder;
	}

	protected synchronized void setSeconddHolder(WebElement seconddHolder) {
		SeconddHolder = seconddHolder;
	}

	protected synchronized void setNominee(WebElement nominee) {
		this.nominee = nominee;
	}

	protected synchronized void setOpeningBalance(WebElement openingBalance) {
		this.openingBalance = openingBalance;
	}

	protected synchronized void setAddress(WebElement address) {
		this.address = address;
	}

	public void custodian_AccountAdd() {

		getPlusButton().click();
		log.info("Clicked on Add account button");
		System.out.println(getAccountType().getText());
		getAccountName().sendKeys(textGenerator.getText());
		getAccountNumber().sendKeys(textGenerator.getText());
		System.out.println(getCurrency().getText());
		getFor().click();
		getForDropdownlist().click();
		getShortCode().click();
		getShortCodeDropdownList().click();
		getDefault_Payee_Payor_Bank_Account().click();
		getDefault_Payee_Payor_Bank_AccountDropDownList().click();
		getSaveButton111().click();
		log.info("Account creation completed");

	}

	public void viewCreatedAccount() {
		getOkButton().click();
	}
}// End of class
