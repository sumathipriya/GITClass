package org.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sqa {
	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement scroll = driver.findElement(By.xpath("(//div[@class='card-body'])[6]"));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		
		js.executeScript("arguments[0].setAttribute('value','Selenium Training Benefit')",scroll);
		
		Object retriveEnterTxt=js.executeScript("return arguments[0].getAttribute('value')", scroll);
		String s=(String)retriveEnterTxt;
		System.out.println(s);
		
		
		
		
		
}
}




