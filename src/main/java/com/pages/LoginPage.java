package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.util.SeleniumHelper;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		 
	}

	
	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement passWord;
	
	@FindBy(name = "loginbutton")
	WebElement loginButton;
	
	
	public void loginTest(String userId, String pass) {
		SeleniumHelper.type(userName, userId);
		SeleniumHelper.type(passWord, pass);
		SeleniumHelper.waitForElement(driver, loginButton, 10);
		
		
	}
	
}
