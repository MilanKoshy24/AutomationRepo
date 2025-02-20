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
		
		WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourMessage.getText());
		
		messageOne.clear();
		
		System.out.println(buttonOne.getCssValue("background-color"));
		
		System.out.println(buttonOne.getSize());
		
		System.out.println(buttonOne.getTagName());
	}
	
	

	
	public static void main(String[] args) {
		
		WebElementCommands webElementCommands = new WebElementCommands();
		
		webElementCommands.initializeBrowser();
		webElementCommands.webElements();
			
		webElementCommands.closeandQuit();
		
		
	}

}
