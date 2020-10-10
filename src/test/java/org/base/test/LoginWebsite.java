package org.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWebsite {
	
	WebDriver driver;
	@BeforeClass
	public void browserLaunch() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void loadUrl() {
		
		
		driver.get("https://www.website.com/sign-in/");
		
	}
	
	@Test
	public void logn() {
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("test");
		
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("test");
		
		WebElement login= driver.findElement(By.id("signin-submit2"));
		login.click();
		
				
		
	}
	
	@AfterClass
	public void quitBrowser() {
		
		driver.quit();
	}

}
