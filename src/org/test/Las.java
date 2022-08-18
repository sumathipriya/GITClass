package org.test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Las {
	public static void main(String args[]) throws IOException, AWTException
	{
		//step 1 BROWSER CONFIGURATION

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//STEP 2 BROWSER LAUNCH----->up casting
		WebDriver driver=new ChromeDriver();
		//url launching
		driver.get("https://demo.guru99.com/test/guru99home//");
		driver.manage().window().maximize();
		WebElement txtemail=driver.findElement(By.xpath("//input[@placeholder='Enter Email']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoView(false)", txtemail);
		//switch into frame
		driver.switchTo().frame("a077aa5e");
		
		WebElement jmeter=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmeter.click();
		
		//come out of frame
		driver.switchTo().parentFrame();
		txtemail.sendKeys("greens");
		WebElement  blog=driver.findElement(By.xpath("(//a[@class='item'])[1]"));
		blog.click();
		
		
	

}
}
