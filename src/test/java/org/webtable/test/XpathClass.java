package org.webtable.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sripriya\\eclipse-workspace\\TestCucumber\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tesco.com/");
		
		
		//child
		WebElement type=driver.findElement(By.xpath("(//select[@title='Select a category to search']//child::option[text()='Clubcard'])[1]"));
//		type.click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", type);
		
		//preceding-sibling
		
		WebElement check=driver.findElement(By.xpath("(//span[text()='Special Offers']//preceding-sibling::span)[1]"));
		//xpath function-contains
		
		WebElement search=driver.findElement(By.xpath("//input[contains(@title,'Enter search')]"));
		
		//xpath-function starts-with
		WebElement grocery=driver.findElement(By.xpath("//a[starts-with(@title,'Gro')]"));
		
		//Without tags and last() function
		WebElement relevent=driver.findElement(By.xpath("//*[@id='sort-by']//child::option[last()]"));
		
		//Following-sibling
		WebElement help=driver.findElement(By.xpath("//li[@class='styled__ListItem-sc-1pj7ufq-0 cHciVv beans-appbar__menu-item beans-menu__menu-item']//following-sibling::li"));
		
		//absolute xpath
		
		WebElement helplink=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/input"));
		//Parent
		
		WebElement offrcheck=driver.findElement(By.xpath("(//button//parent::div)[1]"));
		
		//ancestor
		
		WebElement image=driver.findElement(By.xpath("(//input//ancestor::div)[100]"));
		
		
		
		
		
		
		
		
		

	}

}
