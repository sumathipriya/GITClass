package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser2 {
	public static void main(String args[])
	{
	//step 1 BROWSER CONFIGURATION
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.facebook.com/");
		//driver.get("https://www.amazon.in/");
		driver.get("http://greenstech.in/selenium-course-content.html");
		String currentPageTitle=driver.getTitle();
		System.out.println(currentPageTitle);
		//current page url
				String url=driver.getCurrentUrl();
				System.out.println(url);
				driver.close();
		

}
}
