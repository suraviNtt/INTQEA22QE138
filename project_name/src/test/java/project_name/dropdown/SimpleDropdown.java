package project_name.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import project_name.utilities.Commons;

public class SimpleDropdown {

	public static void main(String[] args) {
		Commons commons = new Commons();
		// Driver Setup
		WebDriver driver = commons.setUpDriver();
		// open the application
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement day = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select select = new Select(day);
		select.selectByIndex(3);
		
		commons.getHardwait();
		select.selectByValue("06");
		
		commons.getHardwait();
		select.selectByVisibleText("10");
	//	System.out.println(day.getText());
	}
}
