package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMTest {
	
	@Test
	public void hrm() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	String act=driver.getCurrentUrl();
	String exp="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	Assert.assertTrue(exp.equals(act));
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
