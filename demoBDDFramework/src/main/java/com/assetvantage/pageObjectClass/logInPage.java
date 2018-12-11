package com.assetvantage.pageObjectClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assetvantage.baseClass.browser;
import com.assetvantage.commonUtils.Log;
import com.assetvantage.interfaces.InterfaceAsaService;

public class logInPage extends browser {
	
	InterfaceAsaService log = new Log();
	
	public logInPage(WebDriver driver) {
		browser.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement userId;
	@FindBy(name = "password")
	WebElement userPass;
	@FindBy(css = "input.btn.btn-primary.btn-block")
	WebElement nextButton;
	@FindBy(css = "input.btn.btn-primary.btn-block")
	WebElement loginButton;

	protected synchronized WebElement getUserId() {
		return userId;
	}

	protected synchronized WebElement getUserPass() {
		return userPass;
	}

	protected synchronized WebElement getNextButton() {
		return nextButton;
	}

	protected synchronized WebElement getLoginButton() {
		return loginButton;
	}

	protected synchronized void setUserId(WebElement userId) {
		this.userId = userId;
	}

	protected synchronized void setUserPass(WebElement userPass) {
		this.userPass = userPass;
	}

	protected synchronized void setNextButton(WebElement nextButton) {
		this.nextButton = nextButton;
	}

	protected synchronized void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public void loginToApp(String userName, String password) throws IOException {
		getUserId().sendKeys(userName);
		getNextButton().click();
		getUserPass().sendKeys(password);
		getLoginButton().click();
		log.info("Login Successful");
	}
}
