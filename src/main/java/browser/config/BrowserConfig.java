package browser.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;

public class BrowserConfig {
	
	public static WebDriver startApp(WebDriver driver, String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
			driver = new ChromeDriver();
			System.out.println("Chrome is running");
			Reporter.log("chrome is runnig");
			
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
			driver = new FirefoxDriver();
			System.out.println("Firefox is runnig");
			Reporter.log("Firefox is runnig");
			
		}else if (browserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", "Drivers/operadriver");
			driver = new OperaDriver();
			System.out.println("Opera is runnig");
			Reporter.log("Opera is runnig");
			
			
		}else if (browserName.equalsIgnoreCase("Safari")) {
			System.setProperty("webdriver.safari.driver", "Drivers/safaridriver");
			driver = new SafariDriver();
			System.out.println("Safari is running");
			Reporter.log("Safari is runnig");
			
		}else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver");
			driver = new EdgeDriver();
			System.out.println("Edge is runnig");
			Reporter.log("Edge is runnig");
			
		}else {
			System.out.println(browserName+" "+"is not supported by this framework yet!!!");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
	
	public static void tearDown(WebDriver driver) {
		driver.quit();
		
	}

}
