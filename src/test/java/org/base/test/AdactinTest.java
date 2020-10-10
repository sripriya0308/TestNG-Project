package org.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinTest {
	
	
	WebDriver driver;
	@BeforeClass
	public void browserLaunch() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void loadUrl() {
		
		
		driver.get("https://adactin.com/");
		
	}
	
	@Test
	public void test() {
		
		String url=driver.getCurrentUrl();
		Assert.assertEquals("https://adactin.com/", url);
		
		String title=driver.getTitle();
		Assert.assertEquals("Australian IT Consulting Company | Microsoft, SAP, Adobe, Guidewire specialist - Sydney, Melbourne, Canberra, Brisbane | Adactin",  title);
	}

	
	@AfterClass
	public void quitBrowser() {
		
		driver.quit();
	}
}
