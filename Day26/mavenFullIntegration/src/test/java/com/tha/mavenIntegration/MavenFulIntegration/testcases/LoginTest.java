package com.tha.mavenIntegration.MavenFulIntegration.testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tha.mavenIntegration.MavenFulIntegration.config.Config;

public class LoginTest extends Config {
	
	
	@BeforeClass
	public void openBrowser() {
		browserSetting();
	}
	
	@Test(priority = 1,dataProvider = "logintestdata")
	public void loginTest(String username,String password) {
//		System.out.println("====== Login Test case ==========");
//		System.out.println("=> "+username+" ==> "+password);
		
		WebElement emailElement=accessById("email");
		WebElement passwordElement=accessById("password");
		
		emailElement.sendKeys(username);
		passwordElement.sendKeys(password);
		
		accessByClass("btn").click();
		
		try {

			File source= ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			
			
			File target=new File("D:\\238Selenium_Workspace\\images\\login_"+username+".png");
			Thread.sleep(2000);
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
		
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(emailActualResult, emailExpectedResult);
		
		WebElement passwordErrorMessageElement=accessById("password_error");
		String passwordActualResult=passwordErrorMessageElement.getText();
		String passwordExpectedResult="Please enter password 123456";
		
		softassert.assertEquals(passwordActualResult, passwordExpectedResult);
		
		softassert.assertAll();		
		
	}
	
	@DataProvider(name = "logintestdata")
	public Object[][] testDataProvider() {
		
		Object [][] obj =readExcelSheet("D:\\238Selenium_Workspace\\ExcelSheet\\testdata.xlsx");
		return obj;
	}
	

}
