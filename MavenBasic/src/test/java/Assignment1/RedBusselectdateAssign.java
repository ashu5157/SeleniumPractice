package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class RedBusselectdateAssign {

	public static void main(String[] args) {
		SeleniumUtility.setUp("Chrome", "https://www.redbus.in/");
		SeleniumUtility.driver
				.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		SeleniumUtility.driver
				.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[7]//td[text()='31']"))
				.click();
		SeleniumUtility.driver
				.findElement(By.xpath("//div[@class='fl search-box clearfix']/div//input[@type='text' and@id='src']"))
				.sendKeys("Pune");
		WebElement allsuggestion = SeleniumUtility.driver
				.findElement(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li[2]"));
		allsuggestion.click();

		SeleniumUtility.driver.findElement(By.xpath("//div[@class='fl search-box']/div//input[@type='text']"))
				.sendKeys("Nagpur");
		// click on calender arrow
		WebElement all = SeleniumUtility.driver.findElement(By.xpath(
				"//ul[@class='autoFill homeSearch']//li[@data-id='624']//i[@class='icon solr-icon icon-ic-city']"));
		all.click();
		// click on Search button
		SeleniumUtility.driver.findElement(By.xpath("//button[@id='search_btn']")).click();

		// Select bus time
		SeleniumUtility.driver
				.findElement(By.xpath("//ul[@class='dept-time dt-time-filter']//li[3]/label[@class='custom-checkbox']"))
				.click();
		// type of bus-AC
		SeleniumUtility.driver.findElement(By.xpath("//ul[@class='list-chkbox']//li[3]//label[@for='bt_AC']")).click();
		// remove pop
		SeleniumUtility.driver.findElement(By.xpath("//div[@class='fr']//i[@class='icon-close coach-close']")).click();
		// select allbus name
		List<WebElement> buslist = SeleniumUtility.driver
				.findElements(By.xpath("//ul[@class='bus-items']/div//div[contains(@class,'travels')]"));
		System.out.println(buslist.size());
		// select buses price
		List<WebElement> busPrice = SeleniumUtility.driver
				.findElements(By.xpath("//ul[@class='bus-items']//div[@class='seat-fare ']//span[@class!='strike']"));
		System.out.println(busPrice.size());
		for (int i = 0; i < buslist.size(); i++) {
			WebElement allbuses = buslist.get(i);
			WebElement price = busPrice.get(i);
			System.out.println("travels name and price :" + i + " :" + allbuses.getText() + " :" + price.getText());
		}

	}

}

//.bus-items>div .travels

//ul[@class='bus-items']/div//div[contains(@class,'travels')]
//.bus-items>div .seat-fare>div span:not([class='strike'])

//ul[@class='bus-items']//div[@class='seat-fare ']//span[@class!='strike']