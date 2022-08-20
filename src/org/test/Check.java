package org.test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {
	public static void main(String args[]) throws InterruptedException {
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//url launching
		driver.get("https://www.zappos.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement sign=driver.findElement(By.xpath("//a[text()='Sign In / Register']"));
	sign.click();
	
	WebElement zapp=driver.findElement(By.xpath("//a[text()='Sign in with Zappos']"));
	zapp.click();
	String parentId=driver.getWindowHandle();
	Set<String> allwindow=driver.getWindowHandles();
	for(String each:allwindow) {
		if(!parentId.equals(each)) {
			driver.switchTo().window(each);
		}
	}
	
	 WebElement user=driver.findElement(By.name("email"));
     user.sendKeys("greens");
     
     WebElement pass=driver.findElement(By.name("password"));
     pass.sendKeys("12345");
     
  System.out.println("hi");
  System.out.println("Anitha");
  System.out.println("Hello");
  
	}

}
}
