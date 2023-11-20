package com.tha.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	WebDriver driver;
	
//	public void browserSetteing(String url) {
	public void browserSetteing1() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
//		driver.get(url);
		driver.get(readPropertyFiles1());
	}
	
	
	public void browserSetteing(String url) {
		
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			
		}
	
	public void locators() {
		
		
		driver.findElement(By.linkText("Register a new membership")).click();
		driver.findElement(By.id("name")).sendKeys("Sumit");
		driver.findElement(By.name("mobile")).sendKeys("9960556397");
		
		 List<WebElement> listElement= driver.findElements(By.tagName("input"));
		 
		 for(int i=0;i<listElement.size();i++) {
			 WebElement element=listElement.get(i);
			 
			 if(element.getAttribute("placeholder").equalsIgnoreCase("email")) {
				 element.sendKeys("sumit@gmail.com");
			 }else if(element.getAttribute("placeholder").equalsIgnoreCase("password")) {
				 element.sendKeys("123456");
			 }
			 
		 }
		 
		 driver.findElement(By.className("btn")).click();
		 Alert alert= driver.switchTo().alert();
		 alert.accept();
		 driver.switchTo().defaultContent();
		 
		 driver.navigate().back();
		 driver.navigate().forward();
		 
		
	}
	
	
	public void accessWebTable() {
		
		 List<WebElement> rowList= driver.findElements(By.tagName("tr"));
		 for(int i=1;i<rowList.size();i++) {
			
			 List<WebElement> colList= rowList.get(i).findElements(By.tagName("td"));
			 
			 for(int j=0;j<8;j++) {
				 System.out.print(colList.get(j).getText()+"\t");
			 }
			 System.out.println("");			 
			 
			 
		 }
		 
		
	}
	
	public void windowHandles() {
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).click();
		
		ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
		
		for(int i=0;i<list.size();i++) {
			if(i!=0) {
				driver.switchTo().window(list.get(i));
				driver.close();
			}
		}
		
		driver.switchTo().window(list.get(0));
				
	}
	
	public void readPropertyFiles() {
		FileInputStream fis=null;
		Properties props=null;
		try {
			 fis=new FileInputStream("D:\\238Selenium_Workspace\\configData\\myconfig.properties");
		
			 props=new Properties();
			 props.load(fis);
			 
			String strUsername= props.getProperty("username");
			String strUrl= props.getProperty("url");
			System.out.println(strUsername);
			System.out.println(strUrl);
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				props=null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
	}
	
	public String readPropertyFiles1() {
		FileInputStream fis=null;
		Properties props=null;
		String url=null;
		
		try {
			 fis=new FileInputStream("D:\\238Selenium_Workspace\\configData\\myconfig.properties");
		
			 props=new Properties();
			 props.load(fis);
			 
			
			 url= props.getProperty("url");
			
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				props=null;
				
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
	
	
	public void readExcelSheet() {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\238Selenium_Workspace\\ExcelSheet\\testdata.xlsx");
			
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int rowCount=sheet.getLastRowNum();
			
//			XSSFRow row=sheet.getRow(0);
//			XSSFCell cell=row.getCell(0);
//			 String strdata= cell.getStringCellValue();
//			 System.out.println(strdata);
			
			for(int i=0;i<=rowCount;i++) {
				
				XSSFRow row= sheet.getRow(i);
				
				int colCount=row.getLastCellNum();
				
				for(int j=0;j<colCount;j++) {
				
					XSSFCell cell= row.getCell(j);
					
					System.out.println(cell.getStringCellValue());
					
				}
				
				
			}
			
			
			 workbook.close();
			 fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	public void dynamicXapth() {
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("sumit");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("sumit");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
