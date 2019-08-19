package org.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	
    @Test
	public void testsayHello()
	{
    	Hello obj=new Hello();
    	String expectedResponse="Hello World!";
    	String actualResponse=obj.sayHello();
		assertEquals(expectedResponse, actualResponse);
	}
}
