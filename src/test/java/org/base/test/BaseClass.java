package org.base.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;



public class BaseClass {
	
	
	public static WebDriver driver;
//	public  static EventFiringWebDriver eventFiringWebDriver;
//	public static EventFiring eventFiring;
	
	
	public void getChromeDriver() {
		
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sripriya\\eclipse-workspace\\TestCucumber\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
//		eventFiringWebDriver=new EventFiringWebDriver(driver);
//		eventFiringWebDriver.register(eventFiring);
	}
	
	public static void IeDriver() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Driver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		
		
	}
	
	
	public static void firefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		
	}
	public static void launchUrl(String url) {
		
		driver.get(url);
	}
	
	public static void fill(WebElement element,String user) {
		
		element.sendKeys(user);
	}
	
	
	public static void click(WebElement element) {
		
		element.click();
	}
	
	
	public static String getText(WebElement element) {
		String text=element.getText();
		return text;
	}
	
	public static String getAttribute(WebElement element, String attname) {
		
		String attribute=element.getAttribute(attname);
		return attribute;
	}
	
	
	public static void mouseAction(WebElement element) {
		
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	public static void jsSetAttribute(String attvalue, WebElement element) {
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].setAttribute('value', "+attvalue+")", element);
	}
	
	public static void scrollDown(WebElement element) {

		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView('true')", element);
		
	}
	
		
	public static  void scrollUp(WebElement element) {
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView('false')", element);
		
	}

   public static String jsgetAttribute(WebElement element) {
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		Object ob=je.executeScript("return arguments[0].getAttribute('value')", element);
		String attvalue=(String)ob;
		return attvalue;
	}
   
   public static void screenshot(String fname) throws IOException {
	   
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   File des=new File("C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Screenshot\\"+fname+".png");
	   FileUtils.copyFile(src,des);
   }
   
   
   
     public static void alertAccept() {
	   
	   Alert al=driver.switchTo().alert();
	   al.accept();
	   
   }
   
   public static void alertDismiss() {
	   Alert al=driver.switchTo().alert();
	   al.dismiss();
   }
   
   public static String alertText() {
	   Alert al=driver.switchTo().alert();
	   String text=al.getText();
	   return text;
	   
   }
   
   public static void dropDown(WebElement element, String text) {
	   
	   Select sl=new Select(element);
	   sl.selectByVisibleText(text);
   }
   
   public static String getUrl() {
	   String url=driver.getCurrentUrl();
	   return url;
   }
   
   public static void rightClick(WebElement element) {
	   
	   Actions ac=new Actions(driver);
	   ac.contextClick(element).perform();
   }
	
   
   public static String fileRead(int rowno,int cellno) throws IOException {
	   
	   File f=new File("C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Excel\\hotelbookingdetails.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fi);
		
		Sheet s=wb.getSheet("TestData");
		String name=null;
				
		
			      Row row=s.getRow(rowno);
			
			
				Cell cell=row.getCell(cellno);
				
				int type=cell.getCellType();
				if(type==1) {
					
					 name=cell.getStringCellValue();
					//System.out.println(a);
				}
				
				else if(type==0) {
					
					if(DateUtil.isCellDateFormatted(cell)) {
						Date date=	cell.getDateCellValue();
						SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy");
						 name=sf.format(date);
						
					}
					
					else {
						double d=cell.getNumericCellValue();
						long ln=(long)d;
						 name=String.valueOf(ln);
						
					}
					
				}
				
				
			
			
		
		
		return name;
		
		
		
		
   }
   
   
   @DataProvider(name="data")
	public Object[][] getData(){
		
		Object[][] ob=new Object[][]{
{"sripriya02","W5K24G","Sydney","Hotel Hervey","Standard","5 - Five","2 - Two","2 - Two","sri","priya","chennai","1234567894327780","VISA","March","2022","1236","firstorder"},
{"sripriya02","W5K24G","Sydney","Hotel Hervey","Standard","5 - Five","2 - Two","2 - Two","mary","raj","chennai","1234567894327781","VISA","April","2021","1235","secondorder"},
{"sripriya02","W5K24G","Sydney","Hotel Hervey","Standard","5 - Five","2 - Two","2 - Two","krish","jain","chennai","1234567894327782","VISA","May","2020","1239","thirdorder"},
{"sripriya02","W5K24G","Sydney","Hotel Hervey","Standard","5 - Five","2 - Two","2 - Two","mina","roy","chennai","1234567894327783","VISA","June","2019","1230","fourthorder"}

		};
		
		return ob;

	}

}
