package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ale {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//Handle the Alert-simple
		//Alert a=driver.switchTo().alert();
		//a.accept();
		//Confirm
		//WebElement confirm=driver.findElement(By.xpath("//a[contains(text(),'with OK & Cancel')]"));
		//confirm.click();
		
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//handle the alert confirm
		//Alert a=driver.switchTo().alert();
		//String text=a.getText();
		//System.out.println(text);
		//a.dismiss();
		
		//prompt
		WebElement prompt=driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]"));
		prompt.click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		//handle the alert
		Alert a=driver.switchTo().alert();
		
		//Get the text from the alert box
		String text=a.getText();
		System.out.println(text);
		//pass values to the text box
		a.sendKeys("greens");
		
		//click ok
		a.accept();
		
		
		
		
		
	}

}
