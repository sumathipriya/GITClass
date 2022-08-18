package org.selenium;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Win10 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement hp=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		hp.sendKeys("Mask");
		WebElement search=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		search.click();
		Actions a=new Actions(driver);
	WebElement mask=driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
		a.doubleClick(mask);
		
		String parentId=driver.getWindowHandle();
		Set<String> allwindow=driver.getWindowHandles();
		for(String each:allwindow) {
			if(!parentId.equals(each)) {
				driver.switchTo().window(each);
			}
		}
}
}
