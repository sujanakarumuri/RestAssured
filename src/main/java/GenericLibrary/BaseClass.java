package GenericLibrary;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseClass {
	
	public DataBaseLibrary dlib=new DataBaseLibrary();
	public ExcelFileUtility elib=new ExcelFileUtility();
	public JavaUtility jlib=new JavaUtility();
	public RestAssuredLibrary rlib=new RestAssuredLibrary();
	
	@BeforeSuite
	public void bsConfig() throws SQLException 
	{
		dlib.connectToDB();
		baseURI="http://rmgtestingserver";
		port=8084;
		
	}
	@AfterSuite
	public void asconfig() throws SQLException
	{
		dlib.closeDB();
	}

}
