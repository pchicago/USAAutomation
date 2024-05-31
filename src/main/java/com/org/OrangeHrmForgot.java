package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmForgot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		
	}

}
