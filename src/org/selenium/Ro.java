package org.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;


public class Ro {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp?gws_rd=ssl");
		Thread.sleep(2000);
		WebElement emailTxt=driver.findElement(By.name("//input[@class='gLFyf gsfi']"));
		emailTxt.sendKeys("Vel murgan");	
	Actions a=new Actions(driver);
	a.doubleClick(emailTxt).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);
	r.keyRelease(KeyEvent.VK_X);
	r.keyRelease(KeyEvent.VK_CONTROL);
	}

	//a.contextClick(emailTxt).perform();
		
		//WebElement emailTxt=driver.findElement(By.id("email"));
		//emailTxt.sendKeys("selenium");
		//Actions a=new Actions(driver);
		//a.doubleClick(emailTxt).perform();
		
	//	a.contextClick(emailTxt).perform();
	//	Robot r=new Robot();
	//	for(int i=0;i<3;i++) {
	//		r.keyPress(KeyEvent.VK_DOWN);
		//	r.keyRelease(KeyEvent.VK_DOWN);
		//}
	//	r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		//
		//
		//r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
	//	
//
	//	r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_V);
	//	r.keyRelease(KeyEvent.VK_CONTROL);
		
		}
	


