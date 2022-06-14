package project_name;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project_name.utilities.Commons;

public class yatra {

	public static void main(String[] args) {
		
		Commons commons = new Commons();
		// Driver Setup
		WebDriver driver = commons.setUpDriver();
		
		driver.get("https://www.yatra.com/offer/dom/listing/holiday-deals");
		
		List<WebElement> headings = driver.findElements(By.xpath("//*[@class='minHTitle inlineBlock']//span[@class='offerMainTitle']"));
		List<WebElement> subheading = driver.findElements(By.xpath("//*[@class='minHTitle inlineBlock']//p"));
		
		
		for(int i = 0; i< headings.size() ; i++) {
			
				String txt = subheading.get(i).getText();
				if(txt.contains("Starting at ₹")) {
					
					String headingTxt = headings.get(i).getText();
					System.out.println(headingTxt + " : " +txt);
					
				}
		
		}
		
	}
}
