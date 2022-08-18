package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inhotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		WebElement emailTxt=driver.findElement(By.name("username"));
		emailTxt.sendKeys("selenium@123");
		
		WebElement pssTxt= driver.findElement(By.id("password"));
		pssTxt.sendKeys("12345");
		String enterTxt=emailTxt.getAttribute("value");
		System.out.println(enterTxt);
		
		String enterTxt1=pssTxt.getAttribute("value");
		System.out.println(enterTxt1);
		
		
		
		
		
		
}
}