package MyGroup.MyArtifact;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WebPageDetails 
{
	public static void SplitElement()
	{
		
		if(App.CTestCaseTarget.toUpperCase().startsWith("ID"))
		{
			App.by = By.id(App.CTestCaseTarget.split("=")[1]);
			
		}
		if(App.CTestCaseTarget.toUpperCase().startsWith("NAME"))
		{
			App.by = By.name(App.CTestCaseTarget.split("=")[1]);
		}
		if(App.CTestCaseTarget.toUpperCase().startsWith("//"))
		{
			App.by = By.xpath(App.CTestCaseTarget);
		}
				
	}
	public static void WebElementHandler()
	{
		SplitElement();
		WaitForPageLoad(App.driver);
		App.webelement = App.driver.findElement(App.by);
	}
	
	public static void WaitForPageLoad(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)App.driver;
		
			
		while(js.executeScript("return document.readyState").equals("complete"))
		{
			
			System.out.println("Page Loaded Successfully");
			break;
		}
		
	}
}
