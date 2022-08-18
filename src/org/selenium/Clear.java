package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/trains");
		WebElement from=driver.findElement(By.xpath("//input[@id='from_station']"));
		from.sendKeys("chennai");
		
		WebElement to=driver.findElement(By.xpath("//input[@id='to_station1']"));
		to.sendKeys("banglore");
		

}
}
