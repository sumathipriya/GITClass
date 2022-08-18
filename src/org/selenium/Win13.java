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

public class Win13 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		Actions a=new Actions(driver);
		WebElement phone=driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		a.contextClick(phone).perform();
		Robot r=new Robot();
		for(int i=0;i<2;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//print the cost
		String parentId=driver.getWindowHandle();
		Set<String> allwindow=driver.getWindowHandles();
		for(String each:allwindow) {
			if(!parentId.equals(each)) {
				driver.switchTo().window(each);
			}
		}
		
	WebElement cost=driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));
	String price=cost.getText();
	System.out.println(price);
		
		


}
}