package org.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tool {
	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://toolsqa.com/");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement scrolldown =driver.findElement(By.xpath("//a[text()='Latest Articles']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		
		WebElement scrollup =driver.findElement(By.xpath("//a[@class='navbar__tutorial-menu']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollup);
		
		

}
}