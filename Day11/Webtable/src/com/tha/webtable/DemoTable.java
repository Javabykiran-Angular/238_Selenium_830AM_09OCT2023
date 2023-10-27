package com.tha.webtable;

import com.tha.config.Config;

public class DemoTable extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoTable obj=new DemoTable();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/pages/examples/users.html");
		
		obj.tableAutomate();
		
		

	}

}
