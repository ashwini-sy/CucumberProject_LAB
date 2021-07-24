package stepDef;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStep {
	int sum;
	int mul;
	 @Given("^The calculator is set to perform operation$")
	    public void the_calculator_is_set_to_perform_operation() throws Throwable {
	       System.out.println("Given statement:Calculator is set");
	    }

	    @When("^Add the numbers \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$")
	    public void add_the_numbers_something_and_something(int num1, int num2) throws Throwable {
	        System.out.println("When statement:Add the Two number");
	        sum=num1+num2;
	    }
	    @When("^multiply the numbers \\\"([^\\\"]*)\\\"  and \\\"([^\\\"]*)\\\"$")
	    public void multiply_the_numbers_4_and_6(int num1,int num2) throws Throwable {
	        mul=num1*num2;
	    }

	    @Then("^The sum of the two number is \\\"([^\\\"]*)\\\"$")
	    public void the_sum_of_the_two_number_is_something(int expsum) throws Throwable {
	    	System.out.println("Then statementVErify the sum of the number");
	    	assertTrue(sum==expsum);
	    }
	    @Then("^The mul of the two number is \\\"([^\\\"]*)\\\"$")
	    public void the_mul_of_the_two_number_is_24(int expmul) throws Throwable {
	    	assertTrue(mul==expmul);
	    }

}
