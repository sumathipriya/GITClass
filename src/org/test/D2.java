package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement accBtn=driver.findElement(By.xpath("//a[text()='Create New Account']"));
	accBtn.click();
	Thread.sleep(1000);
	WebElement monthDay=driver.findElement(By.name("birthday_month"));
	Select s=new Select(monthDay);
	List<WebElement> allOptions=s.getOptions();
	WebElement jan=allOptions.get(0);
	String text=jan.getText();
	System.out.println(text);
	for(int i=0;i<allOptions.size();i++) {
		WebElement itrOpt=allOptions.get(i);
		System.out.println(itrOpt.getText());
	}
	

	

}
}