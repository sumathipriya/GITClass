package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser1 {
	public static void main(String args[])
	{
		//step 1 BROWSER CONFIGURATION

		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		//STEP 2 BROWSER LAUNCH
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		String currentPageTitle=driver.getTitle();
		System.out.println(currentPageTitle);
		//current page url
				String url=driver.getCurrentUrl();
				System.out.println(url);
				driver.close();
				
	
				
		
}
}


