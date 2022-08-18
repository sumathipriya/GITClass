package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		WebElement dep=driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions a=new Actions(driver);
		a.moveToElement(dep).perform();
		WebElement heat=driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(heat).perform();
		WebElement air=driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(air).perform();
		WebElement portt=driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		portt.click();

}
}
