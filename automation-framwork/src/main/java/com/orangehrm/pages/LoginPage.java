package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orangehrm.common.WebDriverFactory;

public class LoginPage 
{
@FindBy(id="txtUsername")	
WebElement userName;
@FindBy(id="txtPassword")
WebElement password;
@FindBy(id="btnLogin")
WebElement loginBtn;

@FindBy(id="spanMessage")
WebElement invalidUserName;

@FindBy(linkText="OrangeHRM, Inc")
WebElement link;

@FindBy(id="logInPanelHeading")
WebElement loginPanelName;

@FindBy(id="spanMessage")
WebElement hardErrorMessage;

@FindBy(id="spanMessage")
WebElement passwordHarderror;


public LoginPage()
{
	PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
}

//Login panelname
public void verifyloginpanelname()
{
	loginPanelName.isDisplayed();
	if(loginPanelName.isDisplayed()==true)
	{
		System.out.println("login panel name is displayed");
	}
	
}

public void verifyUsernameBlank(String Uname,String correctPassword, String text)
{
	userName.sendKeys(Uname);
	password.sendKeys(correctPassword);
	loginBtn.click();
	
	Assert.assertEquals(hardErrorMessage.getText(), text);
}

public LoginPage verifyPasswordBlank(String correctUname,String Password, String text)
{
	userName.sendKeys(correctUname);
	password.sendKeys(Password);
	loginBtn.click();
	
	Assert.assertEquals(passwordHarderror.getText(), text);
	return this;
	
}

//invalidUsername hard error message verification and error message display
public void veriyInvalidUserName(String invalidUname , String correctPassword, String text )
{
	userName.sendKeys(invalidUname);
	password.sendKeys(correctPassword);
	loginBtn.click();
	
	Assert.assertEquals(invalidUserName.getText(), text);
	invalidUserName.isDisplayed();
	
	if(invalidUserName.isDisplayed()== true)
	{
		System.out.println("ok");
	}
	
}
//Links Verify
public void verifyLinks()
{
	link.click();
	System.out.println(WebDriverFactory.getWebDriver().getTitle());
}

//login sucssesfull
public HomePage login(String struseName , String strpassword)
{
	userName.sendKeys(struseName);
	password.sendKeys(strpassword);
	loginBtn.click();
	return new HomePage();
}




}
