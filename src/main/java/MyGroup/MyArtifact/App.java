package MyGroup.MyArtifact;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.openqa.selenium.By;
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
	public static By by;
	public static String ChromerDriverURL = "C:\\Jaffar\\Learning\\chromedriver.exe";
	
	
	public static ArrayList<String> TestCaseActionType = new ArrayList<String>();
	public static ArrayList<String> TestCaseTarget = new ArrayList<String>();
	public static ArrayList<String> TestCaseValue = new ArrayList<String>();
	
	public static int CStepNumber; 
	public static String CTestCaseActionType, CTestCaseTarget, CTestCaseValue;
	
	
	
    public static void main( String[] args ) throws InterruptedException, IOException, SQLException, ClassNotFoundException
    {
    	BrowserName = "CHROME";
    	Browser.LaunchBrowser();
    	ReadTestCase.ReadTestFromExcel();
    	//ReadTestCase.ReadTestFromDB();
        
    	ExecuteTestCase.ExecuteTestCaseStep();
        
        
    }


	
}
