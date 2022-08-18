package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/login");
		WebElement emailTxt = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		emailTxt.sendKeys("sumathi");
		WebElement btnLogin = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btnLogin.click();
	

}
}