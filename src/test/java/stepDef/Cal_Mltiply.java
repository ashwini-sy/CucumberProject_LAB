package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cal_Mltiply {
	int mul;
	 

	    @When("^multiply the numbers (-?\\d+) , (-?\\d+) and (-?\\d+)")
	    public void multiply_the_numbers_something_something_and_something(int num1, int num2, int num3) throws Throwable {
	       mul=num1*num2*num3;
	    }

	    @Then("^The Multiplication of the three number is (-?\\d+)")
	    public void the_multiplication_of_the_three_number_is_something(int exnum) throws Throwable {
	        
	    }
}
