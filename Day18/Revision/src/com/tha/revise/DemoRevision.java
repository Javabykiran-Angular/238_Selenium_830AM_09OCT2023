package com.tha.revise;

import com.tha.config.Config;

public class DemoRevision extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoRevision obj=new DemoRevision();
		//obj.browserSetteing("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		//obj.browserSetteing("file:///D:/SeleniumSoftware/Offline%20Website/pages/examples/users.html");
		// obj.browserSetteing("file:///D:/SeleniumSoftware/Offline%20Website/pages/examples/dashboard.html");
//		obj.locators();
		
//		obj.accessWebTable();
//		obj.windowHandles();
//		obj.readPropertyFiles();
		
//		obj.browserSetteing();
		
//		obj.readExcelSheet();
		
		
		obj.browserSetteing("https://register.rediff.com/register/register.php?FormName=user_details");
		obj.dynamicXapth();
		
	}

}
