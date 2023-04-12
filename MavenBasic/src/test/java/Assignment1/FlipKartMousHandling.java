package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class FlipKartMousHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.flipkart.com/");
		SeleniumUtility.driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		Actions act = new Actions(driver);
		List<WebElement> mainmenu = driver.findElements(By.cssSelector("div[class='_331-kn _2tvxW']>div>div>div"));
		System.out.println("fplipkart menu bar count : " + mainmenu.size());
		for (int i = 0; i < mainmenu.size(); i++) {
			String menulist = mainmenu.get(i).getText();
			 System.out.println("list of menu :"+i+" "+menulist);
			WebElement options = mainmenu.get(i);
			act.moveToElement(options).perform();
			System.out.println(menulist);
			Thread.sleep(500);

		}

	}

}
