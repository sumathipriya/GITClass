package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Facebook {
	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTxt=driver.findElement(By.id("email"));
		emailTxt.sendKeys("selenium");
		Actions a=new Actions(driver);
		a.doubleClick(emailTxt).perform();
		
		a.contextClick(emailTxt).perform();
		Robot r=new Robot();
		for(int i=0;i<3;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		}
	
		//WebElement userName = driver.findElement(By.id("email"));
		//userName.sendKeys("Sumathi@123");
		//WebElement passWord = driver.findElement(By.id("pass"));
		//passWord.sendKeys("123456789");
		//WebElement btnLogin = driver.findElement(By.name("login"));
		//btnLogin.click();
	

		
		//WebElement emailTxt = driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
		//emailTxt.sendKeys("sumathi");
		//WebElement passTxt = driver.findElement(By.xpath("//div[@class=\"_6luy _55r1 _1kbt\"]"));
		//passTxt.sendKeys("123456789");
		
		//WebElement emailTxt=driver.findElement(By.id("email"));
		//emailTxt.sendKeys("selenium@123");
		
		//WebElement passTxt=driver.findElement(By.name("pass"));
		//passTxt.sendKeys("175236");
		
		//WebElement acctBtn=driver.findElement(By.xpath("//a[contains(text(),'New')]"));
		//acctBtn.click();
		//Thread.sleep(20000);
		

		//WebElement maletBtn=driver.findElement(By.xpath("//input[@type='radio'])[2]"));
		//maletBtn.click();
		
		
		//String enterTxt=emailTxt.getAttribute("value");
		//System.out.println(enterTxt);
		
		//String attrVal=emailTxt.getAttribute("data-testid");
		//System.out.println(attrVal);
		
		//WebElement fbTxt=driver.findElement(By.xpath("//h2[@class='_8eso']"));
		//String text=fbTxt.getText();
		//System.out.println(text);
	//	String subWord=text.substring(0,8);
		//System.out.println(subWord);
		//driver.findElement(By.xpath("//a[contains(text(),'w A')]")).click();
		//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		
		

}