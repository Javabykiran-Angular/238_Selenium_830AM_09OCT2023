package com.tha.dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		DemoDropDown.driver=new ChromeDriver();
		DemoDropDown.driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
//		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/pages/examples/dashboard.html");
		
		WebElement emailElement = DemoDropDown.driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailElement.sendKeys("kiran@gmail.com");		
		
		DemoDropDown.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		
		DemoDropDown.driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		//Create a Object to access Method DemodashboardAutomationDropDown
		
		DemoDropDown obj=new DemoDropDown();
		
		obj.dashboardAutomation();

	}
	
	
	public void dashboardAutomation() {
		
		DemoDropDown.driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		DemoDropDown.driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		
		DemoDropDown.driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sumit");
		DemoDropDown.driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9960556397");
		DemoDropDown.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sumit@thekiranacademy.com");
		DemoDropDown.driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Selenium");
		
		DemoDropDown.driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();
		
		DemoDropDown.driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
		
		WebElement droDownElement= DemoDropDown.driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		
		Select select=new Select(droDownElement);
		
//		select.selectByIndex(1);
		
		//select.selectByValue("Delhi");
		
		select.selectByVisibleText("HP");
		
		DemoDropDown.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sumit123");
		
		DemoDropDown.driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("7972547618");
		DemoDropDown.driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		Alert alert= DemoDropDown.driver.switchTo().alert();
		alert.accept();
		DemoDropDown.driver.switchTo().defaultContent();
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
}
