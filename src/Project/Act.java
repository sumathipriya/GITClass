package Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act {
	public static void main(String args[]) throws IOException, AWTException
	{
		//step 1 BROWSER CONFIGURATION

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//STEP 2 BROWSER LAUNCH----->up casting
		WebDriver driver=new ChromeDriver();
		//url launching
		driver.get("https://www.zappos.com/");
		//passing values
		//WebElement search=driver.findElement(By.id("searchAll"));
		//search.sendKeys("Denim");
		//click some link using Action
		WebElement dep=driver.findElement(By.xpath("(//a[@class='J-z'])[5]"));
	Actions a=new Actions(driver);
		a.click(dep).perform();
		WebElement den=driver.findElement(By.xpath("(//a[text()='The Denim Shop'])[1]"));
		a.contextClick(den).perform();
		Robot r =new Robot();
		for(int i=0;i<5;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//a.click(den).perform();
		

}
}