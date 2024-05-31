package com.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@SuppressWarnings("unused")
public class OrangeHRMWindows {
	public static Set<String> all ;
	public static Iterator<String> it;
	public static String parent,facebookPage,linkedInPage,youtubePage,twitterPage;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		 parent=driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(5000);
		WebElement fbIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
		fbIcon.click();
		all = driver.getWindowHandles();
		 it = all.iterator();
		while(it.hasNext())
		{
			facebookPage = it.next();
			if(!parent.equals(facebookPage))
			{
				driver.switchTo().window(facebookPage);
			}
				
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Team");
		driver.switchTo().window(parent);  
		
		
		WebElement linkedIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		linkedIcon.click();
		all = driver.getWindowHandles();
		 it = all.iterator();
		while(it.hasNext())
		{
			linkedInPage = it.next();
			if(!parent.equals(linkedInPage))
			{
				driver.switchTo().window(linkedInPage);
			}
				
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(facebookPage);
	}

}
