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

public class Win11 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement hp=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		hp.sendKeys("hp laptop");
		WebElement search=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		search.click();
		
				Actions a=new Actions(driver);
				WebElement phone=driver.findElement(By.xpath("((//img[@class='_396cs4 _3exPp9'])[1]"));
				a.contextClick(phone).perform();
				Robot r=new Robot();
				for(int i=0;i<2;i++) {
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
				}
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
		String parentId=driver.getWindowHandle();
		Set<String> allwindow=driver.getWindowHandles();
		for(String each:allwindow) {
			if(!parentId.equals(each)) {
				driver.switchTo().window(each);
			}
		}
		WebElement cost=driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]"));
		String price=cost.getText();
		System.out.println(price);
}
}