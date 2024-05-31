package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomationTestingSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement  year= driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s1=new Select(year);
		s1.selectByValue("1918");
		
		WebElement  month= driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s2=new Select(month);
		s2.selectByValue("March");
		
		WebElement  day= driver.findElement(By.xpath("//select[@id='daybox']"));
		Select s3=new Select(day);
		s3.selectByValue("4");
		

		
		
	}

}
