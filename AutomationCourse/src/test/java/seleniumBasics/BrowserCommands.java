package seleniumBasics;


public class BrowserCommands extends Base { //extends base class 
	
	
	
	public void browserCommands() {
		
		String url = driver.getCurrentUrl(); //to get url of the page
		String title = driver.getTitle(); // to get site title
		String handleID = driver.getWindowHandle(); //to get handle id
		String pageSource = driver.getPageSource(); //to get page source
		
		
		
		System.out.println(title); //title printing
		System.out.println(url); //url printing  
		System.out.println(handleID); //handle id printing
		System.out.println(pageSource); //page source printing
		
	}
	
	public void navigationCommands() {
		
		
		driver.navigate().to("https://www.flipkart.com"); //to get into another site
		driver.navigate().back(); //to get back to  main site
		driver.navigate().forward(); // to get back to the visited site
		driver.navigate().refresh(); // to refresh the page
	}
	
	

	public static void main(String[] args) {
		
		
	BrowserCommands browsercommands = new BrowserCommands(); //creating object
	
	browsercommands.initializeBrowser(); //invoking base.java class
	//browsercommands.browserCommands(); //invoking current class method
	
	
	browsercommands.navigationCommands(); //invoking Navigation commands
	
	
	
	
	
	
	
	
	//browsercommands.closeandQuit(); // invoking closing class
		
		
	}

}
