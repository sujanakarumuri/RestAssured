package RestAssuredScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.EndPointLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import pojoClassForParsing.POJOclassForCreateRequest;

public class CreateProjectAndDelete extends BaseClass {
	
	@Test
	public void CreateAndDelete() throws SQLException
	{
		//step1:create pre requisited
		POJOclassForCreateRequest pc=new POJOclassForCreateRequest("sujana","QSP"+jlib.getRandomNumber(),"completed",10);
		
		//steps 2: send the request
		Response resp = given().body(pc).contentType(ContentType.JSON)
		
		.when().post(EndPointLibrary.createProject);
		
		String expdata = rlib.getJsonData(resp, "projectId");
		System.out.println(expdata);
		resp.then().log().all();
		
		when().delete(EndPointLibrary.deleteProject+expdata);
		
		String query = "select * from project";
		String actdata = dlib.readDataFromDBAndValidate(query, 1, expdata);
		
		Assert.assertNotEquals(expdata, actdata);
		
		System.out.println("data is deleted");
		
		resp.then().log().all();
		
		
		
		
		
		
		
	}

}
