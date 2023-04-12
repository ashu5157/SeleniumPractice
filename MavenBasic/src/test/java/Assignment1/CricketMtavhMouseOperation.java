package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class CricketMtavhMouseOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.espncricinfo.com/");
		List<WebElement> mainubar = SeleniumUtility.driver
				.findElements(By.cssSelector("div[class='ds-flex ds-flex-row']>div>a"));
		System.out.println("cricket match mainubar count :" + mainubar.size());
		Actions act = new Actions(driver);
		for (int i = 0; i < mainubar.size(); i++) {
			String mainulist = mainubar.get(i).getText();
			WebElement options = mainubar.get(i);
			act.moveToElement(options).perform();
			Thread.sleep(500);
			System.out.println(mainulist);

		}

	}
}
//div[class='ds-flex ds-flex-row']>div>a