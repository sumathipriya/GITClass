package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//WebElement userName=driver.findElement(By.id("src"));
		//userName.sendKeys("chennai");
		
		//WebElement iD=driver.findElement(By.id("dest"));
		//iD.sendKeys("banglore");
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		mobileNumber.sendKeys("123456789");
		WebElement btnLogin = driver.findElement(By.xpath("//div[@id='otp-container']"));
		btnLogin.click();
	
		
}
}