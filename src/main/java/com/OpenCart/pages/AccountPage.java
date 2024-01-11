package com.OpenCart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OpenCart.base.Base;

public class AccountPage extends Base {

	@FindBy(xpath="//input[@class=\"form-control input-lg\"]")
	WebElement searchBox;

	public AccountPage() {
	PageFactory.initElements(driver, this);
	
	}
	public void searchBox() {
		searchBox.sendKeys("iphone");
	}
	
	@FindBy(xpath="//button[@class=\"btn btn-default btn-lg\"]")
	WebElement searchBtn;
	
	public IphonePage searchBtn() {
		searchBtn.click();
		return new IphonePage();
	}
	
	
	
}
