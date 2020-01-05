package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.pages.AddUserPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

public class UserTest extends BaseSelenium
{
@Test
public void verifyadminclick()
{
	LoginPage lp=new LoginPage();
    lp.login("admin", "admin");
    
    HomePage hp=new HomePage();
    hp.verifyadminMenu();
      
    
    AddUserPage ap=new AddUserPage();
    ap.selectUserType("Admin");
    ap.userDetails("ganesh Pawar", "1234569");
    		
}
}
