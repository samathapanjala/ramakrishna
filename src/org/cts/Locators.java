package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");		
		
	WebElement c=	driver.findElement(By.xpath("//span[text()='Create an account']"));
String text1=c.getText();
		
  System.out.println(text1);
  WebElement d=driver.findElement(By.xpath("//div[contains(text(),'helps')]"));
String text2=d.getText();
  System.out.println(text2);
  WebElement user=driver.findElement(By.id("email"));
        user.sendKeys("godishala.samatha23@gmail.com");
   String attribute1=user.getAttribute("value");
      System.out.println(attribute1);
String attribute2=user.getAttribute("type");
System.out.println(attribute2);


}
	
	


	}


