package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.util.SeleniumHelper;

import browser.config.BrowserConfig;
import data.config.ConfigDataProvider;
 

public class BaseTest {
	public WebDriver driver;
	ConfigDataProvider config;

	@BeforeClass
	public void getData() throws IOException {
		 config = new ConfigDataProvider();
		 
	}

	@BeforeMethod
	public void startBrowser() {
		driver = BrowserConfig.startApp(driver, config.getBrowser(), config.getUrl());

	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			SeleniumHelper.getScreenShot(driver);
		}

		if (result.getStatus() == ITestResult.SUCCESS) {
			Reporter.log("Success");
		}

	}

	@AfterClass
	public void tearDown() {
		BrowserConfig.tearDown(driver);
	}
	
}
