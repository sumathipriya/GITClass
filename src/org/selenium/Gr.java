package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gr {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		WebElement courses=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a=new Actions(driver);
		a.moveToElement(courses).perform();
		WebElement data=driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
		a.moveToElement(data).perform();
		WebElement micro=driver.findElement(By.xpath("//span[text()='Selenium']"));
		micro.click();
		//WebElement oracle=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		//a.moveToElement(courses).perform();
		//WebElement sql=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		//sql.click();

	}}


