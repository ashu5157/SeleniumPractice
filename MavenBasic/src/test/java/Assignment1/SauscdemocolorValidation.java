package Assignment1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class SauscdemocolorValidation {

	public static void main(String[] args) {
		SeleniumUtility.setUp("chrome", "https://www.saucedemo.com/");
		WebElement userN = SeleniumUtility.driver
				.findElement(By.cssSelector("#root>div>*:last-child>*:last-child>div>div"));
		String u1 = userN.getText();
		System.out.println(u1);
		// System.out.println("**************************************************************************");
		String replaceuser = u1.replace("Accepted usernames are:", "");
		String u2 = replaceuser.substring(0, 14);
		// String usersplit = u1.substring(23, 38);
		// System.out.println(u2);
		SeleniumUtility.driver.findElement(By.id("user-name")).sendKeys(u2);
		WebElement password = SeleniumUtility.driver
				.findElement(By.cssSelector("#root>div>*:last-child>*:last-child>div>*:last-child"));
		String p1 = password.getText();
		String passw = p1.replace("Password for all users:", "");
		// System.out.println(p1);
		// String pass = p1.substring(23, 36);
		// System.out.println(pass);
		SeleniumUtility.driver.findElement(By.id("password")).sendKeys(passw);
		// SeleniumUtility.driver.findElement(By.id("login-button")).click();
		WebElement color = SeleniumUtility.driver.findElement(By.cssSelector("#login-button"));
		String Logincolor = color.getCssValue("background-color");
		System.out.println("print login bagrownd color in rgb :" + Logincolor);
		String Lognintexcolor=color.getCssValue("color");
		System.out.println("Login text color is :"+Lognintexcolor);
		WebElement erroermsg=SeleniumUtility.driver.findElement(By.cssSelector(".error-message-container.error"));
		String errortapcol=erroermsg.getCssValue("background-color");
		System.out.println("error masg tap color :"+errortapcol);
		

	}

}
