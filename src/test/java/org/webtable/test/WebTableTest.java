package org.webtable.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("onward_cal"));
		
		search.click();
		
//		WebElement date=driver.findElement(By.xpath("//td[text()='24']"));
//		
//		date.click();
		
//		List<WebElement>row=driver.findElements(By.tagName("tr"));
//		
//		int rowcount=row.size();
//		
//		for(int i=0;i<rowcount;i++) {
//			
//			WebElement frow=row.get(i);
//			List<WebElement> data=frow.findElements(By.tagName("td"));
//			
//			int dcount=data.size();
//			
//			for (int j=0;j<dcount;j++) {
//				
//				WebElement fdata=data.get(j);
//				
//				String 	date=fdata.getText();
//				
//				
//				
//				if(date.equals("20")) {
//					
//					System.out.println(date);
//					
//					fdata.click();
//					break;
//				}
//				
//			}
//		}
		
		WebElement date=driver.findElement(By.xpath("//td[text()='24']/parent::tr//following-sibling::tr//descendant::td[text()='29']"));
		date.click();

	}

}
