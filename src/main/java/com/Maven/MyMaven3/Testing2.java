package com.Maven.MyMaven3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing2 {
	@Test
	@Parameters({"USER","PASSWORD"})
	
		public void test2(String username, String password)
		//public void test2()
		{
			System.out.println("second");
			System.out.println("The username is "+username);
			System.out.println("The password is "+password);
		}
}
