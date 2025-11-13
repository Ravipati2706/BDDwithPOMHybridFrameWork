package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {
	
	private WebDriver driver;
	/* private By Adminmodule = By.xpath("//span[text()='Admin']"); */
	private By Adminsection = By.xpath("//nav[@class='oxd-topbar-body-nav']//ul//li");
	
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public String getAdminPageTitle() {
		return driver.getTitle();
	}
	/*
	 * public void GotoAdminSection() { driver.findElement(Adminmodule).click(); }
	 */
	
	public int getAdminSectionCount() {
		return driver.findElements(Adminsection).size();
	}
	
	public List<String> getAdminSectionList() {
		List<String> Adlist = new ArrayList<>();
		List<WebElement> AdHeaderlist = driver.findElements(Adminsection);
		for(WebElement e : AdHeaderlist) {
			String text = e.getText();
			System.out.println(text);
			Adlist.add(text);
		}
		
		return Adlist;
	}

}
