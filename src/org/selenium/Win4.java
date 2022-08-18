package org.selenium;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
		WebElement seltest = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",seltest);
		WebElement day10 = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		js.executeScript("arguments[0].click()",day10);
		WebElement winHandling = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
		js.executeScript("arguments[0].click()",winHandling);
		String parentId = driver.getWindowHandle();
        Set<String> allwindow = driver.getWindowHandles();
        for(String each:allwindow) {
        	if(!parentId.equals(each)) {
        		driver.switchTo().window(each);
        	}}
        WebElement ques = driver.findElement(By.tagName("pre"));
		String text=ques.getText();
        System.out.println(text);

       
}



}

