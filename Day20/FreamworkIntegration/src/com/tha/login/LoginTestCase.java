package com.tha.login;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
	}
	

}
