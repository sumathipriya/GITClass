package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bazaar.shopclues.com/?__ar=Y");
		WebElement sport=driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions a=new Actions(driver);
		a.moveToElement(sport).perform();
		WebElement weight=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
	weight.click();
	

		//WebElement ph=driver.findElement(By.name("//label[@for='Above 5000']"));
		//ph.click();
		//WebElement blue=driver.findElement(By.xpath("//span[text()='Blue Prism Training']"));
		//blue.click();

}
}
		

		
		//WebElement shTxt=driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		//shTxt.click();
		//String text=shTxt.getText();
		//System.out.println(text);
		

//}
//}
