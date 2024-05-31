package com.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumbersTest {
	
	@Test
	public void one()
	{
		System.out.println("One Method");
	}
	@AfterMethod
	public void two()
	{
		System.out.println("Two Method");
	}
	@BeforeMethod
	public void three()
	{
		System.out.println("Three Method");
	}
	@AfterClass
	public void four()
	{
		System.out.println("Four Method");
	}
	@BeforeClass
	public void five()
	{
		System.out.println("Five Method");
	}
	@AfterTest
	public void six()
	{
		System.out.println("Six Method");
	}
	
	@BeforeTest
	public void seven()
	{
		System.out.println("Seven Method");
	}
	@AfterSuite
	public void eight()
	{
		System.out.println("Eight Method");
	}
	@BeforeSuite
	public void nine()
	{
		System.out.println("Nine Method");
	}
}
