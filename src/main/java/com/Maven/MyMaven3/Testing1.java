package com.Maven.MyMaven3;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing1 {
	@Test
	@Parameters({"lakshmi"})
	public void test1(String value)
	{
		System.out.println("start");
		int a =10;
		Assert.assertEquals(a, 10,"failure happened suddenly. what to do?");
		System.out.println("the value of the key lakshmi is : " +value);
}
}