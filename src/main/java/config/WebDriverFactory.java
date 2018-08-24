package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		default:
			break;

		}
		return driver;
	}
}
