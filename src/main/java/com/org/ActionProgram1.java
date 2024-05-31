package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a=new Actions(driver);
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		//a.moveToElement(user).sendKeys("Ram").build().perform();
		a.sendKeys(user, "shilpa").build().perform();
		WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
		a.moveToElement(password).sendKeys("Admin123").build().perform();
		
		WebElement button= driver.findElement(By.xpath("//button[@name='login']"));
		a.moveToElement(button).click().build().perform();


		
	}

}
