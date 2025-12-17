package com.qa.factory;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	/**
	 * This method is used to initialize the thradlocal driver on the basis of given
	 * browser why we used thread local concept means if we want excute in parllel
	 * mode we have to use thred local
	 * 
	 * @param browser
	 * @return this will return tldriver.
	 * @throws InterruptedException
	 */
	public WebDriver init_driver(String browser) throws InterruptedException {

		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else if (browser.equals("safari")) {
			tlDriver.set(new SafariDriver());
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}
		  getDriver().manage().deleteAllCookies();
		  getDriver().manage().window().maximize();
		 
		return getDriver();

	}

	/**
	 * this is used to get the driver with ThreadLocal
	 * 
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}
