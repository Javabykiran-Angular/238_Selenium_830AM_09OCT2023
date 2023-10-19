package com.tha.config;

import java.util.ArrayList;
import java.util.List;

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
	
	public void login() {
		
		WebElement emailElement=accessById("email");
		emailElement.sendKeys("kiran@gmail.com");
		WebElement passwordElement=accessById("password");
		passwordElement.sendKeys("123456");
		
		driver.findElement(By.className("btn")).click();
		
	}
	
	public void dasboard() {
		WebElement element;
		
		element=accessByXpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a");
		element.click();
		element=accessByXpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a");
		element.click();
		
		element=accessByXpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a");
		element.click();
		
		element=accessByXpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a");
		element.click();
		
		windowsHandle();
		
		
	}
	
	public WebElement accessById(String id) {
		return (driver.findElement(By.id(id)));
	}
	
	public WebElement accessByXpath(String xpath) {
		return (driver.findElement(By.xpath(xpath)));
	}
	
	public void windowsHandle() {
		
		ArrayList<String> windowList=new ArrayList<String>(driver.getWindowHandles());
		System.out.println("size => "+windowList.size());
			
		
		for(int i=0;i<windowList.size();i++) {
			
			if(i!=0) {
				driver.switchTo().window(windowList.get(i));
				driver.close();
			}
			
		}
		
		
		driver.switchTo().window(windowList.get(0));
		
		
		WebElement userElement= accessByXpath("/html/body/div/aside/section/ul/li[3]/a");
		userElement.click();	
		
		
		
	}
	
	

}
