/*package com.orangehrm.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;

public class AddUser extends BaseSelenium
{
	@Test
public void verifyAddButtonEnable()
{
	
	//Username
		WebElement	userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("admin");
		
		//password
		WebElement password=driver.findElement(By.name("txtPassword"))	;
		password.sendKeys("admin");
		
		//Loginbutton
		
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		
		//Click on Admin menu
		
			WebElement admin=driver.findElement(By.id("menu_admin_viewAdminModule"));
			admin.click();
			
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement addbtn=driver.findElement(By.id("btnAdd"));
			Boolean addbutton=addbtn.isDisplayed();
			if(addbutton==true)
			{
				System.out.println("Add button is displayed");
			}
			
			
	
}
	@Test
	public void verifyTittleOfPage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		//Username
			WebElement	userName=driver.findElement(By.id("txtUsername"));
			userName.sendKeys("admin");
			
			//password
			WebElement password=driver.findElement(By.name("txtPassword"))	;
			password.sendKeys("admin");
			
			//Loginbutton
			
			WebElement loginBtn=driver.findElement(By.id("btnLogin"));
			loginBtn.click();
			
			//Click on Admin menu
			
				WebElement admin=driver.findElement(By.id("menu_admin_viewAdminModule"));
				admin.click();
				
				try {
					Thread.sleep(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String tittle=driver.getTitle();
				System.out.println(tittle);
				
				
	}
}
*/