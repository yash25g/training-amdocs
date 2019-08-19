package com.amdocs;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MobileTest {

	@Test
	public void testStartPhotoAppWhenCameraOnFunctionsNormally() {
		
		//Mocking - creating a dummy 
		Camera mockedCamera = Mockito.mock(Camera.class);
		
		Mockito.when( mockedCamera.on() ).thenReturn(true);
		
		Mobile mobile = new Mobile(mockedCamera);
		boolean actualResponse = mobile.startPhotoApp();
		boolean expectedResponse = true;
		
		assertEquals(expectedResponse, actualResponse);
		
		Mockito.verify(mockedCamera,times(1)).on();
	}

}
