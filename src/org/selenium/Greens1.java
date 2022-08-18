package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		WebElement courses=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a=new Actions(driver);
		a.moveToElement(courses).perform();
		WebElement data=driver.findElement(By.xpath("//span[text()='Data Warehousing Training']"));
		a.moveToElement(data).perform();
		WebElement micro=driver.findElement(By.xpath("//span[text()='Microstrategy Training']"));
		micro.click();
		//WebElement oracle=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		//a.moveToElement(courses).perform();
		//WebElement sql=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		//sql.click();

	}}
		
		//WebElement velTxt=driver.findElement(By.xpath("//p[text()='Velmurugan ']"));
		//String text=velTxt.getText();
		//System.out.println(text);
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
			
		
		//WebElement grTxt=driver.findElement(By.xpath("//a[text()='All Branches']"));
		//grTxt.click();
		//String text=grTxt.getText();
	
		//System.out.println(text);
//}
//}
