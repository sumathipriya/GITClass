package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLanuch {
	public static void main(String[] args) {
		//browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//Instatiations
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//to locate usename filed
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("Greens@123");
		//to locate password filed
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("greens");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
	
		
		
		
		
		
		
		
		
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe" );
		//WebDriver driver=new FirefoxDriver();
		//to pass url
		//driver.get("https://www.facebook.com/");
		//driver.get("https://www.greenstechnologys.com/");
		//driver.get("https://www.amazon.in/");
		//driver.get("http://greenstech.in/selenium-course-content.html");
		//to fetch title
		//String title=driver.getTitle();
		//System.out.println("Title:"+title);
		//to fetch url
		//String url=driver.getCurrentUrl();
		//System.out.println("url:"+url);
		//to close browser
		//driver.quit();
		
	}

}
