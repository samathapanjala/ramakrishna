package org.cts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhask\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("  http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
	WebElement conti=driver.findElement(By.id("continents"));	
		Select sel=new Select(conti);
		List<WebElement>web=sel.getAllSelectedOptions();
		for(WebElement x:web) {
		System.out.println(x.getText());
	}
		
		
	//	boolean b=sel.isMultiple();
	//	System.out.println(b);

}
}