package Project;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Wind {
	public static void main(String args[]) throws IOException, AWTException
	{
		//step 1 BROWSER CONFIGURATION

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//STEP 2 BROWSER LAUNCH----->up casting
		WebDriver driver=new ChromeDriver();
		//url launching
		driver.get("https://www.zappos.com/");
		
		//get the parent window id
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		//get all windows is
		Set<String> allWindowsId=driver.getWindowHandles();
		for(String each:allWindowsId) {
			if(!parentId.equals(each)) {
				driver.switchTo().window(each);
			}
			}
		WebElement shop=driver.findElement(By.xpath("(//a[@class='bc-z'])[1]"));
		shop.click();

}
}