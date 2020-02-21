package com.Maven.MyMaven3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing3 {
	@Test
	public void test3()
	{
		System.out.println("Third one");
	}
	
	@Test(priority=2)
	@Parameters({"BROWSER"})
	public void testChrome(String browser_name)
	{
		if (browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\LAKSH\\Selenium\\Selenium Library\\Selenium Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.close();	
		}
		if (browser_name.equalsIgnoreCase("firefox")) {
			System.out.println("browser is under construction");
		}
		if (browser_name.equalsIgnoreCase("ie")) {
			System.out.println("IE not available");
		}
	}
}
