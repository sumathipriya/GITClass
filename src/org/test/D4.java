package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	//	WebElement accBtn=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		//accBtn.click();
		//Thread.sleep(1000);
		WebElement con=driver.findElement(By.name("country"));
		Select s=new Select(con);
		s.selectByIndex(10);
		List<WebElement> allOptions=s.getOptions();
		for(int i=0;i<allOptions.size();i++) {
			WebElement itrOpt=allOptions.get(i);
			String attribute=itrOpt.getAttribute("value");
			System.out.println(attribute);
		}
				
		
		
}
}