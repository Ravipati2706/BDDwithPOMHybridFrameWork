package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators: OR(object repository)
	private By Username = By.name("username");
	private By Password = By.name("password");
	private By LoginButton = By.xpath("//button[@type='submit']");
	private By forgotPwdLink = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
		
	}

	public void enterUserName(String username) {
		driver.findElement(Username).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(Password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(LoginButton).click();
	}
	
	public AdminPage doLogin(String usn, String pwd) {
		System.out.println("Login with: " + usn + " and " + pwd);
		driver.findElement(Username).sendKeys(usn);
		driver.findElement(Password).sendKeys(pwd);
		driver.findElement(LoginButton).click();
		return new AdminPage(driver);
		
		
	}
}
