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
import com.assetvantage.commonUtils.textGenerator;
import com.assetvantage.interfaces.InterfaceAsaService;

public class homePage_Entity extends browser {
	InterfaceAsaService log = new Log();
	InterfaceAsaService screenshot = new screenshotCapture();

	public homePage_Entity(WebDriver driver) {
		browser.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='go']/span")
	WebElement okSign;
	@FindBy(xpath = "//*[@id='load']/i")
	WebElement plusButton;
	@FindBy(xpath = "//*[@id='btnDeleteRow']/i")
	WebElement deleteButton;
	@FindBy(css = "span#select2-txtentityorgroup-container.select2-selection__rendered")
	WebElement entityDropdownLeftSide;
	@FindBy(css = "span#select2-txtentitytype-container.select2-selection__rendered")
	WebElement entityType;
	@FindBy(css = "span#select2-txtdefaultshare-container.select2-selection__rendered")
	WebElement defaultShare;
	@FindBy(xpath = "//*[@id='txtfirstname']")
	WebElement entityName1;
	@FindBy(xpath = "//*[@id='txtmiddlename']")
	WebElement entityName2;
	@FindBy(xpath = "//*[@id='txtlastname']")
	WebElement entityName3;
	@FindBy(xpath = "//*[@name='txtdisplayname']")
	WebElement displayName;
	@FindBy(xpath = "//*[@id='txttaxid']")
	WebElement entityTaxId;
	@FindBy(xpath = "//*[@id='txtpancard']")
	WebElement txtpancard;
	@FindBy(xpath = "//*[@id='txtaddress']")
	WebElement txtaddress;
	@FindBy(xpath = "//*[@id='txtemail']")
	WebElement txtemail;
	@FindBy(xpath = "//*[@id='saveButton']")
	WebElement saveButton;
	@FindAll({ @FindBy(css = ".select2-results__option") })
	List<WebElement> entityTypeDropdownList;

	protected synchronized WebElement getOkSign() {
		return okSign;
	}

	protected synchronized WebElement getPlusButton() {
		return plusButton;
	}

	protected synchronized WebElement getDeleteButton() {
		return deleteButton;
	}

	protected synchronized WebElement getEntityDropdownLeftSide() {
		return entityDropdownLeftSide;
	}

	protected synchronized WebElement getEntityType() {
		return entityType;
	}

	protected synchronized WebElement getDefaultShare() {
		return defaultShare;
	}

	protected synchronized WebElement getEntityName1() {
		return entityName1;
	}

	protected synchronized WebElement getEntityName2() {
		return entityName2;
	}

	protected synchronized WebElement getEntityName3() {
		return entityName3;
	}

	protected synchronized WebElement getDisplayName() {
		return displayName;
	}

	protected synchronized WebElement getEntityTaxId() {
		return entityTaxId;
	}

	protected synchronized WebElement getTxtpancard() {
		return txtpancard;
	}

	protected synchronized WebElement getTxtaddress() {
		return txtaddress;
	}

	protected synchronized WebElement getTxtemail() {
		return txtemail;
	}

	protected synchronized WebElement getSaveButton() {
		return saveButton;
	}

	protected synchronized List<WebElement> getEntityTypeDropdownList() {
		return entityTypeDropdownList;
	}

	protected synchronized void setOkSign(WebElement okSign) {
		this.okSign = okSign;
	}

	protected synchronized void setPlusButton(WebElement plusButton) {
		this.plusButton = plusButton;
	}

	protected synchronized void setDeleteButton(WebElement deleteButton) {
		this.deleteButton = deleteButton;
	}

	protected synchronized void setEntityDropdownLeftSide(WebElement entityDropdownLeftSide) {
		this.entityDropdownLeftSide = entityDropdownLeftSide;
	}

	protected synchronized void setEntityType(WebElement entityType) {
		this.entityType = entityType;
	}

	protected synchronized void setDefaultShare(WebElement defaultShare) {
		this.defaultShare = defaultShare;
	}

	protected synchronized void setEntityName1(WebElement entityName1) {
		this.entityName1 = entityName1;
	}

	protected synchronized void setEntityName2(WebElement entityName2) {
		this.entityName2 = entityName2;
	}

	protected synchronized void setEntityName3(WebElement entityName3) {
		this.entityName3 = entityName3;
	}

	protected synchronized void setDisplayName(WebElement displayName) {
		this.displayName = displayName;
	}

	protected synchronized void setEntityTaxId(WebElement entityTaxId) {
		this.entityTaxId = entityTaxId;
	}

	protected synchronized void setTxtpancard(WebElement txtpancard) {
		this.txtpancard = txtpancard;
	}

	protected synchronized void setTxtaddress(WebElement txtaddress) {
		this.txtaddress = txtaddress;
	}

	protected synchronized void setTxtemail(WebElement txtemail) {
		this.txtemail = txtemail;
	}

	protected synchronized void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}

	protected synchronized void setEntityTypeDropdownList(List<WebElement> entityTypeDropdownList) {
		this.entityTypeDropdownList = entityTypeDropdownList;
	}

	public void createAnEntity(String entityTypeName, String firstName, String displayName, String taxId) throws IOException {
		// getOkSign().click();
		getPlusButton().click();
		log.info("Clicked on plus button");
		getEntityType().click();
		for (WebElement e : getEntityTypeDropdownList()) {
			if (e.getText().equalsIgnoreCase(entityTypeName)) {
				e.click();
				break;
			}
		}
		getEntityName1().sendKeys(firstName);
		getEntityName2().sendKeys(textGenerator.getText());
		getEntityName3().sendKeys(textGenerator.getText());
		getDisplayName().sendKeys(displayName);
		getEntityTaxId().sendKeys(taxId);
		screenshot.takeScreenShotofCurrentpage();
		getSaveButton().click();
		log.info("Created an Entity");
	}
}
