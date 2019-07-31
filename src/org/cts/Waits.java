package org.cts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("email"));
	
		username.sendKeys("godishala.samatha23@gmail.com");
		//implicit wait
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	WebElement userpass=driver.findElement(By.id("pass"));
	userpass.sendKeys("chinnaraju");
	//explicit wait
	WebDriverWait w=new WebDriverWait(driver,1000);
	WebElement btn=w.until(ExpectedConditions.elementToBeClickable(By.xpath("input[@value='Log-In']")));
	btn.click();
	//fluent wait:
//	Wait w=new fluentWait(driver).
}
}