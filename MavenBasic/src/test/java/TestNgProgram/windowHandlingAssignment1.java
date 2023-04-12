package TestNgProgram;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class windowHandlingAssignment1 extends SeleniumUtility {
	@Test
	public void ParentWindow() {
		WebDriver driver = setUp("chrome", "https://erail.in/");
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//a[@href='https://www.ecatering.irctc.co.in/']")).click();
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		allwindow.remove(parentwindow);
		Iterator<String> itr = allwindow.iterator();
		String childwindow = itr.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//input[@class='form-input pl-12  h-16 pl-12 pr-4 text-lg shadow-6dp']")).click();
		driver.findElement(By.xpath("//input[@class='form-input pl-12  text-sm']")).sendKeys("12627");
		driver.findElement(By.cssSelector("div[class='top-109px absolute h-full overflow-y-auto']>div>button")).click();
		// select bording date
		WebElement calender = SeleniumUtility.driver.findElement(
				By.cssSelector("div[class='top-109px absolute h-full overflow-y-auto']>div>*:nth-child(2)>input"));
		calender.click();
		calender.sendKeys(Keys.ARROW_DOWN);
		calender.sendKeys(Keys.ARROW_DOWN);
		calender.sendKeys(Keys.ARROW_DOWN);
		calender.sendKeys(Keys.ARROW_DOWN);
		calender.sendKeys(Keys.ARROW_RIGHT);
		calender.sendKeys(Keys.ARROW_RIGHT);
		calender.sendKeys(Keys.ARROW_RIGHT);
		calender.sendKeys(Keys.ENTER);
		// bording station
		driver.findElement(By.xpath("//select[@placeholder='Boarding Station']//option[28]")).click();
		// find food
		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
		// select find food name list
		List<WebElement> foodlist = driver.findElements(
				By.xpath("//div[@class='w-2/3 pl-6 flex flex-col gap-4 pt-10 pb-24']/div/div/div/div/div/h5"));
		System.out.println("count of food list :" + foodlist.size());
		for (int i = 0; i < foodlist.size(); i++) {
			WebElement food_name = foodlist.get(i);
			System.out.println("print name of foodlist :" + i + " " + food_name.getText());
		}
		// switch -back home page
		driver.switchTo().window(parentwindow);
		// select home page train from
		WebElement from = driver
				.findElement(By.cssSelector("tbody>tr>td[style='padding-left: 3px; text-align: right']>input"));
		from.clear();
		from.sendKeys("Pune");
		from.sendKeys(Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("Bangalore");
		to.sendKeys(Keys.ENTER);

		// click on month date
		driver.findElement(By.cssSelector("input[title='Select Departure date for availability']")).click();
		// select month and date
		driver.findElement(By.xpath("//table[@style='width:auto']/tbody/tr/td[2]/table/tbody/tr[4]/td[5]")).click();
		// click on get train
		driver.findElement(By.cssSelector("input[title='Trains between Pune Jn and Bangalore Cant']")).click();
		// name list of train
		List<WebElement> train_name = driver.findElements(
				By.xpath("//tr[@onmouseout=\"HideCalendar()\"]/td[2]/a[@href='/11013-PUNE-BNC-COIMBTORE - EXP']"));
		System.out.println("train count :" + train_name.size());

	}
}
