package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandelingCheckbox extends Base {

	
	public void handelingChekbox() {
	
		driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement optionOne = driver.findElement(By.xpath("//input[@value='option-1']"));
		optionOne.click();
		
	}
	
	public void handelingRadiobutton() {
		
		driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioThree = driver.findElement(By.xpath("//input[@value='yellow']"));
		radioThree.click();
		System.out.println(radioThree.isSelected());
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		HandelingCheckbox checkbox = new HandelingCheckbox();
		
		checkbox.initializeBrowser();
		//checkbox.handelingChekbox();	
		checkbox.handelingRadiobutton();
		//checkbox.closeandQuit();

		
		
		
	}

}
