package org.selenium;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement txtusr = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		txtusr.sendKeys("iphones 7");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement search = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		js.executeScript("arguments[0].click()",search);
		Thread.sleep(500);		
		WebElement phone = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		js.executeScript("arguments[0].click()",phone);      
        String parentId = driver.getWindowHandle();
        Set<String> allwindow = driver.getWindowHandles();
        for(String each:allwindow) {
        	if(!parentId.equals(each)) {
        		driver.switchTo().window(each);
        	}}
        WebElement addTo = driver.findElement(By.xpath("//span[text()='add to cart']"));
        addTo.click();
        WebElement pay = driver.findElement(By.xpath("(//span[@class='price'])[2]"));
        String cost = pay.getText();
        System.out.println(cost);
        	
	}


}
