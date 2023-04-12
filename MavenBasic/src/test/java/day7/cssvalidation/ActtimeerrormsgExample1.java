package day7.cssvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActtimeerrormsgExample1 {

	public static void main(String[] args) {
		

		WebDriver driver=SeleniumUtility.setUp("chrome", "https://demo.actitime.com/login.do");
		SeleniumUtility.clickOnElement(driver.findElement(By.id("loginButton")));
	}

}