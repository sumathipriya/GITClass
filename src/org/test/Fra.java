package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fra {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		WebElement b=driver.findElement(By.name("login_page"));	
		driver.switchTo().frame(b);
		WebElement a=driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		a.sendKeys("sumathi");
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		WebElement pass=driver.findElement(By.name("fldPassword"));
		pass.sendKeys("56713213");
	//	cont.click();
		//Alert a=driver.switchTo().alert();
		//a.accept();
		

}
}
