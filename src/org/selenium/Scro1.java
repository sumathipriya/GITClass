package org.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scro1 {
	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstech.in/selenium-course-content.html");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement scroll = driver.findElement(By.xpath("//div[@class='card-headerframework d-flex align-items-center justify-content-between']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		
		
		
		
}
}



