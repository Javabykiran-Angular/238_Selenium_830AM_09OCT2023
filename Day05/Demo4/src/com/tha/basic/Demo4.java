package com.tha.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.classfile.Annotation.element_value;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
		WebElement labelElement= driver.findElement(By.xpath("/html/body/div/div[1]/a/b"));
		String labelName= labelElement.getText();
		System.out.println("==> "+labelName);
		
		WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailElement.sendKeys("kiran@gmail.com");		
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		String strError=driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText();
		System.out.println("=> "+strError);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
