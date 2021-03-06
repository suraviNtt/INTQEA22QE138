package project_name;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import project_name.utilities.Commons;

public final class ActionsClassExample {

public static void main(String[] args) {
		
		// intializations
				Commons commons = new Commons();
				// Driver Setup
				WebDriver driver = commons.setUpDriver();
				driver.get("https://www.justdial.com/Free-Listing");
				WebElement tools = driver.findElement(By.id("flcity"));		
				commons.clickOnWebElement(driver, tools);
				commons.enterTextWebElement(driver, tools , "B");
				Actions action = new Actions(driver);
				action.sendKeys(Keys.ARROW_DOWN , Keys.ENTER).build().perform();
//				commons.getHardwait();
//				WebElement time = driver.findElement(By.xpath("//*[@class='rIbAWc']//div[text()='Time']"));
//				commons.clickOnWebElement(driver, time);
//				commons.getHardwait();
//				WebElement coustomRange = driver.findElement(By.xpath("(//*[@id='lb']//g-menu-item)[7]//span"));
//				commons.clickOnWebElement(driver, coustomRange);
	}

}
