package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandeling extends Base{
	
	public void handelingSimplerAlert() {
		
		driver.navigate().to(" https://demoqa.com/alerts");
		
		WebElement simpleClickMe =  driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleClickMe.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
	public void handelingConfirmAlert() {
		
		driver.navigate().to(" https://demoqa.com/alerts");
		
		WebElement confirmClickMe =  driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmClickMe.click();
		
		
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		
	}
	
	
	public void handelingPromptAlert() {
		
		driver.navigate().to(" https://demoqa.com/alerts");
		
		WebElement promptClickMe = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptClickMe.click();
		
        Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.sendKeys("Milan Koshy John");
		alert.accept();
		
		
		
	}

	public static void main(String[] args) {
	
		AlertHandeling alerthandeling = new AlertHandeling();
		
		alerthandeling.initializeBrowser();
		//alerthandeling.handelingSimplerAlert();
		
		//alerthandeling.handelingConfirmAlert();
		
		alerthandeling.handelingPromptAlert();
		
		//alerthandeling.closeandQuit();

	}

}
