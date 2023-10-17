package com.tha.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DemoLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
//		driver.findElement(By.linkText("Register a new membership")).click();
		
		driver.findElement(By.partialLinkText("Register ")).click();
		
		driver.findElement(By.id("name")).sendKeys("sumit");
		
		driver.findElement(By.name("mobile")).sendKeys("9960556397");
		
//		driver.findElement(By.tagName("input")).sendKeys("sumit@gmail.com");
		
		List<WebElement> list= driver.findElements(By.tagName("input"));
		
		for(int i=0;i<list.size();i++) {
			
			WebElement element= list.get(i);
//			element.sendKeys("123");
			
			if(element.getAttribute("placeholder").equalsIgnoreCase("email")) {
				element.sendKeys("sumit@gmail.com");
			}else if(element.getAttribute("type").compareTo("password")==0) {
				element.sendKeys("123");
			}
			
			
		}
		
		driver.findElement(By.className("btn")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
