package com.tha.testcase;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tha.config.Config;

public class DemoRadioTestCase extends Config {
	
	@BeforeClass
	public void openBrowser() {
		browserSetting();
	}
	
	@Test(priority = 1)
	public void radioTest() {
//		System.out.println("----------------");
		
		WebElement radioMaleElement=accessById("Male");
		
		radioMaleElement.click();
		
		boolean maleselect= radioMaleElement.isSelected();
		System.out.println(maleselect);
//		boolean expecteSelect=true;
		
		Assert.assertEquals(maleselect, true);
				
	}
	
	@Test(priority = 2)
	public void radioBtnSelect_female() {
		WebElement radioFemaleElement=accessById("Female");
		radioFemaleElement.click();
		boolean femaleSelect=radioFemaleElement.isSelected();
		Assert.assertEquals(femaleSelect, true);
		
	}
	
	@Test(priority = 3)
	public void radioBtnSelect_check() {
		WebElement radioFemaleElement=accessById("Female");
		WebElement radioMaleElement=accessById("Male");
		
		radioFemaleElement.click();
		boolean femaleSelect=radioFemaleElement.isSelected();
		
		if(radioFemaleElement.isSelected() && !radioMaleElement.isSelected()) {
			Assert.assertEquals(femaleSelect, true);
		}
		
		
		
	}
	
	

}
