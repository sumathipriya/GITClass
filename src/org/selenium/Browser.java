package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Browser {
	public static void main(String args[])
	{
		//step 1 BROWSER CONFIGURATION

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//STEP 2 BROWSER LAUNCH----->up casting
		WebDriver driver=new ChromeDriver();
		//url launching
		//driver.get("https://www.facebook.com/");
		//driver.get("https://www.amazon.in/");
		driver.get("http://greenstech.in/selenium-course-content.html");
		//current page title
		String currentPageTitle=driver.getTitle();
		System.out.println(currentPageTitle);
		//current page url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
		
}
}