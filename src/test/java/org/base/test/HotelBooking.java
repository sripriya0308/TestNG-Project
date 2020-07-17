package org.base.test;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.locators.test.HotelPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HotelBooking extends BaseClass {
	
	
	
	@Parameters({"Browser"})
	@BeforeClass(groups="functional")
	public void launchBrowser(String s) {
		
		if(s.equals("chrome")) {
		getChromeDriver();
		
		}
		 
		else if(s.equals("IE")){
			IeDriver();
						
			
		}
		
		else {
			
			System.out.println("invalid browser");
		}
			
			
		
		System.out.println("browser"+Thread.currentThread().getId());
		
		
	}
	
    @Parameters({"URL"})
	@BeforeMethod(groups="functional")
	public void launchHotelUrl(String s1) {
		
		Date d=new Date();
		launchUrl(s1);
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		 System.out.println("url"+Thread.currentThread().getId());
		
		
		
			
	}
	
	
	@AfterClass(groups="functional")
	public void closeBrowser() {
		
		driver.quit();
		System.out.println(Thread.currentThread().getId());
	}
	
		
		@Test(priority=-1,dataProvider="data" ,dataProviderClass=BaseClass.class,groups="functional")
		
		public void booking(String s1,String s2,String s3,String s4,String s5,String s6,
				String s7,String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15,String s16,String s17)  {

		try {
		
			
			 HotelPojo hp=new HotelPojo();
//			fill(hp.getUser(),fileRead(1,0);
//			fill(hp.getPass(),fileRead(1,1);
//			click(hp.getLogn());
//   	dropDown(hp.getLocation(),fileRead(1, 2));
//	dropDown(hp.getHotels(),fileRead(1, 3));
//	dropDown(hp.getRoomtype(),fileRead(1, 4));
//	dropDown(hp.getRoomno(),fileRead(1, 5));
//	dropDown(hp.getAdult(),fileRead(1, 6));
//	dropDown(hp.getChild(),fileRead(1, 7));
//	click(hp.getSearch());
//	click(hp.getRadio());
//	click(hp.getCont());
//	fill(hp.getFname(),fileRead(1, 8));
//	fill(hp.getLname(),fileRead(1, 9));
//	fill(hp.getAddr(),fileRead(1, 10));
//	fill(hp.getCredit(),fileRead(1,11));
//	dropDown(hp.getCtype(),fileRead(1, 12));
//	dropDown(hp.getMonth(),fileRead(1, 13));
//	dropDown(hp.getYear(),fileRead(1, 14));
//	fill(hp.getCvv(),fileRead(1, 15));
			fill(hp.getUser(),s1);
			fill(hp.getPass(),s2);
	//click(hp.getLogn());
	
	JavascriptExecutor jc=(JavascriptExecutor)driver;
	jc.executeScript("arguments[0].click()",hp.getLogn());
	
//	WebDriverWait wait=new WebDriverWait(driver,10);
//	wait.until(ExpectedConditions.visibilityOf(hp.getLocation()));
	
//	FluentWait fw=new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(100)).ignoring(Throwable.class);
	
   	dropDown(hp.getLocation(),s3);
	dropDown(hp.getHotels(),s4);
	dropDown(hp.getRoomtype(),s5);
	dropDown(hp.getRoomno(),s6);
	dropDown(hp.getAdult(),s7);
	dropDown(hp.getChild(),s8);
//	click(hp.getSearch());
	
	
	jc.executeScript("arguments[0].click()",hp.getSearch());
	
//	click(hp.getRadio());
	
	jc.executeScript("arguments[0].click()",hp.getRadio());
	
//	click(hp.getCont());
	
	jc.executeScript("arguments[0].click()",hp.getCont());
	
	fill(hp.getFname(),s9);
	fill(hp.getLname(),s10);
	fill(hp.getAddr(),s11);
	fill(hp.getCredit(),s12);
	dropDown(hp.getCtype(),s13);
	dropDown(hp.getMonth(),s14);
	dropDown(hp.getYear(),s15);
	fill(hp.getCvv(),s16);
//	click(hp.getBook());
	
	jc.executeScript("arguments[0].click()",hp.getBook());
	
	String order=getAttribute(hp.getOrderNo(),"value");
	System.out.println("order no is"+order);
//	click(hp.getLogout());
//	click(hp.getLoginag());
	
	screenshot(s17);
	
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("booking"+Thread.currentThread().getId());
		
		
		
		}
		
		
		@Test(priority=1, groups= {"smoke","functional"},invocationCount=5)
		
		public void testB() {
			
			System.out.println("B");
			System.out.println("B"+Thread.currentThread().getId());
		}
		
		
		@Test(enabled = false)
		
		public void testC(){
		
			
			
			
			System.out.println("C");
		
			
			
			
			
		}
		
		
	
	

	


	
	
}
