package com.tha.config;

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
	
	public void tableAutomate() {
		
		List<WebElement> list= driver.findElements(By.tagName("tr"));
		System.out.println(list.size());
		
		for(int i=1;i<list.size();i++) {
//			List<WebElement> colList= driver.findElements(By.tagName("td"));
			List<WebElement> colList= list.get(i).findElements(By.tagName("td"));
//			System.out.println("Col Size => "+colList.size());
			
			for(int j=1;j<colList.size();j++) {
				String strcontent=colList.get(j).getText();
//				System.out.println("======== "+strcontent);
				
				System.out.print(strcontent+"\t");
				
			}
			
			System.out.println("");
			
		}
		
		
	}
	
	
	

}
