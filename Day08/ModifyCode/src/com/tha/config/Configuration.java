package com.tha.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuration {
	WebDriver driver;
	
	public void browserSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
//		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		driver.get(url);
	}
	
	public void login() {		
		
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sumit@gmail.com");
		
//		WebElement emailElement= accessByXpath("//*[@id=\"email\"]");
		
		WebElement emailElement= accessById("email");
		
		emailElement.sendKeys("sumit@gmail.com");
		
		
//		driver.findElement(By.id("password")).sendKeys("123456");
		
		WebElement passwordElement=accessById("password");
		passwordElement.sendKeys("123456");
		
		driver.findElement(By.className("btn")).click();
		
		
	}
	
	public WebElement accessByXpath(String xpath){
		
		return (driver.findElement(By.xpath(xpath)));
		
	}
	
	public WebElement accessById(String id) {
		return (driver.findElement(By.id(id)));
	}
	
	
	

}
