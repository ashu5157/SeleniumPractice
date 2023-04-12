package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class FlipkartAssignmnet {

	public static void main(String[] args) {
		SeleniumUtility.setUp("Chrome", "https://www.flipkart.com\r\n");
		SeleniumUtility.driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);// handling poppop
		SeleniumUtility.driver.findElement(By.cssSelector("div[class='InyRMC _3Il5oO']>div>*:nth-child(2)>a")).click();

		SeleniumUtility.driver.findElement(By.cssSelector("div[class='InyRMC _3Il5oO']>div>*:nth-child(2)>a")).click();// click
		SeleniumUtility.driver.findElement(By.cssSelector("div[class='_3Il5oO dwRsDN']>div>span")).click();
		WebElement search = SeleniumUtility.driver.findElement(By.cssSelector("._3704LK"));
		search.sendKeys("samsung mobile");
		search.sendKeys(Keys.ENTER);
		WebElement mobilelist = SeleniumUtility.driver.findElement(By.xpath("//div[div[div[@class='_4rR01T']]]//div[@class='_30jeq3 _1_WHN1']"));	
		System.out.println("list  :" + mobilelist.getText());

	}

}
