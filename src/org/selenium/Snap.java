package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snap {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");

		WebElement courses=driver.findElement(By.xpath("//span[text()='Women's Fashion']"));
		Actions a=new Actions(driver);
		a.moveToElement(courses).perform();
		WebElement rpa=driver.findElement(By.xpath("//span[text()='Footwear']"));
		rpa.click();
		WebElement blue=driver.findElement(By.xpath("//span[text()='Heels']"));
		blue.click();

}
}
		//WebElement emailTxt=driver.findElement(By.xpath("//span[text()='Men's Fashion']"));
		//emailTxt.click();
		
		
		
		
		
		
		
		
		//WebElement mobileNumber=driver.findElement(By.id("text"));
		//mobileNumber.sendKeys("123456789");
		//WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		//userName.sendKeys("sumathi@123");
		
		//WebElement btnLogin =driver.findElement(By.xpath("//input[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
		//btnLogin.click();
		
//}
//}


