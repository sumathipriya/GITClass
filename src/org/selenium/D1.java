package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement accBtn=driver.findElement(By.xpath("//a[text()='Create New Account']"));
	accBtn.click();
	Thread.sleep(1000);
	WebElement year=driver.findElement(By.name("birthday_year"));

	Select s=new Select(year);
	s.selectByIndex(21);
	
	
	List<WebElement> allOptions=s.getOptions();
	
	
	
	for(int i=0;i<allOptions.size();i++) {
		WebElement itrOpt=allOptions.get(i);
		String attribute=itrOpt.getAttribute("value");
		System.out.println(attribute);
	}
	
	
	
	
}
}
