package project_name.switchingWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project_name.utilities.BrowserSetup;

public class SwitchingWindowsExample {

	public static void main(String[] args) {

		BrowserSetup browserSetup = new BrowserSetup();
		WebDriver driver = browserSetup.getDriverSetup();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		String parentWindow = driver.getWindowHandle();

		WebElement termsAndConditions = driver.findElement(By.linkText("terms and conditions"));
		termsAndConditions.click();

		Set<String> windows = driver.getWindowHandles();
		for (String s : windows) {
			if (s != parentWindow) {
				driver.switchTo().window(s);
			}
		}

		String child = driver.getTitle();
		System.out.println(child);
		driver.close();
		driver.switchTo().window(parentWindow);

		System.out.println(driver.getTitle());
		
		//driver.switchTo().frame(3);

	}

}
