package org.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fl1 {
	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement emailTxt=driver.findElement(By.xpath("(//span[@class='_36T8XR'])[1]"));
		js.executeScript("arguments[0].setAttribute('value','sumathi@gmail')",emailTxt);
		
		Object retriveEnterTxt1=js.executeScript("return arguments[0].getAttribute('value')", emailTxt);
		String s1=(String)retriveEnterTxt1;
		System.out.println(s1);
		
		
		WebElement passTxt=driver.findElement(By.xpath("(//span[@class='_36T8XR'])[2]"));
		js.executeScript("arguments[0].setAttribute('value','745661')",passTxt);
		
		
		Object retriveEnterTxt=js.executeScript("return arguments[0].getAttribute('value')", passTxt);
		String s=(String)retriveEnterTxt;
		System.out.println(s);
		
		WebElement loginBtn=driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		js.executeScript("arguments[0].click()",loginBtn);
		
		

}
}



