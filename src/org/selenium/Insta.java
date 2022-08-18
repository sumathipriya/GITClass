package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Sumathi");
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("Sumathi123");
		WebElement btnLogin1 = driver.findElement(By.name("btn btn-primary login-btn"));
		btnLogin1.click();


}
}