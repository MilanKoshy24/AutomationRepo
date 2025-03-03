package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandelingTable extends Base{
	
	public void handelingTable() {
		
		
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement showMore = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showMore.click();
		
		//WebElement tableFirst = driver.findElement(By.xpath("//table[@id='dataTable']"));
		//System.out.println(tableFirst.getText());
		
		WebElement tableRowTwo =  driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tableRowTwo.getText());
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		

		HandelingTable handelingtable = new HandelingTable();
		
		handelingtable.initializeBrowser();
		handelingtable.handelingTable();
	
		
		
		//handelingtable.closeandQuit();
		
		
		
	}

}
