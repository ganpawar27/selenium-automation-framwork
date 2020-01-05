package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangehrm.common.WebDriverFactory;

public class AddUserPage 
{
	@FindBy(id="systemUser_userType")
	WebElement userType;
@FindBy(id="systemUser_employeeName_empName")
WebElement employeename;

@FindBy(id="systemUser_userName")
WebElement userName;

@FindBy(id="systemUser_password")
WebElement pass;

@FindBy(id="btnSave")
WebElement save;



public AddUserPage()
{
	PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
}
public AddUserPage selectUserType(String ad)
{
	Select st=new Select(userType);
	st.selectByVisibleText(ad);
	return this;
	
}
public AdminPage userDetails(String eName,String epassword)
{
	employeename.sendKeys(eName);
	pass.sendKeys(epassword);
	save.click();
	return new AdminPage();
}
}

