package project_name.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project_name.handlers.AlertHandler;
import project_name.utilities.Commons;

public class DynamicDropdwon {

	public static void main(String[] args) {
		Commons commons = new Commons();
		// Driver Setup
		WebDriver driver = commons.setUpDriver();
		// open the application
		driver.get("https://www.makemytrip.com");
		
		WebElement addBar = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[9]/span"));
		commons.clickOnWebElement(driver, addBar);
		commons.getHardwait();
		WebElement fromLocation = driver.findElement(By.xpath("//input[@id='fromCity']"));
		commons.clickOnWebElement(driver, fromLocation);
		WebElement fromLocationTextBox = driver.findElement(By.xpath("//input[@placeholder='From']"));
		commons.enterTextWebElement(driver, fromLocationTextBox , "CCU");
		commons.getHardwait();
		WebElement firstElementInAutoSugetedList = driver.findElement(By.xpath("//ul[@role='listbox']//li[1]"));
		commons.clickOnWebElement(driver, firstElementInAutoSugetedList);
		
	
	}
}
