package project_name;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import project_name.pages.HomePage;
import project_name.utilities.BrowserSetup;

public class TestDemo {

	public static void main(String[] args) {

		BrowserSetup browserSetup = new BrowserSetup();
		WebDriver driver = browserSetup.getDriverSetup();

		HomePage homePage = new HomePage(driver);

	}
}
