package org.test;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {
	public static void main(String agrs[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement accBtn=driver.findElement(By.xpath("//a[text()='create new Account']"));
		WebElement acctBtn;
		acctBtn.click();
		Thread.sleep(2000);
		WebElement monthDd=driver.findElement(By.name("birthday_month"));
		Select s=new Select(monthDd);
		s.deselectByValue("11");
		boolean mul=s.isMultiple();
		System.out.println(mul);
		List<WebElement> allopts=s.getOptions();
		WebElement opt=allopts.get(1);
		System.out.println(opt.getText());
		for(WebElement itr:allopts) {
			System.out.println(itr.getText());
		}
		
		
	
		
		
		
		
		
	}

}
