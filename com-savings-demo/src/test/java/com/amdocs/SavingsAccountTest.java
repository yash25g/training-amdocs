package com.amdocs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class SavingsAccountTest {

	private SavingsAccount account;
	private SavingsAccount accountSpy;
	
	@Before
	public void setUp() {
		account = new SavingsAccount();
		
		accountSpy =  spy(account);
	 }
	
	@After
	public void tearDown()
	{
		account = null;
		accountSpy = null;
	}
	
	@Test
	public void testWithdraw() throws InsufficientBalanceException {
		
		
		Mockito.doReturn (5000.00).when (accountSpy).getBalance();
		Mockito.doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		
		double updatedBalance = accountSpy.withdraw(1000.00);
		double expectedBalance = 4000.00;
		
		assertEquals(expectedBalance, updatedBalance, 0.0001);
		
		verify(accountSpy, times(1)).getBalance();
	}
	
	
	 @Test
	 public void testWithdraw1() throws InsufficientBalanceException {
			
		    boolean exceptionThrown = false;	
		 
			Mockito.doReturn (5000.00).when (accountSpy).getBalance();
			Mockito.doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
			
			try
			{
			   accountSpy.withdraw(10000.00);	
			}catch(InsufficientBalanceException e) {
				exceptionThrown = true;
			}
			
			boolean expectedResponse = true;
			
			
			double updatedBalance = accountSpy.withdraw(1000.00);
			double expectedBalance = 4000.00;
			
			assertEquals(expectedResponse, exceptionThrown);
			
			verify(accountSpy, times(0)).updateBalanceIntoDB(anyDouble());;
		}
	 

}
