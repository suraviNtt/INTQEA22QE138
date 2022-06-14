package project_name.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_name.utilities.Commons;

public class LoginPage extends Commons{
	
	WebDriver driver;

	@FindBy(id = "")
	WebElement usernameField;
	
	@FindBy(id = "")
	WebElement passwordField;
	
	@FindBy(id = "")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void login(String username , String password) {
		getHardwait();
		enterTextWebElement(driver, usernameField, username);
		enterTextWebElement(driver, passwordField, password);
		clickOnWebElement(driver, loginButton);
	}
}
