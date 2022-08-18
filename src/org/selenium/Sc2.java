package org.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc2 {
	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement emailTxt=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		js.executeScript("arguments[0].setAttribute('value','sumathi@gmail')",emailTxt);
		
		WebElement passTxt=driver.findElement(By.xpath("//div[@id='passContainer']"));
		js.executeScript("arguments[0].setAttribute('value','745661')",passTxt);
		
		Object retriveEnterTxt=js.executeScript("return arguments[0].getAttribute('value')", passTxt);
		String s=(String)retriveEnterTxt;
		System.out.println(s);
		
		WebElement loginBtn=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()",loginBtn);
		
		

}
}


