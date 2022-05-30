package project_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import project_name.utilities.Commons;

public class GoogleSearchPageTest {

	final private static String url = "https://www.google.com";

	public static void main(String[] args) {
		// intializations
		Commons commons = new Commons();
		// Driver Setup
		WebDriver driver = commons.setUpDriver();
		// open the application
		commons.launchApplication(driver);
		// fetch search bar location
		WebElement searchBar = driver.findElement(By.name("q"));
		// send srach text
		searchBar.sendKeys("Selenium");
		commons.getHardwait();
		WebElement autoSearchResults = driver.findElement(By.xpath("(//ul[@class='G43f7e']//li[@class='sbct'])[1]"));
		// clicking on element
		autoSearchResults.click();
		commons.getHardwait();
		// close the browser window
		commons.closeWindow(driver);

	}
}