package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTest extends BaseTest{
	LoginPage loginPage;

	@Test(dataProvider = "loginData", dataProviderClass = DataProvider.class)
	public void loginTest(String name, String pass) {
		loginPage = new LoginPage(driver);
		loginPage.loginTest(name, pass);
		
		
	}
	
	
}
