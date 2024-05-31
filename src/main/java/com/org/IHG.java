package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IHG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("firstName")).sendKeys("shilpa");
		driver.findElement(By.id("lastName")).sendKeys("pattewar");
		driver.findElement(By.id("email")).sendKeys("pattewarshila16@gmail.com");
		driver.findElement(By.id("confirmEmail")).sendKeys("pattewarshila16@gmail.com");
		driver.findElement(By.id("address1")).sendKeys("abc xyz");
		driver.findElement(By.id("city")).sendKeys("schaumburg");
		driver.findElement(By.id("state")).sendKeys("IL");
		driver.findElement(By.id("zipCode")).sendKeys("123456");
		
		
		
		
	}

}
