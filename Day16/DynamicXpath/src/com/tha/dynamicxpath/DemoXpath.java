package com.tha.dynamicxpath;

import com.tha.config.Config;

public class DemoXpath extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoXpath obj=new DemoXpath();
//		obj.browserSetting("https://www.w3schools.com/");
		
//		obj.browserSetting("https://register.rediff.com/register/register.php?FormName=user_details");
		
		obj.browserSetting("https://www.att.com/");
		
		
//		obj.accessElement();
		
//		obj.rediffmailElementAccess();
		obj.attElementAccess();

	}

}
