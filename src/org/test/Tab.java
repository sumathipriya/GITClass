package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		WebElement table=driver.findElement(By.xpath("//table[@border='l']"));
		List<WebElement> allRow=table.findElements(By.tagName("tr"));
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//int size=allRow.size();
		//System.out.println(size);
		
		//WebElement secondRow=allRow.get(1);
		//List<WebElement> particularData=secondRow.findElements(By.tagName("td"));
		//WebElement singlevalue=particularData.get(1);
		//String text=singlevalue.getText();
		//System.out.println(text);
		
	//	for(int i=0;i<prtall.size();i++)
		//{
			//WebElement singleRow=prtall.get(i);
			//String text=singleRow.getText();
			//System.out.println(text);
		//}
}
}