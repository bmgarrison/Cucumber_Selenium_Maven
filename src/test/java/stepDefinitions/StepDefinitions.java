package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.BrowserTypeEnum;
import config.WebDriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions{
	
	WebDriver driver = null;
	
	@Before
	public void setup(){
		driver = WebDriverFactory.createDriver(BrowserTypeEnum.CHROME);  
	}
	
	@Given("^I open wikipedia$")
	public void i_open_wikipedia(){
        driver.get("https://www.wikipedia.org/");
	}

	@When("^I type an input$")
	public void i_type_an_input(){
        driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("java");
	}

	@When("^press search$")
	public void press_search(){
        driver.findElement(By.xpath("//*[@id='search-form']/fieldset/button")).click();
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes(){
        assertEquals("Java", driver.findElement(By.xpath("//*[@id='firstHeading']")).getText());
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}


