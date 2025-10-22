package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage {
	WebDriver driver;

	/*
	 * PageFactory or ObjectRepository using @FindBy annotation we identified the
	 * webelements it means I have creted the page factory and then i need to
	 * initialize these elements
	 */

	/*
	 * @FindBy(xpath = "//td[contains(text(),'CRMPRO')]") WebElement HomePageTitle;
	 */

	@FindBy(xpath = "//td[@class='headertext'][1]")
	WebElement Name;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement Contactslink;

	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement Dealslink;

	@FindBy(xpath = "//a[contains(text(),'Companies')]")
	WebElement Companieslink;

//Initializing the above page objects webelements using PageFactory method

	public HomePage() throws IOException {

		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();

	}

	public boolean verifyCorrectusername() {
		return Name.isDisplayed();
	}

	public void clickonNewContactLink() {
		Actions ac = new Actions(driver);
		ac.moveToElement(Contactslink).build().perform();
		newContactLink.click();
	}

}
