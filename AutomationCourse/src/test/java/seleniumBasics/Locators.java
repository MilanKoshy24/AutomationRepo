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
		driver.findElement(By.cssSelector("button[id='button-two']")); //locating element with css locator
		driver.findElement(By.xpath("//button[@id='button-one']")); //locating element with xpath locator
		driver.findElement(By.xpath("//button[@id='button-two']"));
		driver.findElement(By.xpath("//input[@id='single-input-field']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));//locating xpath with text
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]")); //locating xpath with partial part of a tag or a text in it or without attribute
	
	
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']")); //locating xpath with AND
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']")); //locating xpath with OR
		driver.findElement(By.xpath(" //div[contains(text(),'Single Input Field')]//parent::div[@class='card']")); //locating xpath with axes methonds
		driver.findElement(By.xpath(" //div[@class='card']//child::button[@id='button-one']")); //locating xpath with parent
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));//following
		driver.findElement(By.xpath(" //button[@id='button-one']//preceding::div[@class='card']"));   // preceding
		driver.findElement(By.xpath(" //button[@id='button-one']//ancestor::div")); //ancestor
		driver.findElement(By.xpath(" //div[@class='card']//descendant::div")); //descendant
		
	
	
	
	
	
	
	}
	
	
	public static void main(String[] args) {
		
		Locators locator = new Locators ();
		
		locator.initializeBrowser();
		locator.handlingLocators();
		
		
		
		
		
		
		locator.closeandQuit();

	}

}


















