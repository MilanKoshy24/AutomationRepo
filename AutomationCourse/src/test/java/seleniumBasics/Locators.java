package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public void handlingLocators() {
		
		
		WebElement showMessageButton = driver.findElement(By.id("button-one"));     //creating web element //its a interface
		
		driver.findElement(By.id("message-one"));  //locating element with id
		driver.findElement(By.className("my-2")); // locating element with class
		driver.findElement(By.name("description")); //locating element with name
		driver.findElement(By.tagName("button")); //locating element with tag name
		driver.findElement(By.linkText("Simple Form Demo")); //locating element with linkText
		driver.findElement(By.partialLinkText("Simple")); //locating element with partial link text
		
		
	}
	
	
	public static void main(String[] args) {
		
		Locators locator = new Locators ();
		
		locator.initializeBrowser();
		locator.handlingLocators();
		
		
		
		
		
		
		locator.closeandQuit();

	}

}
