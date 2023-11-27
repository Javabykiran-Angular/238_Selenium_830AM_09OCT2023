package com.tha.logintest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tha.config.Config;

public class LoginTest extends Config {
	
	WebDriver logindriver;
	
	@BeforeClass
	public void openBrowser() {
	
		browserSetting();
		this.logindriver=getDriver();
		
	}
	
	@Test(priority = 1,dataProvider = "logintestdata")
	public void loginTestCase(String username,String password) {
//		System.out.println(username);
//		System.out.println(password);	
		
		WebElement emailElement=accessById("email");
		WebElement passwordElement=accessById("password");
		
		emailElement.sendKeys(username);
		passwordElement.sendKeys(password);
		
		accessByClass("btn").click();
		
		
		try {

			File source= ((TakesScreenshot)logindriver).getScreenshotAs(OutputType.FILE);
			
			
			File target=new File("D:\\238Selenium_Workspace\\images\\login_"+username+".png");
			Thread.sleep(3000);
			FileHandler.copy(source, target);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		emailElement.clear();
		passwordElement.clear();
		
		WebElement emailErrorMessageElement=accessById("email_error");
		String emailActualResult=emailErrorMessageElement.getText();
		String emailExpectedResult="Please enter email as kiran@gmail.com";
		
//		Assert.assertEquals(emailActualResult, emailExpectedResult);
		
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(emailActualResult, emailExpectedResult);
		
		WebElement passwordErrorMessageElement=accessById("password_error");
		String passwordActualResult=passwordErrorMessageElement.getText();
		String passwordExpectedResult="Please enter password 123456";
		
		softassert.assertEquals(passwordActualResult, passwordExpectedResult);
		
		
		softassert.assertAll();
		
	}
	
	@DataProvider(name = "logintestdata")
	public Object[][] loginTestdata(){
		Object[][] testObjArray=readExcelSheet("D:\\238Selenium_Workspace\\ExcelSheet\\testdata.xlsx");
		return testObjArray;
	}

}
