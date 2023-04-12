package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public Properties prop;

	public static WebDriver setUp(String browserName, String appUrl) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximize browser window
		driver.manage().window().maximize();
		// Define WebDriverWait
		wait = new WebDriverWait(driver, 20);
		// enter the required URL
		driver.get(appUrl);
		return driver;
	}

	public void typeInput(WebElement element, String input) {
		waitUntilElementIsVisible(element);
		element.clear();
		element.sendKeys(input);
	}

	public void clickOnElement(WebElement element) {
		waitUntilElementClickable(element);
		element.click();
	}

	public void waitUntilTextToBeMatched(By element, String text) {
		wait.until(ExpectedConditions.textToBe(element, text));
	}

	public void waitUntilElementClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitUntilPageTitleMatched(String title) {
		wait.until(ExpectedConditions.titleIs(title));
	}

	public void waitUntilElementIsVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void loadPropertyFile(String filePath) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getDataFromPropertyFile(String key) {
		return prop.getProperty(key);
	}

	public String getValueFromProperyuFile(String key) {
		return prop.getProperty(key);
	}

	public WebDriver getWebDriver() {
		return driver;
	}

	public void performMouseOverOperation(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
    public String getRequiredAttributValue(WebElement element,String attribut) {
    	waitForElementDisplayed(element);
    	//setSleepType(2000);
    	return element.getAttribute(attribut);
    }
    //method to get current page Title
    public String getCurrentTitleOfApplication(String title) {
    	wait.until(ExpectedConditions.titleContains(title));
    	return driver.getTitle();
	}
    //metthod get title of curremnt page
    public String getCurrentTitleOfApplication() {
    	return driver.getTitle();
	}
   //utility to handle html dropdownlist
    protected WebElement getFirstSelectedOptionsFromHtmlDropdownList(WebElement element) {
    	waitForElementDisplayed(element);
    	Select sel=new Select(element);
    	return sel.getFirstSelectedOption();
    }
    //utility to handle multi dropdownlist
    protected  List<WebElement> getFirstSelectedOptionsFromMultiSelectedDropdownList(WebElement element) {
    	waitForElementDisplayed(element);
    	Select sel=new Select(element);
    	return sel.getAllSelectedOptions();
    }
    
	//utility to handle iframe
    protected void SwitchToIframeWithWebElement(WebElement element) {
    	waitForElementDisplayed(element);
    	driver.switchTo().frame(element);
    }
    //utility to handle index
    protected void SwitchToIframeWithIndex(int index) {
    	driver.switchTo().frame(index);
    }
    public void CleanUp() {
    	driver.close();
    }
    //get active element
    public WebElement getActiveElementFromUI(){
    	return driver.switchTo().activeElement();
    
	}

	public static void verifyLinks(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			// Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if (httpURLConnect.getResponseCode() >= 400) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
			}

			// Fetching and Printing the response code obtained
			else {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}
		} catch (Exception e) {
		}
	}
    
    //
	/*
	 * Dropdown InnerText Attribute Value PageTitle PageUrl
	 */

	private void waitForElementDisplayed(WebElement element) {
		// TODO Auto-generated method stub
		
	}
}
