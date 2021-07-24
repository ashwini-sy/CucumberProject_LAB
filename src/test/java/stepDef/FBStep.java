package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBStep {
	WebDriver driver=BaseClass.driver;
	@Given("^User should launch the FB application$")
    public void user_should_launch_the_fb_application() throws Throwable {
		  driver.get("https://en-gb.facebook.com/"); 
		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    }

    @When("^User clicks on the Create New Account Link$")
    public void user_clicks_on_the_create_new_account_link() throws Throwable {
    	WebElement CreatAccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		CreatAccount.click();
    
    }

    @Then("^user should be able to see the success message$")
    public void user_should_be_able_to_see_the_success_message() throws Throwable {

    	
    	
        
    }

    @And("^User creates the new account in FB$")
    public void user_creates_the_new_account_in_fb(DataTable tabel) throws Throwable {
    	System.out.println("FirstName is " + tabel.cell(1, 1));
    	String FirstName = tabel.cell(1, 1);
    	String LastName = tabel.cell(2, 1);
    	String MobileNum = tabel.cell(3, 1);
    	String Password = tabel.cell(4, 1);
    	
    	WebElement tbFirstName = driver.findElement(By.xpath("//*[@name='firstname']"));
    	WebElement tbLastName = driver.findElement(By.xpath("//input[@name='lastname']"));
    	WebElement tbMobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
    	WebElement tbPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
    	
    	tbFirstName.sendKeys(FirstName);
    	tbLastName.sendKeys(LastName);
    	tbMobile.sendKeys(MobileNum);
    	tbPassword.sendKeys(Password);



       
    }

    @And("^User click on the SignUp button$")
    public void user_click_on_the_signup_button() throws Throwable {
        
    }

}
