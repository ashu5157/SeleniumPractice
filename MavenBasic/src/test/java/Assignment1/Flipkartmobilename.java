package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Flipkartmobilename {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.flipkart.com/");
		SeleniumUtility.driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		SeleniumUtility.driver.findElement(By.cssSelector("._37M3Pb>*:nth-child(2)")).click();
		WebElement Electronics=SeleniumUtility.driver.findElement(By.xpath("//span[@class='_2I9KP_']"));
		Actions act = new Actions(driver);
		act.moveToElement(Electronics).perform();
		driver.findElement(By.linkText("Mi")).click();
		
	}
}