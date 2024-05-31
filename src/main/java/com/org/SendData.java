package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			//System.out.println(driver.getTitle());
			String title="";
			title=js.executeScript("return document.title;").toString();
			System.out.println(title);
			
			//System.out.println(driver.getCurrentUrl());
			
			String url="";
			url=js.executeScript("return document.URL;").toString();
			System.out.println(url);
			
			//driver.navigate().refresh();
			js.executeScript("history.go(0)");
			
			// js.executeScript("document.getElementById('email').value='Admin';");
			
			WebElement user = driver.findElement(By.xpath("//input[@id='email']"));			
			js.executeScript("arguments[0].value='Admin';",user);
			
			//js.executeScript("document.getElementById('loginbutton').click();");
			
			WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
			js.executeScript("arguments[0].click();",button);
			
			
			// js.executeScript("window.scrollBy(0,1000)"); // vertically
			js.executeScript("window.scrollBy(2000,0)"); // horizantally
			
			
			

	}
	

}
