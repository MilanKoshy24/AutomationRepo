package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandeling extends Base {

	public void multipleWindowHandeling() {
		
		driver.navigate().to(" https://demo.guru99.com/popup.php");
		
		 String parent_window_handleid=driver.getWindowHandle(); 
	 		System.out.println("Parent window handle id is: "+parent_window_handleid);
		
		WebElement clickHere =  driver.findElement(By.xpath("//a[starts-with(text(),'Click Here')]"));
		clickHere.click();
		
		Set<String>handleids = driver.getWindowHandles();
		System.out.println(handleids);
		
		 Iterator<String>values=handleids.iterator(); 
	 		while(values.hasNext()) 
	 		{ 
	 			String current_id=values.next(); 
	 			if(!current_id.equals(parent_window_handleid)) 
	 			{ 
	 				driver.switchTo().window(current_id); 
	 				WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']")); 
	 				email_fld.sendKeys("aishu123@gmail.com"); 
	 				WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']")); 
	 				submit_fld.click(); 
	 				driver.switchTo().defaultContent(); 
	 			} 
	 		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		MultipleWindowHandeling multiplewindowhandeling = new MultipleWindowHandeling();
		
		multiplewindowhandeling.initializeBrowser();
		
		multiplewindowhandeling.multipleWindowHandeling();
		
		//multiplewindowhandeling.closeandQuit();
 
	}

}
