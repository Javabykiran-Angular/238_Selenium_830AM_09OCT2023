package com.tha.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);	
		
	}
	
	public void accessElement() {
		//absolute xpath
		
		// driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav/a[2]")).click();
		
		//relative xpath
		
		driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
		
		
	}
	
	public void rediffmailElementAccess() {
		
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Sumit");
		//driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("sumit");
		
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("sumit");
		driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[1]")).sendKeys("123");
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]")).sendKeys("123");
		
		
	}
	

}











