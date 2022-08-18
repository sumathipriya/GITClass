package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jript {
	public static void main(String args[]) 
	{
		//step 1 BROWSER CONFIGURATION

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//STEP 2 BROWSER LAUNCH----->up casting
		WebDriver driver=new ChromeDriver();
		//url launching
		driver.get("https://www.zappos.com/");
		WebElement scroll=driver.findElement(By.xpath("(//a[text()='Shop All New Balance'])[2]"));
		//Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scroll);

}
}