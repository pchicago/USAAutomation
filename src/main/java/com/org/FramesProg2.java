package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesProg2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		
		WebElement border3 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(border3);
		
		WebElement Dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
		
		Select s=new Select(Dropdown);
		s.selectByVisibleText("Big Baby Cat");
		
		driver.switchTo().defaultContent();
		
		WebElement border4 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(border4);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shilpa");
		
		WebElement border5 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(border5);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
	
	}

}
