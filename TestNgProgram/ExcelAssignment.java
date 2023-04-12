package TestNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class ExcelAssignment extends SeleniumUtility {
	String AppURL;
	String UserName;
	String Password;
	String ExpectedTitle;
	@Test(enabled=false)
	public void Viger1() {
		
		AppURL = ExcelUtility.getCellValue(
				".\\src\\test\\resources\\testData\\AppTest.xlsx",
				"TC", 1, 0);
		UserName=ExcelUtility.getCellValue(
				".\\src\\test\\resources\\testData\\AppTest.xlsx",
				"TC", 1, 1);
		Password=ExcelUtility.getCellValue(
				".\\src\\test\\resources\\testData\\AppTest.xlsx",
				"TC", 1, 2);
		ExpectedTitle=ExcelUtility.getCellValue(
				".\\src\\test\\resources\\testData\\AppTest.xlsx",
				"TC", 1, 3);
		WebDriver driver = setUp("chrome", AppURL);
			driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 4,
				getCurrentTitleOfApplication());

		if (getCurrentTitleOfApplication().equals(ExpectedTitle)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 5, "PASS");

		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 5, "FAIL");
		}
		//Assert.assertEquals(getCurrentTitleOfApplication(), "Dashboard");

	}
	@Test(enabled=false)
	public void Viger2() {
		
		AppURL = ExcelUtility.getCellValue(
				".\\src\\test\\resources\\testData\\AppTest.xlsx",
				"TC", 2, 0);
		UserName=ExcelUtility.getCellValue(
				".\\src\\test\\resources\\testData\\AppTest.xlsx",
				"TC", 2, 1);
		Password=ExcelUtility.getCellValue(
				".\\src\\test\\resources\\testData\\AppTest.xlsx",
				"TC", 2, 3);
		ExpectedTitle=ExcelUtility.getCellValue(
				".\\src\\test\\resources\\testData\\AppTest.xlsx",
				"TC", 2, 3);
		WebDriver driver=setUp("chrome", AppURL);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 2, 4,getCurrentTitleOfApplication());
		if(getCurrentTitleOfApplication().equals(ExpectedTitle)) {
			ExcelUtility.updateExcelContent(".src\\test\\resources\\testData\\AppTest.xlsx", "TC", 2, 5, "PASS");
			
		}else{
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx","TC", 2, 5, "FAIL");
		}
			
		}
		@Test(enabled=false)
		public void Acttime1() {
			AppURL=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 0);
			UserName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 1);
			Password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 2);
			ExpectedTitle=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 3);
			WebDriver driver=setUp("chrome", AppURL);
			driver.findElement(By.id("username")).sendKeys(UserName);
			driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys(Password);
			driver.findElement(By.id("loginButton")).click();
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 4, getCurrentTitleOfApplication());
			if(getCurrentTitleOfApplication().equals(ExpectedTitle)) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx","TC", 3, 5,"PASS");
			}
			else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 5,"FAIL");
			}
		}
		@Test(priority=2)
		public void Actime2() {
			AppURL=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 0);
			UserName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx","TC", 4, 1);
			Password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 2);
			ExpectedTitle=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 3);
			WebDriver driver=setUp("chrome", AppURL);
			driver.findElement(By.id("username")).sendKeys(UserName);
			driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys(Password);
			driver.findElement(By.id("loginButton")).click();
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 4, getCurrentTitleOfApplication());
			if(getCurrentTitleOfApplication().equals(ExpectedTitle)) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx","TC", 4, 5,"PASS");
			}
			else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 5,"FAIL");
			}
		}
		@Test (priority=2)
		public void orangeHrm1() {
			AppURL=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 0);
			UserName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx","TC", 5, 1);
			Password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 2);
			ExpectedTitle=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 3);
			WebDriver driver=setUp("chrome", AppURL);
			driver.findElement(By.cssSelector("input[name='username']")).clear();
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys(UserName);
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys(Password);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 4, getCurrentTitleOfApplication());
			if(getCurrentTitleOfApplication().equals(ExpectedTitle)) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx","TC", 5, 5,"PASS");
			}
			else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 5,"FAIL");
}
		}
		@Test (priority=1)
		public void orangeHrm2() {
			AppURL=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 0);
			UserName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx","TC", 6, 1);
			Password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 2);
			ExpectedTitle=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 3);
			WebDriver driver=setUp("chrome", AppURL);
			driver.findElement(By.cssSelector("input[name='username']")).clear();
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys(UserName);
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys(Password);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 4, getCurrentTitleOfApplication());
			if(getCurrentTitleOfApplication().equals(ExpectedTitle)) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx","TC", 6, 5,"PASS");
			}
			else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 5,"FAIL");
		
}
		}
}
	
