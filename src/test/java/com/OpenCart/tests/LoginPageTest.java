package com.OpenCart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OpenCart.base.Base;
import com.OpenCart.pages.AccountPage;


public class LoginPageTest  extends Base{

	//LoginPage loginPage;
	AccountPage accountPage;
	
	@Test(priority=1)
	public void verifyLogo() {
	boolean flag = loginPage.validateLogo();
	Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void login() {
		accountPage = loginPage.login("Darsh@gmail.com", "Darsh@123#");
		String expectedURL="https://tutorialsninja.com/demo/index.php?route=account/account";
		String actualURL= driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	}
}
