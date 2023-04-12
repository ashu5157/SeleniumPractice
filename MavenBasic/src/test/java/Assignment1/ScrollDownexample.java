package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class ScrollDownexample {
	static WebElement element ;
	public static void main(String[] args) {
		WebDriver driver=SeleniumUtility.setUp("chrome", "https://www.amazon.in");
		//Actions act=new Actions(driver);
	//act.sendKeys(Keys.PAGE_DOWN).build().perform();
		WebElement element = driver.findElement(By.xpath("//body"));
	element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
	
	}
	
	
}
