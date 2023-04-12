package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class TestCaseActiTime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleniumUtility.setUp("chrome", "https://demo.actitime.com");
		//add username
		WebElement username=SeleniumUtility.driver.findElement(By.id("username"));
		username.sendKeys("admin");
		//add password
		WebElement password=SeleniumUtility.driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		//click on loginbutton
		WebElement login=SeleniumUtility.driver.findElement(By.id("loginButton"));
		login.click();
		//click on task
		WebElement CLickOnTask=SeleniumUtility.driver.findElement(By.cssSelector("a[class='content tasks']"));
		CLickOnTask.click();
		
		WebElement CLickOnAddNewButton=SeleniumUtility.driver.findElement(By.cssSelector("div[class='addNewContainer']"));
		CLickOnAddNewButton.click();
		
		WebElement CLickOnNewTask=SeleniumUtility.driver.findElement(By.cssSelector("div[class='item createNewTasks']"));
		CLickOnNewTask.click();
		Thread.sleep(3000);
		SeleniumUtility.driver.findElement(By.xpath("//div[@id='createTasksPopup_content']/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[3]")).click();//dropdown
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.UP));
		
//		WebElement element = driver.findElement(By.xpath("//body"));
//		element.sendKeys(Keys.ESCAPE);
//		//scrolling using page down button
//		for (int i = 0; i < 10; i++) {
//		element.sendKeys(Keys.PAGE_DOWN);
//			Thread.sleep(1500);
		
		SeleniumUtility.driver.findElement(By.cssSelector("tr[class='selectCustomerRow']>td>div>div>div>div>div>div>div")).click();
		Thread.sleep(2000);
		SeleniumUtility.driver.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("Tester Ashu");
		Thread.sleep(2000);
		SeleniumUtility.driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("Health Domain");
		SeleniumUtility.driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder']")).sendKeys("Validate");
		Thread.sleep(3000);
		SeleniumUtility.driver.findElement(By.cssSelector("div[class='components_button withPlusIcon']>div")).click();
		Thread.sleep(3000);
		SeleniumUtility.driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']/td/div")).click();
		Thread.sleep(2000);
		SeleniumUtility.driver.findElement(By.cssSelector("div[class='bulkOperationsPanel']>*:nth-child(6)")).click();
		SeleniumUtility.driver.findElement(By.cssSelector("div[class='dialogWithPointerWrapper deleteDialog']>div>div>div>*:nth-child(6)>div>div")).click();
			}

	}
