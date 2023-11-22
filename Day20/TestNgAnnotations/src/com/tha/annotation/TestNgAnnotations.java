package com.tha.annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

		@BeforeSuite
		public void beforeSuite() {
			System.out.println("------------beforeSuite execute--------------");
		}
		
		@BeforeTest // It is based on module 
		public void beforeTest() {
			System.out.println("==================beforeTest execute===========");
		}
		
		@BeforeClass
		public void beforeClass() {
			System.out.println("+++++++++++++++beforeClass execute+++++++++++++");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("+++++++++++++++beforeMethod execute+++++++++++++");
		}
		
		@Test(priority = 1)
		public void test1() {
			System.out.println("Test1 Execute...");
		}
		
		@Test(priority = 2)
		public void test2() {
			System.out.println("Test2 Execute...");
		}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("+++++++++++++++afterMethod execute+++++++++++++");
		}
		
		@AfterClass
		public void afterClass() {
			System.out.println("+++++++++++++++afterClass execute+++++++++++++");
		}
		
		@AfterTest
		public void afterTest() {
			System.out.println("==================afterTest execute===========");
		}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("------------afterSuite execute--------------");
		}
		
	
}
