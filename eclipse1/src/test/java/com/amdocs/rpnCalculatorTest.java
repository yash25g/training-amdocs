package com.amdocs;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class rpnCalculatorTest {
	private rpnCalculator rpn; 
	double actualresult;
	double expectedresult;
	
	@BeforeClass
	public static void initOnce() {
		System.out.println("Before class method");
	}
	
	@Before
	public void init()
	{
	rpn=new rpnCalculator();
	actualresult=expectedresult=0.0;
	}
	
	@After
	public void cleanUp()
	{
		rpn=null;
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("After Method");
	}
	
   @Category(SmokeTest.class)	
   @Test
   public void testSimpleAddition()
   {
	   actualresult=rpn.evaluate("10 15 +");
	   expectedresult=25.0;
	   assertEquals(expectedresult,actualresult,0.0001);
	   
	    actualresult=rpn.evaluate("10 115 +");
	    expectedresult=125.0;
	   assertEquals(expectedresult,actualresult,0.0001);
   }

   @Test
   public void testSimpleSubtraction()
   {
	  
	   actualresult=rpn.evaluate("100 15 -");
	   expectedresult=85.0;
	   assertEquals(expectedresult,actualresult,0.0001);
	   
	    actualresult=rpn.evaluate("10 5 -");
	    expectedresult=5.0;
	   assertEquals(expectedresult,actualresult,0.0001);
   }
   
   @Test
   public void testSimpleMultiplication()
   {
	   actualresult=rpn.evaluate("10 15 *");
	   expectedresult=150.0;
	   assertEquals(expectedresult,actualresult,0.0001);
	   
	    actualresult=rpn.evaluate("10 50 *");
	    expectedresult=500.0;
	   assertEquals(expectedresult,actualresult,0.0001);
   }
   
   @Test
   public void testSimpleDivision()
   {
	   
	   actualresult=rpn.evaluate("100 20 /");
	   expectedresult=5.0;
	   assertEquals(expectedresult,actualresult,0.0001);
   }
   
   @Test
   public void testComplex()
   {
	   
	    actualresult=rpn.evaluate("10 15 *");
	    expectedresult=150.0;
	   assertEquals(expectedresult,actualresult,0.0001);
	   
	    actualresult=rpn.evaluate("10 50 *");
	    expectedresult=500.0;
	   assertEquals(expectedresult,actualresult,0.0001);
   }

}
