package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {

	
	
	public void webElements() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		
		WebElement messageOne =  driver.findElement(By.xpath("//input[@id='single-input-field']"));	
		messageOne.sendKeys("hello text box one");
		
		//WebElement messageTwo = driver.findElement(By.xpath("//input[@id='value-a']"));
		//messageTwo.sendKeys("hello text box two");
		
		WebElement buttonOne =  driver.findElement(By.xpath("//button[@id='button-one']"));
		buttonOne.click();
		
		
		
	}
	
	

	
	public static void main(String[] args) {
		
		
		WebElementCommands webElementCommands = new WebElementCommands();
		
		webElementCommands.initializeBrowser();
	
		webElementCommands.webElements();
		
		
		
		
		
		
		
		//webElementCommands.closeandQuit();
		
		
	}

}
