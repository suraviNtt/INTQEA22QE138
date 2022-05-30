package project_name.utilities;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import project_name.readers.PropertyReader;

public class Commons {

	PropertyReader propertyReader;

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
}