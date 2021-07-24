package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBSignUpstep {
	WebDriver driver=BaseClass.driver;
	
	 @Given("^User has opened the FB Application$")
	    public void user_has_opened_the_fb_application() throws Throwable {
	        driver.get("https://en-gb.facebook.com/");
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    }

	    @When("^Clcik onCreate new Acccount$")
	    public void clcik_oncreate_new_acccount() throws Throwable {
	    	WebElement CreatAccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
			CreatAccount.click();
	    }

	    

	    @And("^User enter the correct firstname \"([^\"]*)\"$")
	    public void user_enter_the_correct_firstname_something(String Firstname) throws Throwable {
	    	WebElement firstname=driver.findElement(By.name("firstname"));
	    	firstname.sendKeys(Firstname);
	    	System.out.println(Firstname);
	    }

	    @And("^User enter the correct lastname  \"([^\"]*)\"$")
	    public void user_enter_the_correct_lastname_something(String lastname) throws Throwable {
	    	WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
			Lastname.sendKeys(lastname);
	    	
	    	System.out.println(lastname);
	    }

	    @And("^User enter the  Mobilenumber \"([^\"]*)\"$")
	    public void user_enter_the_mobilenumber_something(String mblnumber) throws Throwable {
	    	System.out.println(mblnumber);
	    	WebElement phnumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));
			phnumber.sendKeys(mblnumber);
	    }

	    @And("^User enter the  New Password \"([^\"]*)\"$")
	    public void user_enter_the_new_password_something(String password) throws Throwable {
	    	WebElement newpawd=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			newpawd.sendKeys(password); 
	    }

	    @And("^User select the date \"([^\"]*)\"$")
	    public void user_select_the_date_something(String date) throws Throwable {
	    	WebElement DOB=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    	DOB.sendKeys(date);
	        
	    }

	    @And("^User select the Month \"([^\"]*)\"$")
	    public void user_select_the_month_something(String month) throws Throwable {
	    	WebElement DOM=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	        DOM.sendKeys(month);
	    }

	    @And("^User select the Year \"([^\"]*)\"$")
	    public void user_select_the_year_something(String year) throws Throwable {
	    	WebElement DOY=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	    	DOY.sendKeys(year);
	    }

	    @And("^User select the Gender \"([^\"]*)\"$")
	    public void user_select_the_gender_something(String gender) throws Throwable {
	    	WebElement gen=driver.findElement(By.xpath("//label[text()='Female']"));
	    	gen.click();
	        
	    }

	    @And("^User click on Signup button$")
	    public void user_click_on_signup_button() throws Throwable {
	    	WebElement signup=driver.findElement(By.xpath("//button[@name='websubmit']"));
			signup.click();
			
	    }
	    @Then("^User should be Able to create new account  successfully$")
	    public void user_should_be_able_to_create_new_account_successfully() throws Throwable {
	        
	    }
	    
	    @And("^User enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"and \"([^\"]*)\"$")
	    public void user_enter_something_something_somethingand_something(String firstname, String lastname, String mblnumber, String password) throws Throwable {
	        
	    }

	    @And("^User select \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_select_something_something_something_and_something(String date, String month, String year, String gender) throws Throwable {
	       
	    }


}
