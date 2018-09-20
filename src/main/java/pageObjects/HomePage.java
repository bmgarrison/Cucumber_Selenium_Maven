package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	

	public static WebElement getSearchBox(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='searchInput']"));
	}
	
	public static WebElement getSearchButton(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='search-form']/fieldset/button"));
	}
	
	public static void getSearchBoxWithInput(WebDriver driver, String input){
		driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys(input);
	}
	
}
