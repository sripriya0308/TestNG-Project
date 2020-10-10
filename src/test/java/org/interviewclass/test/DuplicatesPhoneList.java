package org.interviewclass.test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicatesPhoneList {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\SeleniumFramework\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement textbox=driver.findElement(By.id("twotabsearchtextbox"));
		textbox.sendKeys("iphone 11");
		WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		
		
		
		List<WebElement> li=driver.findElements(By.xpath("//span[contains(text(),'iPhone 11')]"));
		
		System.out.println("Total no of search products"+li.size());
		
		for(WebElement wb:li) {
			
			
			System.out.println("All iphones list"+" "+wb.getText());
		}
		
		
		
     	
		Map<String,Integer> mp=new LinkedHashMap();
		
		for(WebElement wb:li) {
			
			String phonename=wb.getText();
			
			Integer count=mp.get(phonename);
			if(count==null) {
				
				
				mp.put(phonename, 1);
			}
			
			else {
				
				mp.put(phonename, ++count);
			}
			
		}
		
		System.out.println("************");
		
		System.out.println("iphone list duplicates count"+" "+mp);
		
		System.out.println("*******");
		
		Set<Entry<String,Integer>> sn=mp.entrySet();
		
		for(Entry<String,Integer> en:sn) {
			
			
			if(en.getValue()>1) {
				
				System.out.println("Duplicated iphone name"+en.getKey());
			}
		}
		
		String[] a=new String[li.size()];
		
		for(int i=0;i<li.size();i++) {
			
			
			
			 a[i]=li.get(i).getText();
			
			
		}
		
			
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				
				if(a[i].compareTo(a[j])<0) {
					
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		
		System.out.println("*********************************");
		
		for(String b:a) {
		
		System.out.println("iphone list in alphabetical ordery"+" "+b);
	}

		
		List<WebElement> li1=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		
		String[] price=new String[li1.size()];
		
		for(int i=0;i<li1.size();i++) {
			
			
			price[i]=li1.get(i).getText();
		}
		
		
		for(int i=0;i<price.length;i++) {
			
			
			for(int j=i+1;j<price.length;j++) {
				
				if(price[i].compareTo(price[j])<0) {
					
					
					String temp=price[i];
					price[i]=price[j];
					price[j]=temp;
				}
			}
		}
			
		
		System.out.println("***************************************");
		
		for(String c:price) {
			
			
			
			System.out.println("prices in sorted list"+" "+c);
			
		}
			
		driver.quit();
		
		

		
		
		
		

	}

}
