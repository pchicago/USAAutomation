package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsProgram1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display an  alert box:')]]")).click();
Alert at = driver.switchTo().alert();
at.accept();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()[contains(.,'Alert with OK & Cancel')]]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display a confirm box')]]")).click();
	at.dismiss();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()[contains(.,'Alert with Textbox')]]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()[contains(.,'click the button to demonstrate the prompt box')]]")).click();
	at.sendKeys("Morning Batch");
	at.accept();
	}

}
