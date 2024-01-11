package com.OpenCart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OpenCart.base.Base;

public class LoginPage extends Base{

	@FindBy(id="input-email") 
	WebElement userName;
	
	@FindBy(name="password") 
	WebElement password;
	
	@FindBy(xpath="//input[@value=\"Login\"]") 
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()=\"Qafox.com\"]") 
	WebElement logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogo() {
		logo.isDisplayed();
		return true;
	}
	
	public AccountPage login(String usnName, String paswd) {
		userName.sendKeys(usnName);
		password.sendKeys(paswd);
		loginBtn.click();
		return new AccountPage();
	}
	
	
	
	
}
