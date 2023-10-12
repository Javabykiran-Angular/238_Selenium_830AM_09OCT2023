package com.tha.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Selenium238_Software/Offline%20Website/index.html");
		
		String strUrl= driver.getCurrentUrl();
		System.out.println("Current url "+strUrl);
		String strTitle=driver.getTitle();
		System.out.println("Title is "+strTitle);
		
		String strPageSource= driver.getPageSource();
		System.out.println("===> "+strPageSource);
		
		driver.close();
		
		
		

	}

}
