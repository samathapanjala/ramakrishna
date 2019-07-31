package org.cts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbank.com/Home.aspx");
		driver.manage().window().maximize();
		
		WebElement btn=driver.findElement(By.xpath("(//span[text()='Login'])[1]"));
		btn.click();;
		
		Alert al=driver.switchTo().alert();
		
		al.accept();
		
		
}
}