package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IHGdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		WebElement Dropdown = driver.findElement(By.xpath("//select[@id='country']"));
		Select s=new Select(Dropdown);
		//s.selectByIndex(5);
		//s.selectByValue("BE");
		s.selectByVisibleText("British Indian Ocean Territory");

	}

}
