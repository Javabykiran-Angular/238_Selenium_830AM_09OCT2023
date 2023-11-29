package com.tha.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void browserSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		//String url=readPropertyFile();
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/pages/examples/add_user.html");
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
