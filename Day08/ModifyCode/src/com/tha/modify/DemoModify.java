package com.tha.modify;

import com.tha.config.Configuration;

public class DemoModify extends Configuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoModify obj=new DemoModify();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.login();
		

	}

}
