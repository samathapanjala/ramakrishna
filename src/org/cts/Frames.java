package org.cts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://netbanking.hdfcbank.com/netbanking/");
driver.switchTo().frame("login_page");
WebElement userid=driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
userid.sendKeys("9642752712");
WebElement cont=driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
cont.click();



//to return back frame to window:

driver.switchTo().defaultContent();
	//to get the particular no of frames like frame1,frame2:
List<WebElement>fra=driver.findElements(By.tagName("frameset"));
	
	System.out.println(fra.size());
	driver.switchTo().frame(1);
	
	
	
	}

}
