package TestNgProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class OrangeHrmTestCase extends SeleniumUtility {
	@Test
	public void Create() throws InterruptedException {

		SeleniumUtility.setUp("chrome", "https://opensource-demo.orangehrmlive.com\r\n");
		SeleniumUtility.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SeleniumUtility.driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		SeleniumUtility.driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		SeleniumUtility.driver.findElement(By.cssSelector("button[type='submit']")).click();
		SeleniumUtility.driver.findElement(By.cssSelector("ul[class='oxd-main-menu']>*:nth-child(2)")).click();
		// add on create
		SeleniumUtility.driver
				.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']"))
				.click();
		// entre name
		SeleniumUtility.driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Ashwini");
		Thread.sleep(2000);

		SeleniumUtility.driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Ghule");
		Thread.sleep(2000);
//	//entre on save btn
		SeleniumUtility.driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Test(dependsOnMethods = { "Create" })
	public void update() throws InterruptedException {
		// click on PIM
		SeleniumUtility.driver.findElement(By.cssSelector("ul[class='oxd-main-menu']>*:nth-child(2)")).click();
		Thread.sleep(2000);
		// search on id
		SeleniumUtility.driver.findElement(By.cssSelector(".oxd-form-row>div>*:nth-child(2)>div>*:last-child>input"))
				.sendKeys("0250");
		Thread.sleep(2000);
		// click on search button
		SeleniumUtility.driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[2]")).click();
		Thread.sleep(2000);
		// Click on edit
		SeleniumUtility.driver.findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']")).click();
		// edit-entre middle name
		SeleniumUtility.driver.findElement(By.cssSelector("input[placeholder='Middle Name']")).sendKeys("Ravindra");
		Thread.sleep(2000);
		// click on save btn
		SeleniumUtility.driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods = { "update" })
	public void Delete() throws InterruptedException {
		// click on PIM;
		SeleniumUtility.driver.findElement(By.cssSelector("ul[class='oxd-main-menu']>*:nth-child(2)")).click();
		Thread.sleep(2000);
		SeleniumUtility.driver.findElement(By.cssSelector(".oxd-form-row>div>*:nth-child(2)>div>*:last-child>input"))
				.sendKeys("0250");
		Thread.sleep(2000);
		// click on search button
		SeleniumUtility.driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[2]")).click();
		Thread.sleep(2000);
		//
		SeleniumUtility.driver
				.findElement(By.cssSelector("button[class='oxd-icon-button oxd-table-cell-action-space']>i")).click();
		Thread.sleep(2000);
		// confrim on yes delete btn
		SeleniumUtility.driver.findElement(By.cssSelector(
				"button[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']"))
				.click();
	}
}
