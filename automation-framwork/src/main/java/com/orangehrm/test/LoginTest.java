package com.orangehrm.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.common.WebDriverFactory;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseSelenium
{
/*	@Test
public void verifyLoginPanelName()
{
		LoginPage lp=new LoginPage();
		lp.verifyloginpanelname();
}
	@Test
	public void verifyUnameBlank()
	{
		LoginPage lp=new LoginPage();
		lp.verifyUsernameBlank("admin","", "Username cannot be empty");
	}
	
	@Test
public void verifyInvalidPassword()
{
	LoginPage lp=new LoginPage();
	lp.veriyInvalidUserName("sssds", "admin", "Invalid credentials");
	
}
	@Test
public void verifyPasswordBlank()
	{
		LoginPage lp=new LoginPage();
		lp.verifyPasswordBlank("admin","", "Password cannot be empty");
	}
	@Test
public void verifyLinks()
{
	LoginPage lp=new LoginPage();
	lp.verifyLinks();
	
}*/

@Test	
public void verifyLogin()
{
	LoginPage lp=new LoginPage();
    lp.login("admin", "admin")
    .verifyWelcomeTest("Welcome Admin")
    .verifyadminMenu().clickAddbutton()
    .selectUserType("Admin")
    .userDetails("ganesh Pawar", "569888");
    
    
	
	
	//HomePage hp=new HomePage();
	//hp.verifyWelcomeTest("Welcome Admin");
		
}
}

/*@Test 	
public void verifyInvalidUname()
{
	
	
	//Username
	WebElement	userName=	WebDriverFactory.getWebDriver().findElement(By.id("txtUsername"));
	userName.sendKeys("admin1");
	
	//password
	WebElement password=	WebDriverFactory.getWebDriver().findElement(By.name("txtPassword"))	;
	password.sendKeys("admin");
	
	//Loginbutton
	
	WebElement loginBtn=	WebDriverFactory.getWebDriver().findElement(By.id("btnLogin"));
	loginBtn.click();
	
	WebElement hardError=	WebDriverFactory.getWebDriver().findElement(By.id("spanMessage"));
	
	
	Boolean hrdmsg=hardError.isDisplayed();
	
		if(hrdmsg==true)
		{
		System.out.println("System unable to login");
	}
		
			
}
	@Test
public void verifyLink()
{
	
	
	WebElement link=	WebDriverFactory.getWebDriver().findElement(By.linkText("OrangeHRM, Inc"));
	link.click();
	String str=	WebDriverFactory.getWebDriver().getTitle();
	System.out.println(str);
}
	
	
	@Test
public void verifyLoginPanelName()
{
	
	
	WebElement loginPanel=	WebDriverFactory.getWebDriver().findElement(By.id("logInPanelHeading"));
	
	
    if(loginPanel.isDisplayed()==true)
    {
    System.out.println("HRM login page is displayed");
    }  
}
	
	@Test
public void verifyPageTitle()
{
	
	
	String str=	WebDriverFactory.getWebDriver().getTitle();
	
	System.out.println(str);
	
	
}
	@Test
	public void verifyUserNameBlank()
	{
		
		
		
		
		WebElement	userName=	WebDriverFactory.getWebDriver().findElement(By.id("txtUsername"));
		userName.sendKeys("");
				
		//Loginbutton
		
		WebElement loginBtn=	WebDriverFactory.getWebDriver().findElement(By.id("btnLogin"));
		loginBtn.click();
		
		WebElement hardError=	WebDriverFactory.getWebDriver().findElement(By.id("spanMessage"));
		
		Boolean hrdmsg=hardError.isDisplayed();
		
		if(hrdmsg==true)
		{
			System.out.println("hard error for username is displayed");
		}
	}
	
	@Test
public void verifyPasswordBlank()
	{
		
		
		WebElement	userName=	WebDriverFactory.getWebDriver().findElement(By.id("txtUsername"));
		userName.sendKeys("admin");
		
		//password
		WebElement password=	WebDriverFactory.getWebDriver().findElement(By.name("txtPassword"))	;
		password.sendKeys("");
			
		//Loginbutton
		
		WebElement loginBtn=	WebDriverFactory.getWebDriver().findElement(By.id("btnLogin"));
		loginBtn.click();WebElement hardError=	WebDriverFactory.getWebDriver().findElement(By.id("spanMessage"));
		
		Boolean hrdmsg=hardError.isDisplayed();
		
		if(hrdmsg==true)
		{
			System.out.println("hard error for passsword is displayed");
		}
	}
	
	@Test
public void verifyObjectOnLogin()
{
	
		
		
		
		//username Enabled
		WebElement Username=	WebDriverFactory.getWebDriver().findElement(By.id("txtUsername"));
		
		Boolean Uname=Username.isEnabled();
		
		if(Uname==true)
		{
			System.out.println("Username field is Enabled");
		}
		else
		{
			System.out.println("Username field is Disabled");
		}
		//password Enabled
	WebElement password=	WebDriverFactory.getWebDriver().findElement(By.id("txtPassword"));
		
		Boolean pass=password.isEnabled();
		
		if(pass==true)
		{
			System.out.println("Password field is Enabled");
		}
		else
		{
			System.out.println("Password field is Disabled");
		}
		//Loginbutton enabled
	WebElement loginButton=	WebDriverFactory.getWebDriver().findElement(By.id("txtPassword"));
		
		Boolean loginbtn=loginButton.isEnabled();
		
		if(loginbtn==true)
		{
			System.out.println("loginButton field is Enabled");
		}
		else
		{
	}
}

	
	@Test
public void verifyAdminLoginSucessfull()
{
	
	
	WebElement	userName=	WebDriverFactory.getWebDriver().findElement(By.id("txtUsername"));
	userName.sendKeys("admin");
	
	WebElement password=	WebDriverFactory.getWebDriver().findElement(By.id("txtPassword"));
	password.sendKeys("admin");
	
	WebElement loginbtn=	WebDriverFactory.getWebDriver().findElement(By.id("btnLogin"));
	loginbtn.click();
	
	
}
	
}

*/