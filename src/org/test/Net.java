package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Net {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(2000);
	driver.switchTo().frame(driver.findElement(By.name("login_page")));
	
	WebElement click=driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	click.sendKeys("selenium");
	driver.findElement(By.xpath(""));
	driver.findElement(By.xpath(""));
	driver.findElement(By.xpath(""));
		


}
}