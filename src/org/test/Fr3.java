package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fr3 {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://netbanking.hdfcbank.com/netbanking/");
driver.switchTo().frame("login_page");
Thread.sleep(1000);

WebElement user=driver.findElement(By.xpath("//input[@type='text']"));
user.sendKeys("Selenium");
driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
driver.findElement(By.xpath("(//input[@type='password'])[2]")).click();

}
}