package project_name.handlers;

import org.openqa.selenium.WebDriver;

public class AlertHandler {
	
	/**
	 * 
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		try {
		driver.switchTo().alert().accept();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	 * 
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver) {
		try {
		driver.switchTo().alert().dismiss();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
