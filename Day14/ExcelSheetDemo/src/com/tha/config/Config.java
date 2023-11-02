package com.tha.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Config {
	
	
	public void accessExcelSheet() {
		FileInputStream fis=null;
		XSSFWorkbook workbook=null;
		
		try {
			 fis=new FileInputStream("D:\\238Selenium_Workspace\\ExcelSheet\\testdata.xlsx");
			
			 workbook=new XSSFWorkbook(fis);
			
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
			int rowcount= sheet.getLastRowNum();
			
			System.out.println("=> Row num "+rowcount);
			
			for(int i=0;i<=rowcount;i++) {
				
				XSSFRow row= sheet.getRow(i);
				int colCount= row.getLastCellNum();
				System.out.println("Col count => "+colCount);
				for(int j=0;j<colCount;j++) {
					XSSFCell cell=row.getCell(j);
					
					System.out.println("=> "+cell.getStringCellValue());					
				}					
				
			}			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				workbook.close();
				fis.close();
				fis=null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	public void readExcelSheet() {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\238Selenium_Workspace\\ExcelSheet\\testdata.xlsx");
		
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
			XSSFRow row=sheet.getRow(0);
			XSSFCell cell=row.getCell(0);
			
			String strUsername = cell.getStringCellValue();
			
			System.out.println("=> "+strUsername);
			
			XSSFCell cell2=row.getCell(1);
			System.out.println("=> "+cell2.getStringCellValue());
			
			
			
			workbook.close();
			fis.close();
			fis=null;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	

}
