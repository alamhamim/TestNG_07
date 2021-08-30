package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.SeleniumHelper;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		 
	}

	
	@FindBy(id = "txtUsername")
	WebElement userName;
	
	@FindBy(id = "txtPassword")
	WebElement passWord;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement loginButton;
	
	
	public void loginTest(String userId, String pass) {
		SeleniumHelper.type(userName, userId);
		SeleniumHelper.type(passWord, pass);
		SeleniumHelper.waitForElement(driver, loginButton, 10).click();
		
		
	}
	
}
