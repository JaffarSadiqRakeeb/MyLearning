package MyGroup.MyArtifact;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadTestCase
{
	
	
	public static void ReadTestFromExcel() throws IOException
	{
		ArrayList<String> TestCaseActionType = new ArrayList<String>();
		ArrayList<String> TestCaseTarget = new ArrayList<String>();
		ArrayList<String> TestCaseValue = new ArrayList<String>();
			
		File file = new File("D:\\TestCase.xlsx");
		FileInputStream FIS = new FileInputStream(file);
		Workbook WB = new XSSFWorkbook(FIS);
		Sheet Sh = WB.getSheet("Sheet1");
		
		int rowCount = Sh.getLastRowNum() - Sh.getFirstRowNum();
		DataFormatter DF = new DataFormatter();	
		for(int i = 0;i < rowCount + 1; i++)
		{
			Row row = Sh.getRow(i);
			 TestCaseActionType.add(DF.formatCellValue(row.getCell(0)));	
			 TestCaseTarget.add(DF.formatCellValue(row.getCell(1))); //wil display the 1 numeric value as 1
			 TestCaseValue.add(row.getCell(2).toString());          // will display the 1 numberic value as 1.0
				
		}
		
		for(String Test : TestCaseActionType)
		{
			System.out.println(Test);
		}
		for(String Test : TestCaseTarget)
		{
			System.out.println(Test);
		}
		for(String Test : TestCaseValue)
		{
			System.out.println(Test);
		}
	}
	public static void ReadTestFromDB() throws SQLException, ClassNotFoundException
	{
		ArrayList<String> TestCaseActionType = new ArrayList<String>();
		ArrayList<String> TestCaseTarget = new ArrayList<String>();
		ArrayList<String> TestCaseValue = new ArrayList<String>();
		
		String DatabaseURL = "jdbc:mysql://localhost:3306/contacts";
		String username = "root";
		String password = "jaffar";

		Connection Con = DriverManager.getConnection(DatabaseURL,username,password);		
		Statement Stmt = Con.createStatement();
		ResultSet rs   = Stmt.executeQuery("Select * from TestCase");  
		
		while(rs.next())
		{
			TestCaseActionType.add(rs.getString("ActionType"));
			TestCaseTarget.add(rs.getString("Target"));
			TestCaseValue.add(rs.getString("Value"));
		}
		Con.close();
		
		for(String Test : TestCaseActionType)
		{
			System.out.println(Test);
		}
		for(String Test : TestCaseTarget)
		{
			System.out.println(Test);
		}
		for(String Test : TestCaseValue)
		{
			System.out.println(Test);
			System.out.println(Test);
		}

	}
}

