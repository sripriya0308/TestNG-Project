package org.FileRead.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteUpdate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Excel\\Writeexcel.xlsx");
		
		
		
   
		Workbook wb=new XSSFWorkbook();
		
		Sheet s=wb.createSheet("TestData");
		
		Row r=s.createRow(0);
		
		Cell c=r.createCell(0);
		
		c.setCellValue("Sri");
		
		
		FileOutputStream fo=new FileOutputStream(f);
		
		wb.write(fo);
		
		
		
		
	}

}
