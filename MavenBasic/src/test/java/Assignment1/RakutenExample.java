package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class RakutenExample {

	public static void main(String[] args) {
		SeleniumUtility.setUp("Chrome", "https://www.rakuten.com");
		SeleniumUtility.driver.findElement(By.cssSelector("p[class='css-1rydq7m']")).click();
		// click on username-select iframepath
		WebElement framee = SeleniumUtility.driver.findElement(By.xpath("//iframe[@id='auth-microsite-iframe']"));
		framee.click();
		// frame index
		SeleniumUtility.driver.switchTo().frame(5);
		// email id path
		WebElement emailid = SeleniumUtility.driver.findElement(By.cssSelector("div[role='group']>div>input"));
		emailid.sendKeys("abc@gmail.com");
		// insert password
		WebElement pass = SeleniumUtility.driver.findElement(By.cssSelector("input[type='password']"));
		pass.sendKeys("abcd1234");
		pass.sendKeys(Keys.ENTER);
		// erroermsg validation
		WebElement erroermsg = SeleniumUtility.driver.findElement(By.cssSelector("div[role='alert']"));
		Point error = erroermsg.getLocation();
		int error_Y_cord = error.getY();
		
		Point emaillocation = emailid.getLocation();
		int email_y_cord = emaillocation.getY();
		System.out.println("erroer y_cordnation postion : " + error);
		System.out.println("email y cordination postion :" + emaillocation);
		// validation of error msg-compair
		System.out.println("is erroer msg display above email feild : " + (error_Y_cord < email_y_cord));

		// validation of error msg color
		String errormsg_color = erroermsg.getCssValue("color");
		System.out.println("error color msg in rgb :" + errormsg_color);
		// validation of error msg bagrownd color
		String err_backgroundcol = erroermsg.getCssValue("background");
		System.out.println("error msg background color in rgb: " + err_backgroundcol);

	}

}
