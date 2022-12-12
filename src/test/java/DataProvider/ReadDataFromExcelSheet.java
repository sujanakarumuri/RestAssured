package DataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLibrary.ExcelFileUtility;
import GenericLibrary.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
 

public class ReadDataFromExcelSheet {
	
	@Test(dataProvider="getData")
	public void dataprovider(String createdBy,String projectName, String status, String teamSize)
	{
		//System.out.println(createdBy+" "+projectName+" "+status+" "+teamSize);
		JavaUtility jutil=new JavaUtility();
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", createdBy);
		jobj.put("projectName",projectName+jutil.getRandomNumber());
		jobj.put("status",status);
		jobj.put("teamSize", teamSize);
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		
	}
	@DataProvider(name="getData")
	public Object[][] getDataFromExcel() throws EncryptedDocumentException, IOException
	{
		ExcelFileUtility eutil=new ExcelFileUtility();
		
		Object[][] obj=eutil.readMUltipleDataFromExcelSheet("Sheet1");
		return obj;
	}

}
