package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class SeleniumHelper {

	
	public static Properties readProperties(String path) throws IOException {
		FileInputStream file = new FileInputStream(new File(path));
		Properties properties = new Properties();
		properties.load(file);
		return properties;
		
	}
	
	public static void type(WebElement element, String givenText) {
		element.sendKeys(givenText);
		
	}
	
	
	public static WebElement waitForElement(WebDriver driver, WebElement element, int second) {
		WebDriverWait wait = new WebDriverWait(driver, second);
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(element));
		return element2;
		
	}
	
	public static void getScreenShot(WebDriver driver) throws IOException {

		int x = (int) Math.random();
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		Files.copy(SrcFile, new File("ScreenShots/shot"+x+".png"));

	}
}
