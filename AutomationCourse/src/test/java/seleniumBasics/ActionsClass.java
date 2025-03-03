package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends Base {
	
	public void rightClickAction() {
		
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions action =  new Actions(driver); //creating object for action class
		
		action.contextClick(rightClick).build().perform();
		
	}
	
	
	public void mouseHoverAction() {
		
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement mouseHover = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions action =  new Actions(driver);
		
		action.moveToElement(mouseHover).build().perform();
		
		
		
	}
	
	
	public void dragAndDropAction() {
		
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dropElement = driver.findElement(By.id("droppable"));
		
		Actions action =  new Actions(driver);
		
		action.dragAndDrop(dragElement,dropElement).build().perform();
		
		
		
	}
	
	public void verifyKeyboardAction() throws AWTException {
		
		
	 		Robot robot=new Robot(); 
	 		robot.keyPress(KeyEvent.VK_CONTROL); 
	 		robot.keyPress(KeyEvent.VK_T); 
	 		robot.keyRelease(KeyEvent.VK_CONTROL); 
	 		robot.keyRelease(KeyEvent.VK_T);
		
		
		
	}


	
	public static void main(String[] args) {
		
		
		ActionsClass actionclass = new ActionsClass(); 
		
		actionclass.initializeBrowser();
		
	//	actionclass.rightClickAction();
		
	//	actionclass.mouseHoverAction();
		
	//  actionclass.dragAndDropAction();
		
		try {
			actionclass.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		//actionclass.closeandQuit(); 
		

	}

}
