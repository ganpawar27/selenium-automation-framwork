package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orangehrm.common.WebDriverFactory;

public class HomePage 
{
@FindBy(id="welcome")
WebElement welComeTest;

@FindBy(id="menu_admin_viewAdminModule")
WebElement adminMenu;




public HomePage()
{
	PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
}

public AdminPage verifyadminMenu()
{
	adminMenu.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return new AdminPage();
	
}


public HomePage verifyWelcomeTest(String text)
{
	Assert.assertEquals(welComeTest.getText(), text);
	return this;
}
}
