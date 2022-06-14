package project_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project_name.utilities.Commons;

public class ToolssueInImageSearch {
	
	public static void main(String[] args) {
		
		// intializations
				Commons commons = new Commons();
				// Driver Setup
				WebDriver driver = commons.setUpDriver();
				driver.get("https://www.google.co.in/search?tbs=sbi:AMhZZivd9Zdx3oRIs2ZF6dHWrcZyiBVKCzmMe-N0aJ36YPG9Pp9OYcfWRE7qRocC_1vxznkSmb1LARI9mMyKcq4dHaMzfuLLse1oBMkUApIXKrW2QML-YUAI-rIpLq-T2cc61Uz54HCSKx9k9of1mQzQqRD6UYGMrJb-S4HnpDve05KycJGIG_1eQdI8nkN11sbYiNUce1HT4By3MuV_18AJNsXj5xy-VOgpTtamUN413M7wnK6p_19om7r1WZKxieGLaVlSpyW4Byi3Gt31nQ0mAzs-G3JlblOfgp_1-1fR1BEPaXy6XiicWueCxeBMripySVhz7siqeXz7Cd0OPpJnhflfBZke1cjwy1g&hl=en-IN");
				WebElement tools = driver.findElement(By.id("hdtb-tls"));
				commons.clickOnWebElement(driver, tools);
				commons.getHardwait();
				WebElement time = driver.findElement(By.xpath("//*[@class='rIbAWc']//div[text()='Time']"));
				commons.clickOnWebElement(driver, time);
				commons.getHardwait();
				WebElement coustomRange = driver.findElement(By.xpath("(//*[@id='lb']//g-menu-item)[7]//span"));
				commons.clickOnWebElement(driver, coustomRange);
	}

}
