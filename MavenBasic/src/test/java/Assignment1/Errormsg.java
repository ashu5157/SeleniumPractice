package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Errormsg {

	public static void main(String[] args) {
		SeleniumUtility.setUp("chrome", "https://www.saucedemo.com/");
		SeleniumUtility.driver.findElement(By.id("login-button")).click();
		WebElement errormsg = SeleniumUtility.driver.findElement(By.cssSelector("h3[data-test='error']"));
		Point errorlocation = errormsg.getLocation();
		int y_Errcordinate = errorlocation.getY();
		System.out.println("Error msg y cordinate :" +y_Errcordinate);
		WebElement password = SeleniumUtility.driver
				.findElement(By.cssSelector("#root>div>*:last-child>*:last-child>div>*:last-child"));
		Point passlocation = password.getLocation();
		int y_cordpassword = passlocation.getY();
		System.out.println("pass msg location :" + y_cordpassword);
		System.out.println(y_Errcordinate<y_cordpassword);
		

	}

}
