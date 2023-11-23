package com.tha.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	WebDriver driver;
	
	public void browserSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	public WebElement accessById(String id) {
		return driver.findElement(By.id(id));
	}
	
	public WebElement accessByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement accessByClass(String classname) {
		return driver.findElement(By.className(classname));
	}
	

}
