package org.FileRead.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Excel\\TestExcel.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fi);
		
		Sheet s=wb.getSheet("TestData");
		
		Row r=s.getRow(1);
		
		int rowcount=s.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		
		int cellcount=r.getPhysicalNumberOfCells();
		System.out.println(cellcount);
		
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row row=s.getRow(i);
			
			
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell=row.getCell(j);
				
				int type=cell.getCellType();
				if(type==1) {
					
					String a=cell.getStringCellValue();
					System.out.println(a);
				}
				
				else if(type==0) {
					
					if(DateUtil.isCellDateFormatted(cell)) {
						Date date=	cell.getDateCellValue();
						SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy");
						String name=sf.format(date);
						//System.out.println(name);
					}
					
					else {
						double d=cell.getNumericCellValue();
						long ln=(long)d;
						String name=String.valueOf(ln);
						System.out.println(name);
					}
					
				}
				
				
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
