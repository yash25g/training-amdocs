package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	private String soapWSDLURL;
	private String rpnMathExpression;
	private double actualResult;
	@Given("I Have deployed the RPNCalculator SOAP api at URL {string}")
	public void setSOAPWSDLURL(String wsdlURL) {
	    soapWSDLURL = wsdlURL;
	}

	@Given("The input is {string}")
	public void setInput(String rpnMathExpression) {
	    this.rpnMathExpression = rpnMathExpression;
	}

	@When("I invoke the soap api")
	public void invokeRPNCalculatorSOAPAPI() {
	    RpnCalculatorService rpnWebService = new RpnCalculatorService();
	    RpnCalculator rpnCalculator = rpnWebService.getRpnCalculator();
	    
	     actualResult = rpnCalculator.evaluate (rpnMathExpression);
	}

	@Then("I expect the response as {string}")
	public void verify(String expectedResult1) {
		double expectedResult = Double.parseDouble(expectedResult1);
	     assertEquals (expectedResult, actualResult,0.0001);
	}


	
}
