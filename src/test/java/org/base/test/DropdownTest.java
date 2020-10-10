package org.base.test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest {

	
	static WebDriver  driver;
	@BeforeClass
	public void browserLaunch() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void loadUrl() {
		
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
	}
	
	@Test
	public void test() {
		
		
		WebElement wb=driver.findElement(By.xpath("//select[@name='country']"));
		Select se=new Select(wb);
		
		List<WebElement> op=se.getOptions();
		for(WebElement we:op) {
			
			System.out.println(we.getText());
		}
		
		//Keyboard actions
		
		
		WebElement name=driver.findElement(By.xpath("//input[@name='firstName']"));
				
				Actions ac=new Actions(driver);
		ac.moveToElement(name).sendKeys(name, "test").build().perform();
		
	}
	
//	@AfterClass
//	public void quitBrowser() {
//		
//		driver.quit();
//	}
	
	
}
