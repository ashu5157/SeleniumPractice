package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ErroerSaucedemoExa {

	public static void main(String[] args) {

		SeleniumUtility.setUp("chrome", "https://www.saucedemo.com/");
		WebElement userN = SeleniumUtility.driver
				.findElement(By.cssSelector("#root>div>*:last-child>*:last-child>div>div"));
		String u1 = userN.getText();
		 System.out.println(u1);
		String[] user1 = u1.split("\n");
		SeleniumUtility.driver.findElement(By.id("user-name")).sendKeys(user1[1]);
		
		WebElement password = SeleniumUtility.driver.findElement(By.cssSelector("#root>div>*:last-child>*:last-child>div>*:last-child"));		
		String p1 = password.getText();
		String passw[] =p1.split("\n");
		SeleniumUtility.driver.findElement(By.id("password")).sendKeys(passw[1]);
		SeleniumUtility.driver.findElement(By.id("login-button")).click();
		
		WebElement color = SeleniumUtility.driver.findElement(By.cssSelector("#login-button"));
		
		String Logincolor = color.getCssValue("background-color");
		System.out.println("print login bagrownd color in rgb :" + Logincolor);
		String Lognintexcolor = color.getCssValue("color");
		System.out.println("Login text color is :" + Lognintexcolor);
		WebElement erroermsg = SeleniumUtility.driver.findElement(By.cssSelector(".error-message-container.error"));
		String errortapcol = erroermsg.getCssValue("background-color");
		System.out.println("error masg tap color :" + errortapcol);

	}

}