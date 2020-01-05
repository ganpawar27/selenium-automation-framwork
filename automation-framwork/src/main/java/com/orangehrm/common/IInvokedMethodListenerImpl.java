package com.orangehrm.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;


public class IInvokedMethodListenerImpl implements IInvokedMethodListener
{

	
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		//WebDriverFactory.driver.quit();
		WebDriverFactory.getWebDriver().quit();
		
		
	}

	
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
		//WebDriverFactory.driver=new ChromeDriver();
		//WebDriverFactory.setWebDriver.set(new ChromeDriver());
		WebDriverFactory.setWebDriver(new ChromeDriver());
		
		
		//WebDriverFactory.driver.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		WebDriverFactory.getWebDriver().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		//WebDriverFactory.driver.manage().window().maximize();
		WebDriverFactory.getWebDriver().manage().window().maximize();
	}

}
