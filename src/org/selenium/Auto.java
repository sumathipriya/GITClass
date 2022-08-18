package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	//simple alert
			driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
			driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
			Alert a=driver.switchTo().alert();
			String info=a.getText();
			System.out.println(info);
			
		a.accept();
	
	
	

	
	
	
	
	
	//	prompt alert
	//driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		//driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		//switch to alert
//	Alert a=	driver.switchTo().alert();
	//get info
//	String text=a.getText();
//	System.out.println(text);
	//pass value to box
//	a.sendKeys("selenium");
	//ok button
//	a.accept();
	
		
		
		
	}}	
//------------------------------------------------------------------------------------------------		
		
		//simple alert
		//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//switch into the alert
		//Alert a=driver.switchTo().alert();
		
//get information
		//String info=a.getText();
		//System.out.println(info);
		//click ok
	//a.accept();
//}
//}

//upcasting
		//int a=20;
		//long l=a;
		//System.out.println(l);
		//Downcasting
		//long lo=2943;
		//int i=(int)lo;
		//System.out.println(i);

