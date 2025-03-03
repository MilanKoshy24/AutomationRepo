package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandelingFrames extends Base{
	
	public void handelingFrames() {
		
		driver.navigate().to("https://demoqa.com/frames");
		
		List<WebElement>iframe = driver.findElements(By.tagName("iframe"));
		
		int iframeCount = iframe.size();
		
		System.out.println(iframeCount);
		
		WebElement pageOne = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		
		driver.switchTo().frame(pageOne);
		
		WebElement sampleHeading =  driver.findElement(By.id("sampleHeading"));
		System.out.println(sampleHeading.getText());
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getTitle());
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		
		HandelingFrames handelingframes = new HandelingFrames();
		
		
		handelingframes.initializeBrowser();
		handelingframes.handelingFrames();
	
		
		
		//handelingframes.closeandQuit();

	}

}
