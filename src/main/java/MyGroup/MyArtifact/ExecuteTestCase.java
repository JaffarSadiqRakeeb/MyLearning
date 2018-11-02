package MyGroup.MyArtifact;

public class ExecuteTestCase
{
	
public static void ExecuteTestCaseStep()

	{
	
		for(App.CStepNumber=1; App.CStepNumber < App.TestCaseActionType.size(); App.CStepNumber++)
		{
			App.CStepNumber = App.CStepNumber;
			App.CTestCaseActionType = App.TestCaseActionType.get(App.CStepNumber);
			App.CTestCaseTarget = App.TestCaseTarget.get(App.CStepNumber);
			App.CTestCaseValue = App.TestCaseValue.get(App.CStepNumber);
			
			if(App.CTestCaseActionType.toUpperCase().contentEquals("OPEN"))
			{
				Browser.Open();
			}
			
			if(App.CTestCaseActionType.toUpperCase().contentEquals("CLICK"))
			{
				CommonAction.Click();
			}
			
			if(App.CTestCaseActionType.toUpperCase().contentEquals("TYPE"))
			{
				CommonAction.Type();
			}
			
		}
	}
}
