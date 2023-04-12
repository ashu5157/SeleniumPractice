package Assignment1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtility;

public class Example1 {

	public static void main(String[] args) {
		SeleniumUtility.setUp("chrome", "https://demo.actitime.com");
		WebElement username = SeleniumUtility.driver
				.findElement(By.cssSelector("#demoCredentials>tbody>*:first-child>*:last-child"));
		String usernameprint = username.getText();
		// System.out.println(usernameprint);
		String replace = usernameprint.replace("Username:", "");
		// System.out.println(replace);
		SeleniumUtility.driver.findElement(By.id("username")).sendKeys(replace);

		WebElement password = SeleniumUtility.driver
				.findElement(By.cssSelector("#demoCredentials>tbody>*:nth-child(2)>td"));
		String passwordprint = password.getText();
		 System.out.println(passwordprint);
		//String replacepass=passwordprint.replace("Password:", "");
		// System.out.println(replacepass);
		String pass[] = passwordprint.split(" ");
		 System.out.println(pass[1]);
		SeleniumUtility.driver.findElement(By.name("pwd")).sendKeys(pass[1]);
		SeleniumUtility.driver.findElement(By.linkText("Login")).click();

	}
}