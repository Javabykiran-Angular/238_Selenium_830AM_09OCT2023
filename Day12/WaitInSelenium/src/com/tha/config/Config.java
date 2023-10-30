package com.tha.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	
	public void implicitWait() {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("webform");
		
		WebDriverWait wait=new WebDriverWait(driver, 5);
		
		
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("webform[email]")));
		element.sendKeys("sumit@gmail.com");
		
		
//		driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
		
		
	}
	
	

}
