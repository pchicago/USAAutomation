package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccountDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
		driver.manage().window().maximize();
		
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByValue("5");
				
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		Select s2=new Select(day);
		s2.selectByValue("5");
		
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(year);
		s3.selectByValue("2021");

		
	}

}
