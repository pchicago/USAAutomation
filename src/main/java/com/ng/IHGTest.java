package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class IHGTest {
	@Test
	public void ihg() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	Thread.sleep(5000);
	WebElement input = driver.findElement(By.xpath("//input[@name='username']"));
	input.sendKeys("Admin123");
	
	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys("Admin123");

	WebElement button= driver.findElement(By.xpath("//button[@type='submit']"));
	button.click();
}
}