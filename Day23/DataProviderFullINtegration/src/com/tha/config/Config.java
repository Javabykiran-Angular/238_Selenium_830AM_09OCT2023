package com.tha.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void browserSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		String url=readPropertyFile();
		driver.get(url);
	}
	
	public WebElement accessById(String id) {
		return driver.findElement(By.id(id));
	}
	
	public WebElement accessByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement accessByClass(String classname) {
		return driver.findElement(By.className(classname));
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
	
	public Object [][] readExcelSheet(String path) {
		String[][] tabArray = null;
		int ci,cj;
		
		FileInputStream fis=null;
		XSSFWorkbook workbook=null;
		
		try {
			fis=new FileInputStream(path);
			//fis=new FileInputStream("D:\\238Selenium_Workspace\\ExcelSheet\\testdata.xlsx");
			
			 workbook=new XSSFWorkbook(fis);
			XSSFSheet objSheet=workbook.getSheet("Sheet1");
			
			int rowcount=objSheet.getLastRowNum();
//			System.out.println(rowcount);
			
			   tabArray=new String[rowcount+1][2];
			ci=0;
			for(int i=0;i<=rowcount;i++,ci++) {
				cj=0;
				XSSFRow row=objSheet.getRow(i);
				
				for(int j=0;j<2;j++,cj++) {
					//System.out.println("---> "+row.getCell(j));
					tabArray[ci][cj]=row.getCell(j).getStringCellValue();
					//System.out.println("Table data --->"+tabArray[ci][cj]);
				}
				//System.out.println("=============");
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally {
			try {
				fis.close();
				fis=null;
				workbook.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return tabArray;
		
		
	}
	

}
