package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	
	public WebDriver driver; //to initilize_globally
	
	public void initializeBrowser() {
		
		//driver = new EdgeDriver();
		driver = new ChromeDriver();
		//driver = new BraveDriver();
		
		driver.get("https://selenium.qabible.in/");
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	
	
	public void closeandQuit() {
		
		  
		//driver.close(); //to close single page in a browser
		
		driver.quit(); //to close the whole browser
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Base base = new Base();
		base.initializeBrowser();
		

	}

}
