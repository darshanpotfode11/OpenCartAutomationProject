package com.OpenCart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OpenCart.base.Base;
import com.OpenCart.pages.AccountPage;


public class AccountPageTest extends Base{

	AccountPage accountPage;
	
	@Test(priority=3)
	public void searchBoxTest() throws InterruptedException {
		accountPage=loginPage.login("Darsh@gmail.com", "Darsh@123#");
		accountPage.searchBox();
		accountPage.searchBtn();
		Thread.sleep(3000);
		String expectedURL="https://tutorialsninja.com/demo/index.php?route=product/search&search=iphone";
		String actualURL= driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
		
	}
	
}
