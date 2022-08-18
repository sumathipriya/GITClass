package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		WebElement ggTxt = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		ggTxt.sendKeys("greens velmurgam ");
		//String text=ggTxt.getText();
		ggTxt.click();
		
		
		
		
		//driver.get("https://accounts.google.com/signup/v2/webcreateaccount?h1=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		//WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		//firstName.sendKeys("Sumathi");
		//WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		//lastName.sendKeys("123456789");
		//WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
	     //userName.sendKeys("sumathi@123");
		//WebElement password = driver.findElement(By.xpath("//input[@name='Passwd']"));
		//password.sendKeys("sfhyb");
		//WebElement password1 = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		//password1.sendKeys("sfhyb");
		
	}
}
