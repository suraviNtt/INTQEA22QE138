package project_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import project_name.utilities.Commons;

public class GoogleSearchPageTest {
	
	WebDriver driver;
	Commons commons;

	final private static String url = "https://www.google.com";
	ExtentReports reports ;
	ExtentTest test;
	ExtentSparkReporter spark;
	
	@BeforeTest
	public void beforTest() {
		reports = new ExtentReports();
		String classname = this.getClass().getSimpleName() + "Report";
		spark = new ExtentSparkReporter("target/"+classname+".html");
		test = reports.createTest(classname);
		
	}
	
	@BeforeMethod
	public void openApplication() {
		// intializations
				commons = new Commons();
				// Driver Setup
				driver = commons.setUpDriver();
				// open the application
				commons.launchApplication(driver);
	}

	@Test
	public void googleSearchSelenium() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ExtentTest node = test.createNode(name);
		commons = new Commons();
		// fetch search bar location
		WebElement searchBar = driver.findElement(By.name("q"));
		// send srach text
		searchBar.sendKeys("Selenium");
		WebElement autoSearchResults = driver.findElement(By.xpath("(//ul[@class='G43f7e']//li[@class='sbct'])[1]"));
		commons.checkElementsVisibility(driver, autoSearchResults);
		// clicking on element
		autoSearchResults.click();
		commons.getHardwait();
		if(10>5) {
			node.pass("Pass");
		}else {
			node.fail("Fail");
			}

	}
	
	
	@Test
	public void googleSearchSeleniumBook() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ExtentTest node = test.createNode(name);
		commons = new Commons();
		// fetch search bar location
		WebElement searchBar = driver.findElement(By.name("q"));
		// send srach text
		searchBar.sendKeys("Selenium Book");
		WebElement autoSearchResults = driver.findElement(By.xpath("(//ul[@class='G43f7ed']//li[@class='sbct'])[1]"));
		commons.checkElementsVisibility(driver, autoSearchResults);
		// clicking on element
		autoSearchResults.click();
		commons.getHardwait();
		node.pass("Pass");
	}
	
	@Test
	public void googleSearchSeleniumDoc() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ExtentTest node = test.createNode(name);
		commons = new Commons();
		// fetch search bar location
		WebElement searchBar = driver.findElement(By.name("q"));
		// send srach text
		searchBar.sendKeys("Selenium Doc");
		WebElement autoSearchResults = driver.findElement(By.xpath("(//ul[@class='G43f7e']//li[@class='sbct'])[1]"));
		commons.checkElementsVisibility(driver, autoSearchResults);
		// clicking on element
		autoSearchResults.click();
		commons.getHardwait();
		node.pass("Pass");

	}

	
	@AfterMethod
	public void teardown() {
		commons = new Commons();
		reports.attachReporter(spark);
		reports.flush();
		// close the browser window
				commons.closeWindow(driver);
	}

}
