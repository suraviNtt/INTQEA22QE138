package project_name.utilities;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	public WebDriver getDriver(String browserName) {

		WebDriver driver = null;
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		default:
			break;
		}
		return driver;

	}

	public WebDriver getDriverSetup() {

		WebDriver driver = null;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Enter browser name ");
			String browsername = scan.next();
			switch (browsername) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;

			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			default:
				System.out.println("your selection is not correct");
				break;
			}
		} while (driver == null);
		
		scan.close();
		return driver;

	}
}
