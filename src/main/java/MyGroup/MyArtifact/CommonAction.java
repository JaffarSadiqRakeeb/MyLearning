
package MyGroup.MyArtifact;

public class CommonAction 
{
	public static void Click() 
	{
		WebPageDetails.WebElementHandler();
		App.webelement.click();
		System.out.println("Element Clicked Successfully");
	}
	
	public static void Type()
	{
		WebPageDetails.WebElementHandler();
		App.webelement.sendKeys(App.CTestCaseValue);
		
		
	}
}
