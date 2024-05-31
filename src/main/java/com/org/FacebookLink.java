package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		driver.findElement(By.partialLinkText("Forgot account?")).click();
		

	}

}
