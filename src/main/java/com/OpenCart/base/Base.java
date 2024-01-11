package com.OpenCart.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.OpenCart.pages.LoginPage;

public class Base {
	
	public WebDriver driver;
	public LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
