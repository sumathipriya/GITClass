package org.selenium;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {
	public static void main(String[] args) throws AWTException, IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);//temp
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Images\\facebook.png");
		FileUtils.copyFile(src, dest);
}
}