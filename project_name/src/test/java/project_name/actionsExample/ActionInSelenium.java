package project_name.actionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import project_name.utilities.Commons;

public class ActionInSelenium {

	
	public static void main(String[] args) {
		Commons commons = new Commons();
		// Driver Setup
		WebDriver driver = commons.setUpDriver();
		// open the application
		driver.get("https://www.amazon.in/");
		Actions actions = new Actions(driver);
		
		driver.findElement(By.xpath("//a[normalize-space()='Fashion']")).click();
		WebElement womenTab = driver.findElement(By.xpath("//span[normalize-space()='Women']"));
		commons.getHardwait();
		actions.moveToElement(womenTab).perform();
		
		commons.takescreenShot(driver, "image2");
	}
}
