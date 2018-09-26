package MyGroup.MyArtifact;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Hello world!
 *
 */
public class App 
{
	public static WebDriver driver;
	public static WebElement webelement;
	public static String BrowserName;
	public static String ChromerDriverURL = "C:\\Automation\\WebDrivers\\chromedriver.exe";
	
    public static void main( String[] args ) throws InterruptedException, IOException, SQLException, ClassNotFoundException
    {
    	BrowserName = "CHROME";
    	Browser.LaunchBrowser();
    	//ReadTestCase.ReadTestFromExcel();
    	ReadTestCase.ReadTestFromDB();
        
        driver.navigate().to("https://qa.applications.marykayintouch.com/login/login.aspx");
        
        
    }
}
