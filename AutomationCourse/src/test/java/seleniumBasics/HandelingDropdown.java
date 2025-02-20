package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandelingDropdown extends Base {
	
	
	
	public void handelingDropdownd() {
		
		driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement dropdownOne = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select selectOne = new Select(dropdownOne);
		selectOne.selectByIndex(1);
		
		
		WebElement dropdownTwo = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select selectTwo = new Select(dropdownTwo);
		selectTwo.selectByValue("testng");
	}
	
	
	
	

	public static void main(String[] args) {


		HandelingDropdown handelingdropdownd = new HandelingDropdown();
		
		handelingdropdownd.initializeBrowser();
		handelingdropdownd.handelingDropdownd();		
		
		//handelingdropdownd.closeandQuit();

	}

}
