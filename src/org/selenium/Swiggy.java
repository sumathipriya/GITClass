package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='mobile']"));
		phoneNumber.sendKeys("45223");
		WebElement userName= driver.findElement(By.xpath("//input[@id='name']"));
		userName.sendKeys("sumathi");
		WebElement emailTxt= driver.findElement(By.xpath("//input[@id='email']"));
		emailTxt.sendKeys("sumathi@123");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("113456");
		WebElement btnLogin = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnLogin.click();
}
}