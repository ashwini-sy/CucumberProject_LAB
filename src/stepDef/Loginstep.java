package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstep {
	WebDriver driver=BaseClass.driver;

	@Given("^User has opened the Simpplilearn Application$")
	public void user_has_opened_the_simpplilearn_application() throws Throwable {
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();

	}

	@When("^Click on the login button link$")
	public void click_on_the_login_button_link() throws Throwable {

		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
	}

	@And("^User enter the correct username \"([^\"]*)\"$")
	public void user_enter_the_correct_username_something(String username) throws Throwable {

		WebElement un = driver.findElement(By.name("user_login"));
		un.sendKeys(username);

	}

	@And("^User enter the correct password  \"([^\"]*)\"$")
	public void user_enter_the_correct_password_something(String password) throws Throwable {

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys(password);
	}

	@Then("^User should be navigated to next page successfully$")
	public void user_should_be_navigated_to_next_page_successfully() throws Throwable {
	/*if(driver.findElement(By.xpath("//a[@data-event='sl_lms_nav_my_courses_clicked']")).isDisplayed())
	{
	  System.out.println("Navigating to next page");	
	}
	else
	{
		System.out.println("un / pwd  not correct");
	}*/
	}

	@And("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		WebElement login_bn = driver.findElement(By.name("btn_login"));
		login_bn.click();

	}

}
