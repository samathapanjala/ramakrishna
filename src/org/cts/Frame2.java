package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
	WebElement chek1=	driver.findElement(By.id("vfb-6-0"));
	chek1.click();
	
		WebElement chek2=driver.findElement(By.id("vfb-6-1"));
		chek2.click();

	WebElement chek3=driver.findElement(By.id("vfb-6-2"));

	chek3.click();

	}


}