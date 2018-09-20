package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArticlePage {
	
	public static String getHeadingText(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='firstHeading']")).getText();

	}
}
