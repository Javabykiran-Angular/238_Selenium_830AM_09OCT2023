package com.tha.maven.MavenProject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends Config{
	
	@BeforeClass
	public void openBrowser() {
		browserSetting();
	}
	
	@Test(priority = 1)
	public void LoginTest() {
		System.out.println("Login Test case Execute..");
	}
	
}
