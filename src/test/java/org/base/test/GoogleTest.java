package org.base.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class GoogleTest {

	
	
	static WebDriver  driver;
	@BeforeClass
	public static  void browserLaunch() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	@Before
	public void loadUrl() {
		
		
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void test() {
		
		WebElement logoText=driver.findElement(By.xpath("//img[@alt='Google']"));
		Assert.assertTrue(logoText.isDisplayed());
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int count=li.size();
		
		System.out.println("no of links available in google page"+ count);
		
	}
	
	@AfterClass
	public void quitBrowser() {
		
		driver.quit();
	}
}
