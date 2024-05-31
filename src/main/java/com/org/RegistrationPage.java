package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		
		driver.findElement(By.name("radiooptions")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		
	
		driver.findElement(By.name("Join for free")).sendKeys("abc");
		
		
		
		
		
		
		
		
		
		
		
	}

}
