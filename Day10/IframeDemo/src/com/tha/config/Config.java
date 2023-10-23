package com.tha.config;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/");
		
	}
	
	public void automateIframe() {
		
		driver.switchTo().frame("webform");
		
		try {
			Thread.sleep(Duration.ofSeconds(5));
			driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	

}
