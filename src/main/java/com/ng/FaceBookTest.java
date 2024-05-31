package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookTest {
	
	@Test
	public void facebook() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		WebElement input = driver.findElement(By.xpath("//input[@name='email']"));
		input.sendKeys("Admin123@facebook.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("Admin123");

		WebElement button= driver.findElement(By.xpath("//button[@name='login']"));
		button.click();
		
	}
	
	

}
