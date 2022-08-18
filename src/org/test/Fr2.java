package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fr2 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");

	WebElement enter=driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
	enter.click();
	WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
	submit.click();
	
//WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
//submit.click();
Alert a=driver.switchTo().alert();
a.accept();
}
}