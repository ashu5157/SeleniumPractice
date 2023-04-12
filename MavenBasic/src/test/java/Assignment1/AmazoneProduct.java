package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilities.SeleniumUtility;

public class AmazoneProduct {

	public static void main(String[] args) {
		SeleniumUtility.setUp("Chrome", "https://www.amazon.in");
		SeleniumUtility.driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("watches for women");
		SeleniumUtility.driver.findElement(By.cssSelector("")).click();

	}

}
//