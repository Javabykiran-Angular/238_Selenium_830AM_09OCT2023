package com.tha.testng;

import org.testng.annotations.Test;

public class DashBoard {
	
	@Test(priority = 1)
	public void titleTestCase() {
		System.out.println("titleTestCase execute...");
	}

	@Test(priority = 2)
	public void labelTestCase() {
		System.out.println("labelTestCase execute...");
	}

}
