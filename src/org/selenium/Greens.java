package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement prime=driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
		prime.sendKeys("Hp Laptop");
	
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);//temp
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Images\\flip.png");
		FileUtils.copyFile(src, dest);
		
	}
}
		
		
	//driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[6]")).click();
	//WebElement s=driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));

	
	//Actions a=new Actions(driver);
	
	//a.contextClick(s).perform();
	
	
	
	
	//Robot r=new Robot();
	//for(int i=0;i<5;i++) {
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
	//}
	//r.keyPress(KeyEvent.VK_ENTER);
	//r.keyRelease(KeyEvent.VK_ENTER);
	
	
	//}
	//}
//}

	//WebElement cts=	driver.findElement(By.xpath("//a[text()='CTS Interview Question ']	"));
//a.click(cts).perform();
	
	//String text=grTxt.getText();
	//System.out.println(text);
		
	
	//div[@id='heading20']
	//h2[@class='title mb-0 center']
	
	//WebElement fbTxt=driver.findElement(By.xpath("//h2[@class='_8eso']"));
		//String text=fbTxt.getText();
		//System.out.println(text);
		
		
		
		//WebElement btnLogin = driver.findElement(By.xpath("//div[@id='heading20']"));
		//btnLogin.click();
		//WebElement btnLogin1 = driver.findElement(By.xpath("//div[@id='heading201']"));
		//btnLogin1.click();


//h2[text()='Greens Technologys In']
//div[text()='address-block address-border']