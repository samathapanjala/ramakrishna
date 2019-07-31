package org.cts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("  https://www.snapdeal.com/");
	driver.manage().window().maximize();
WebElement search=driver.findElement(By.name("keyword"));
	search.sendKeys("iphone");
	Thread.sleep(3000);
WebElement clk=	driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
	clk.click();
	Thread.sleep(3000);
WebElement iphone1=driver.findElement(By.xpath("//p[@title='Apple iphone 6s plus ( 16GB , 2 GB ) Gold'] "));
iphone1.click();
String parent=driver.getWindowHandle();
Set<String> all=driver.getWindowHandles();
for(String x:all) {
	driver.switchTo().window(x);
	
}
 WebElement add=driver.findElement(By.xpath(("(//span[@class='intialtext'])[2])")));

add.click();

}
}



	
	
	

