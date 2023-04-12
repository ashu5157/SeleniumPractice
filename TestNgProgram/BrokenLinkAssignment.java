package TestNgProgram;

import org.testng.annotations.Test;

import utilities.SeleniumUtility;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class BrokenLinkAssignment extends SeleniumUtility {

	
	@Test
	public void testLinks() {
		setUp("chrome", "https://demoqa.com/broken");
		
		// Storing the links in a list and traversing through the links
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("count of links: "+Links.size());
		for(int i=0;i<Links.size();i++) {
			WebElement e1=Links.get(i);
			String url=e1.getAttribute("href");
			verifyLinks(url);
		}
	}
}
  