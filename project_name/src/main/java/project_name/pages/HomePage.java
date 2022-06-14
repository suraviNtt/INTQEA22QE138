package project_name.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_name.utilities.Commons;

public class HomePage extends Commons {
	
	WebDriver driver ;
	
	@FindBy(id = "")
	WebElement appLogo;
	
	@FindBy(id = "")
	WebElement searchBar;
	
	@FindBy(id = "")
	WebElement searchIcon;
	
	@FindBy(id = "")
	WebElement signinButton;
	
	
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * @param searchText
	 */
	public void searchByText(String searchText) {
		enterTextWebElement(driver, searchBar, searchText);
		clickOnWebElement(driver, searchIcon);
	}
	
	/**
	 * 
	 * 
	 */
	public void openLoginPage() {
		clickOnWebElement(driver, signinButton);
	}
	
}
