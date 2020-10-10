package org.webtable.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowResize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sripriya\\eclipse-workspace\\TestCucumber\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Dimension d=new Dimension(650, 400);
			
			driver.manage().window().setSize(d);

		

	}

}
