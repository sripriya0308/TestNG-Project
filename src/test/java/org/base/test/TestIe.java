package org.base.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("sripriya02");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("W5K24G");
		WebElement login=driver.findElement(By.id("login"));
		//login.click();
		
		JavascriptExecutor jc=(JavascriptExecutor)driver;
		jc.executeScript("arguments[0].click()",login);
		
		
		

	}

}
