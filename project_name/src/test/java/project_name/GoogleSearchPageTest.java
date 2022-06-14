package project_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_name.utilities.Commons;

public class GoogleSearchPageTest {
	
	WebDriver driver;
	Commons commons;

	final private static String url = "https://www.google.com";
	
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
		

	}
	
	
	@Test
	public void googleSearchSeleniumBook() {
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
	}
	
	@Test
	public void googleSearchSeleniumDoc() {
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
		

	}

	
	@AfterMethod
	public void teardown() {
		commons = new Commons();
		// close the browser window
				commons.closeWindow(driver);
	}

}
