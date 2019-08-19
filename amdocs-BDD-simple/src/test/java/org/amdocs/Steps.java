package org.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	private Hello hello;
	private String actualResponse;
	
	@Given("I have the sayHello method on the hello object")
	public void createHelloObject() {
	    // Write code here that turns the phrase above into concrete actions
	   hello = new Hello();
	}
	
	@When("I invole the SayHello method on the hello object")
	public void invokeObject() {
		actualResponse = hello.sayHello();
	}

	@Then("I except the resources as {string}")
	public void i_except_the_resources_as(String expectedResponse) {
	    // Write code here that turns the phrase above into concrete actions
       assertEquals ( expectedResponse, actualResponse);
	}


	
}
