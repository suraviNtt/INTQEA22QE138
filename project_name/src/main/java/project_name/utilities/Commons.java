package project_name.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import project_name.readers.FileReaders;
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
	
	/**
	 * 
	 * @param driver
	 * @param element
	 */
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
	 * 
	 * @param driver
	 * @param element
	 * @param text
	 */
	public void enterTextWebElement(WebDriver driver, WebElement element, String text) {
		try {
			
			int time = getExplicitWait();
			wait = new WebDriverWait(driver,Duration.ofSeconds(time));
			if(wait.until(ExpectedConditions.visibilityOf(element)) != null) {
				element.sendKeys(text);;
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
	
	/**
	 * 
	 * @return
	 */
	private int getExplicitWait() {
		try {
			propertyReader = new PropertyReader();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propertyReader.getExplicitWait();
		
	}
	
	/**
	 * 
	 * @param driver
	 * @param fileName
	 */
	public void takescreenShot(WebDriver driver , String fileName) {
		 TakesScreenshot scrShot =((TakesScreenshot) driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination
	                FileReaders file = new FileReaders();
	                File DestFile=new File(file.getTestOutputLocation(fileName));

	                //Copy file at destination

	                try {
						FileUtils.copyFile(SrcFile, DestFile);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
	}
}

