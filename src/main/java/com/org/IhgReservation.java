package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IhgReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/hotels/us/en/reservation");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Join")).click();
		
	}

}
