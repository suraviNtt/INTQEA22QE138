package project_name.eventsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project_name.handlers.AlertHandler;
import project_name.utilities.Commons;

public class AlertsExample {

	public static void main(String[] args) {
		Commons commons = new Commons();
		AlertHandler alertHandler = new AlertHandler();
		// Driver Setup
		WebDriver driver = commons.setUpDriver();
		// open the application
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement submitButton =  driver.findElement(By.name("submit"));
		commons.clickOnWebElement(driver, submitButton);
		//clicking cancel button
		alertHandler.cancelAlert(driver);
		//clicking Ok button
		alertHandler.acceptAlert(driver);
		alertHandler.acceptAlert(driver);
		//send text to alert
	//	driver.switchTo().alert().sendKeys("text");
		
		commons.clickOnWebElement(driver, submitButton);
		
	System.out.println(driver.switchTo().alert().getText());
	
		
	}
}
