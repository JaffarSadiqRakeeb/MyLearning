package MyGroup.MyArtifact;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser 
{
	public static void Open()
	{
		
	}
	public static void LaunchBrowser()
	{
		try 
		{
			if(App.BrowserName.toUpperCase().contentEquals("CHROME"))
			{
	
			System.setProperty("webdriver.chrome.driver", App.ChromerDriverURL);
	    	
	    	ChromeOptions options = new ChromeOptions(); 
	    	options.addArguments("disable-infobars"); //disable the infobars
	    	options.addArguments("disable-extensions"); //disable the extension
	    	options.addArguments("--start-maximized"); //Maximize the window
	    	
	        App.driver = new ChromeDriver(options);
			}
		}
		catch(Exception Ex)
		{
			
		}
	}
}
