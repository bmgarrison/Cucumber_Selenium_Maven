package practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.BrowserTypeEnum;
import config.WebDriverFactory;

public class FirstTest {

	@Test
	public void myTest(){
		WebDriver driver = WebDriverFactory.createDriver(BrowserTypeEnum.IE);  
        
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("java");
        driver.findElement(By.xpath("//*[@id='search-form']/fieldset/button")).click();
        assertEquals("Java", driver.findElement(By.xpath("//*[@id='firstHeading']")).getText());
	}

	
	
}
