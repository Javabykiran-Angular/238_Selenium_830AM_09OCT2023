package com.tha.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	
	@Test(priority = 1,dataProvider = "testdata")
	public void loginTest(int id,String username,String password) {
		System.out.println("U r in Login test");
		System.out.println("ID=> "+id);
		System.out.println("Username=> "+username);
		System.out.println("Password=> "+password);
	}
	
	@DataProvider(name = "testdata")
	public Object[][] mydataProvider(){
		
		return new Object[][] {
			{9,"Sumit","123"},
			{3,"Spruha","456"},
			{6,"Kiran","810"},
		};
		
	}
	

}
