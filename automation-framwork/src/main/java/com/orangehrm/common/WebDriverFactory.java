package com.orangehrm.common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory 
{
	//public static WebDriver driver;
	
	private static ThreadLocal<WebDriver> ThreadlocalStorage=new ThreadLocal<WebDriver>();

	

	public static void setWebDriver(WebDriver driver)
	{
		ThreadlocalStorage.set(driver);
	}

	public static WebDriver getWebDriver()
	{
		return ThreadlocalStorage.get();
	}
}
