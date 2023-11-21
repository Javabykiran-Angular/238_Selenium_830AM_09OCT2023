package com.tha.testng;

import org.testng.annotations.Test;

public class DemoTestng {
	
	@Test(priority = 1,description = "login Test case")
	public void ltest() {
		System.out.println("U r in ltest case execute");
	}
	
	@Test(priority = 2,enabled = false)
	public void ptest() {
		System.out.println("U r in ptest case execute");
	}
	
	@Test(priority = 3)
	public void atest() {
		System.out.println("U r in atest case execute");
	}

}
