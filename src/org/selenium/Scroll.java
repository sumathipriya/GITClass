package org.selenium;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws AWTException, WebDriverException, IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstech.in/selenium-course-content.html");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement scrolldown = driver.findElement(By.xpath("(//h3[@class='mb-0'])[12]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);//temp
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Images\\gre.png");
		FileUtils.copyFile(src, dest);
		
		
		
		

}
}
