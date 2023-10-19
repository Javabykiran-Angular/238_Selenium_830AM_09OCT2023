package com.tha.window;

import com.tha.config.Config;

public class DemoWindow extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoWindow obj=new DemoWindow();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.login();
		obj.dasboard();
		

	}

}
