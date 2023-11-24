package com.tha.logintest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tha.config.Config;

public class LoginTest extends Config {
	
	@Test(priority = 1,dataProvider = "logintestdata")
	public void loginTestCase(String username,String password) {
		System.out.println(username);
		System.out.println(password);	
	}
	
	@DataProvider(name = "logintestdata")
	public Object[][] loginTestdata(){
		Object[][] testObjArray=readExcelSheet("D:\\238Selenium_Workspace\\ExcelSheet\\testdata.xlsx");
		return testObjArray;
	}

}
