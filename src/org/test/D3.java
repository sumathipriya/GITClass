package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement accBtn=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		accBtn.click();
		Thread.sleep(1000);
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select s=new Select(date);
		s.selectByIndex(0);
		List<WebElement> evenNumer=s.getOptions();
		int n=100;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+" ");
				
			}
		}
		
		

}
}