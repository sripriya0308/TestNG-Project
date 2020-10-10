package org.base.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxTest {

	
	WebDriver driver;
	@BeforeClass
	public void browserLaunch() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void loadUrl() {
		
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
	}
	
	@Test
	public void test() throws InterruptedException {
		
		List<WebElement> li=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement wb:li) {
		if(!wb.isSelected()) {
			
			wb.click();
		}
	}
	}
		
		@AfterClass
		public void quitBrowser() {
			
			driver.quit();
		}
		
}
	

