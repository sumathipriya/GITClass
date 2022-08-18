package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String args[])
	{
		//step 1 BROWSER CONFIGURATION

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//STEP 2 BROWSER LAUNCH----->up casting
		WebDriver driver=new ChromeDriver();
		//url launching
		driver.get("https://www.zappos.com/");
		String currentPageTitle=driver.getTitle();
		System.out.println(currentPageTitle);
		//current page url
				String url=driver.getCurrentUrl();
				System.out.println(url);
				WebElement username2=driver.findElement(By.xpath("//a[@class='fa-z ia-z']"));
				username2.click();
				
				
				
				
				
				
				
				
				//WebElement emailTxt=driver.findElement(By.name("email"));
				//emailTxt.sendKeys("Greens");
				//WebElement confirmTxt=driver.findElement(By.name("emailConfirm"));
				//confirmTxt.sendKeys("Greens");
				//WebElement password=driver.findElement(By.name("password"));
				//password.sendKeys("12345");
				//WebElement confirmPass=driver.findElement(By.name("passwordConfirm"));
				//confirmPass.sendKeys("passwordConfirm");
			//	driver.findElement(By.xpath("//p[text()='sign in']"));
				//driver.close();
			//	WebElement search=driver.findElement(By.id("searchlabel"))	;
				//search.sendKeys("kids");
}
}