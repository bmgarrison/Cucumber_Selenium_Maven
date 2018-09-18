package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverFactory {

	public static WebDriver createDriver(BrowserTypeEnum browser) {
		WebDriver driver = null;
		
		switch(browser){
		case CHROME:			
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        break;
	    
		case IE:
			driver = new InternetExplorerDriver();
			break;
	     
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
			
		case HEADLESS:
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(options);
	        break;
	        
		default:
			break;

		}
		return driver;
	}
}
