package org.FileRead.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Excel\\Writeexcel.xlsx");
		
		
		
       FileInputStream fi=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fi);
		
		Sheet s=wb.getSheet("TestData");
		
		Row r=s.getRow(0);
		
		Cell c=r.getCell(0);
//		System.out.println(c.getStringCellValue());
		
//		System.out.println(c);
		
       String value=c.getStringCellValue();
		
		if(value.equals("Sri")) {
			
			c.setCellValue("vidhya");
		}
		

		FileOutputStream fo=new FileOutputStream(f);
		
		wb.write(fo);
		
		
	}

}
