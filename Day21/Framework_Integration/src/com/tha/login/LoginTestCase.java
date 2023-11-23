package com.tha.login;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tha.config.Config;

public class LoginTestCase extends Config {
	String url=null;
	
	@BeforeTest
	public void fetchUrl() {
		this.url=readPropertyFile();
	}
	
	@BeforeClass
	public void openingBrowser() {
		
		browserSetting(this.url);
	}
	
	public String readPropertyFile() {
		String url=null;
		FileInputStream fis=null;
		Properties props=null;
		
		try {
			 fis=new FileInputStream("D:\\238Selenium_Workspace\\configData\\myconfig.properties");
			 props=new Properties();
			 props.load(fis);
			 
			 url=props.getProperty("url");
			 
			 
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
		return url;
		
		
	}
	
	
	@Test(priority = 1)
	public void usernameTest() {
		System.out.println("Username Test Execute....");
		
		WebElement emailElement=accessById("email");
		emailElement.sendKeys("sumit");		
		
	}
	
	@Test(priority = 2)
	public void passwordTest() {
		
		
		WebElement passwordElement=accessById("password");
		passwordElement.sendKeys("123");		
		
	}
	
	@Test(priority = 3,enabled = false)
	public void buttonClickTest() {
		
		
		WebElement buttonElement=accessByClass("btn");
		buttonElement.click();
		
		WebElement emailErrorElement=accessById("email_error");
		//Step1 Access realtime data => ActualResult
		 String actualEmailMessage= emailErrorElement.getText();
		 System.out.println(actualEmailMessage);
		// Step2 Mentioned BRD data => Expected Result
		 String expectedEmailMessage="Please enter email as kiran@gmail.com.";
		
		 // Step3 Compare actual result with expected result => execute a test case 
		 // for that we use assert given by testng
		 
		 //Hard Assert 
		 Assert.assertEquals(actualEmailMessage, expectedEmailMessage);
		 System.out.println("After assertEquals method...");
		 
		 //step 1 
		 WebElement passwordErrorElement=accessById("password_error");
		  String actualPasswordMessage= passwordErrorElement.getText();
		 //Step 2 
		  String expectedPasswordMessage="Please enter password 123456";
		 
		//Step 3 Assert
		  Assert.assertEquals(actualPasswordMessage, expectedPasswordMessage);
		  
		
	}
	
	@Test(priority = 4)
	public void buttonClickTest1() {
		
		
		WebElement buttonElement=accessByClass("btn");
		buttonElement.click();
		
		WebElement emailErrorElement=accessById("email_error");
		WebElement passwordErrorElement=accessById("password_error");
		
		//Step1 Access realtime data => ActualResult
		 String actualEmailMessage= emailErrorElement.getText();
		 String actualPasswordMessage= passwordErrorElement.getText();
		 
//		 System.out.println(actualEmailMessage);
		 
		// Step2 Mentioned BRD data => Expected Result
		 String expectedEmailMessage="Please enter email as kiran@gmail.com";
		 String expectedPasswordMessage="Please enter password 123456";
		 
		 // Step3 Compare actual result with expected result => execute a test case 
		 // for that we use assert given by testng
		 
		SoftAssert softassert=new SoftAssert();
		
		softassert.assertEquals(actualEmailMessage,expectedEmailMessage );
		softassert.assertEquals(actualPasswordMessage, expectedPasswordMessage);
		System.out.println("------Execute assertEquals Method----------");
		
		
		softassert.assertAll(); 	 		  
		 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
