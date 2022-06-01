package project_name.utilities;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import project_name.readers.PropertyReader;

public class Commons {

	PropertyReader propertyReader;
	WebDriverWait wait;

	/**
	 * to get hard wait
	 */
	public void getHardwait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Web driver Set Up
	 * 
	 * @return
	 */
	public WebDriver setUpDriver() {
		WebDriver driver = null;
		try {
			propertyReader = new PropertyReader();
			BrowserSetup browserSetup = new BrowserSetup();
			driver = browserSetup.getDriver(propertyReader.getBrowserName());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(propertyReader.getImplicitWait(), TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;

	}
	
	
	
	
	

	/**
	 * to open the application
	 * 
	 * @param driver
	 */
	public void launchApplication(WebDriver driver) {
		try {
			propertyReader = new PropertyReader();
			driver.get(propertyReader.getApplicationUrl());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void checkElementsVisibility(WebDriver driver , WebElement element) {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(getExplicitWait()));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void clickOnWebElement(WebDriver driver, WebElement element) {
		try {
			
			int time = getExplicitWait();
			wait = new WebDriverWait(driver,Duration.ofSeconds(time));
			if(wait.until(ExpectedConditions.elementToBeClickable(element)) != null) {
				element.click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * close the browser
	 * 
	 * @param driver
	 */
	public void teardown(WebDriver driver) {
		driver.quit();
	}

	/**
	 * close the current browser window
	 * 
	 * @param driver
	 */
	public void closeWindow(WebDriver driver) {
		driver.close();
	}
	
	private int getExplicitWait() {
		try {
			propertyReader = new PropertyReader();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propertyReader.getExplicitWait();
		
	}
}

