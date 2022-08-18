package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement prime=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		Actions a=new Actions(driver);
		a.moveToElement(prime).perform();
		
		WebElement si=driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		si.click();
		WebElement emailTxt=driver.findElement(By.id("ap_email"));
		emailTxt.sendKeys("sumathi@123");
		a.doubleClick(emailTxt).perform();
		Robot r=new Robot();
		for(int i=0;i<2;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
		//prime.click();
	//WebElement acc=driver.findElement(By.id("//a[@id='createAccountSubmit']"));
		//acc.click();
		//WebElement pre=driver.findElement(By.xpath("//span[text()='Your Recommendations']"));
		//a.moveToElement(pre).perform();
		
		//Actions a=new Actions(driver);
		//a.moveToElement(prime).perform();
		//WebElement fast=driver.findElement(By.xpath("//h1[@class= 'a-spacing-base a-spacing-top-medium'][1]"));
		//a.moveToElement(fast).perform();
	//fast.click();
	
	
		//WebElement userName = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//userName.sendKeys("iphone");

}
