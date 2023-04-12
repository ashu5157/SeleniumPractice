package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=SeleniumUtility.setUp("chrome", "https://demo.actitime.com");
		WebElement username=SeleniumUtility.driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password=SeleniumUtility.driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		WebElement login=SeleniumUtility.driver.findElement(By.id("loginButton"));
		login.click();
		WebElement CLickOnTask=SeleniumUtility.driver.findElement(By.cssSelector("a[class='content tasks']"));
		CLickOnTask.click();
		WebElement CLickOnAddNewButton=SeleniumUtility.driver.findElement(By.cssSelector("div[class='addNewContainer']"));
		CLickOnAddNewButton.click();
		WebElement CLickOnNewTask=SeleniumUtility.driver.findElement(By.cssSelector("div[class='item createNewTasks']"));
		CLickOnNewTask.click();
		Thread.sleep(3000);
		SeleniumUtility.driver.findElement(By.xpath("//div[@id='createTasksPopup_content']/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[3]")).click();//dropdown
		Thread.sleep(3000);

	}


}
