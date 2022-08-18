package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		userName.sendKeys("sumathi");
		WebElement lastName=driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']"));
		lastName.sendKeys("pandian");
		WebElement address = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
		address.sendKeys("15 Anna nagar");
		WebElement email=driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched']"));
		email.sendKeys("sumathi@gmail.com");
		

}
}

