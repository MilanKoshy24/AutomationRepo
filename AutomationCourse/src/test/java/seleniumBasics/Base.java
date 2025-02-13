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
		
		driver.get(" https://selenium.qabible.in/");
		driver.manage().window().maximize();
		
	}

	public static void main(String[] args) {
		
		Base base = new Base();
		base.initializeBrowser();

	}

}
