package org.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://output.jsbin.com/osebed/2");
		WebElement fruit=driver.findElement(By.id("fruits"));
		
		//fruit.findElement(By.tagName("option"));
		Select s=new Select(fruit);
		//boolean multi=s.isMultiple();
		//System.out.println(multi);
		s.selectByIndex(0);
s.selectByIndex(1);
s.selectByIndex(2);
s.selectByIndex(3);
WebElement firstOpt=s.getFirstSelectedOption();
System.out.println(firstOpt.getText());
		
		//s.selectByValue("orange");
		//s.selectByVisibleText("Grape");
		
	//List<WebElement> selectedOpt =s.getAllSelectedOptions();
	//for(WebElement itrOpt:selectedOpt) {
		//System.out.println(itrOpt.getText());
		
		
	//}
	//WebElement firstOpt=s.getFirstSelectedOption();
	//System.out.println(firstOpt.getText());
	//List<WebElement> deselectOpt=s.deselectAll();
	//for(WebElement itrOpt:deselectOpt) {
		//System.out.println(itrOpt.getClass());
	}
	//s.deselectByIndex(0);
	//s.deselectByIndex(2);
	//s.deselectByIndex(4);
	//System.out.println("3");
}
