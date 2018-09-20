package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.BrowserTypeEnum;
import config.WebDriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ArticlePage;
import pageObjects.HomePage;

public class StepDefinitions{
	
	WebDriver driver = null;
	String assertionValue = null;
	
	@Before
	public void setup(){
		driver = WebDriverFactory.createDriver(BrowserTypeEnum.CHROME);  
	}
	
	@Given("^I open wikipedia$")
	public void i_open_wikipedia(){
        driver.get("https://www.wikipedia.org/");
	}

	@When("^I type an input \"([^\"]*)\"$")
	public void i_type_an_input(String input){
		assertionValue = input;
       //HomePage.getSearchBox(driver).sendKeys("java");
		HomePage.getSearchBoxWithInput(driver, input);
	}

	@When("^press search$")
	public void press_search(){
		HomePage.getSearchButton(driver).click();
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes(){
        assertEquals(assertionValue, ArticlePage.getHeadingText(driver));
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
	
}


