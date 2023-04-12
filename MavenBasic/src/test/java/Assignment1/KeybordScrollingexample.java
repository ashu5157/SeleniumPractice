package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class KeybordScrollingexample {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=SeleniumUtility.setUp("chrome", "https://www.flipkart.com/");
			// using Escape of keyboard to avoid login popup
			WebElement element = driver.findElement(By.xpath("//body"));
			element.sendKeys(Keys.ESCAPE);
			//scrolling using page down button
			for (int i = 0; i < 10; i++) {
			element.sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(1500);
			}
		
//			Thread.sleep(1500);
//			//Scrolling - directly goto bottom of the page
//			element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
//			Thread.sleep(1500);
//			//Scrolling- directly goto Top of the page
//			element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		}

	
	}


