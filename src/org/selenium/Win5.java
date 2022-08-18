package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Win5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(course).perform();
		WebElement python = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
		python.click();
		String parentId = driver.getWindowHandle();
        Set<String> allwindow = driver.getWindowHandles();
        for(String each:allwindow) {
        	if(!parentId.equals(each)) {
        		driver.switchTo().window(each);
        	}}
        WebElement explore = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		a.contextClick(explore).perform();
		Robot r=new Robot();
        for(int i=0;i<2;i++) {
        	r.keyPress(KeyEvent.VK_DOWN);
        	r.keyRelease(KeyEvent.VK_DOWN);
        }
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
}}




