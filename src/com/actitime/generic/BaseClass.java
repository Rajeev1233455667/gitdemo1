package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static WebDriver driver;
	@BeforeTest
	
	public void openBrowser() {
		Reporter.log("openBrowser", true);
		 driver=new ChromeDriver();
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closeBrowser", true);	
		driver.close();
	}
		@BeforeMethod
		public void login() {
			Reporter.log("login", true);		
	}
		@AfterMethod
		public void logout() {
			Reporter.log("logout", true);	
		

}
}
