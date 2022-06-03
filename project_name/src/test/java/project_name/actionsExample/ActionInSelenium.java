package project_name.actionsExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import project_name.readers.FileReaders;
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
		
		 TakesScreenshot scrShot =((TakesScreenshot) driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination
	                FileReaders file = new FileReaders();
	                File DestFile=new File(file.getTestOutputLocation("image"));

	                //Copy file at destination

	                try {
						FileUtils.copyFile(SrcFile, DestFile);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
	}
}
