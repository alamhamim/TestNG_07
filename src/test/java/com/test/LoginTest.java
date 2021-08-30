package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dataProvider.DataDriven;
import com.pages.LoginPage;

public class LoginTest extends BaseTest {
	LoginPage loginPage;

	@Test(dataProvider = "loginData", dataProviderClass = DataDriven.class)
	public void loginTest(String name, String pass) {
		loginPage = new LoginPage(driver);
		Assert.fail();
		loginPage.loginTest(name, pass);

	}

}
