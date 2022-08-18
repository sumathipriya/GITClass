package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement m=driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		Actions a=new Actions(driver);
		a.moveToElement(m).perform();
		
		//WebElement ah=driver.findElement(By.xpath("//button[text()='X']"));
		//ah.click();
		//Thread.sleep(1000);
		//WebElement home=driver.findElement(By.xpath("//div[text()='Home']"));
		//Actions a=new Actions(driver);
		//a.moveToElement(home).perform();
		//Thread.sleep(1000);
		//ah.click();
		//WebElement el=driver.findElement(By.xpath("//a[text()='Furniture Studio']"));
		//el.click();
	
		
		//WebElement tv=driver.findElement(By.xpath("//span[@class='_2I9KP_']"));
		//a.moveToElement(tv).perform();
		//WebElement mi=driver.findElement(By.xpath("//a[text()='Mi']"));
		//a.moveToElement(tv).perform();
		//mi.click();
		
		
		//WebElement home=driver.findElement(By.xpath("//div[text()='Home']"));
		//Actions a=new Actions(driver);
		//a.moveToElement(home).perform();
		//WebElement clean=driver.findElement(By.xpath("//a[@text()='Cleaning & Bath']"));
		//clean.click();
	//System.out.println(clean);
		
		
		
		//	WebElement h1=driver.findElement(By.xpath("//a[text()='Home Furnishings']"));
		//h1.click();
		//WebElement h2=driver.findElement(By.xpath("//div[@class='_1MR4o5']"));
		
		
		
		//h1[@class='_10Ermr']
		
		//WebElement emailTxt=driver.findElement(By.xpath("//div[text()='Appliances']"));
		///emailTxt.click();
		
		
		
		
		
		
				
		//WebElement passTxt=driver.findElement(By.name("password"));
//	passTxt.sendKeys("175236");
	
	
	
	
	
	
	//WebElement emailTxt = driver.findElement(By.id("email"));
	//emailTxt.sendKeys("sel@gmail");
	//String enterTxt=emailTxt.getAttribute("value");
		//System.out.println(enterTxt);
		
		
		
		//WebElement passTxt = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		//passTxt.sendKeys("123456789");
	
		//WebElement btnLogin = driver.findElement(By.xpath("//button[@class='class='_2KpZ6l _2HKlqd _3AWRsL']"));
		//btnLogin.click();
	
		
}

}
