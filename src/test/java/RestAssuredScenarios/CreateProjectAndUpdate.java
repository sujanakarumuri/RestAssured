package RestAssuredScenarios;

import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.EndPointLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import pojoClassForParsing.POJOclassForCreateRequest;

public class CreateProjectAndUpdate extends BaseClass{
	
	@Test
	public void CreateAndUpdate() throws SQLException
	{
		POJOclassForCreateRequest pc=new POJOclassForCreateRequest("Sujana","TYSS"+jlib.getRandomNumber(), "ongoing", 5);
		
		  Response resp = given().body(pc).contentType(ContentType.JSON)
		 .when().post(EndPointLibrary.createProject);
		 resp.then().log().all();
		 
		 String pid = rlib.getJsonData(resp, "projectId");
		 
		 System.out.println(pid);
		 
		 POJOclassForCreateRequest pc1=new POJOclassForCreateRequest("Raghuram","HP"+jlib.getRandomNumber(),"Continue", 20);
		 
		 Response res1 = given().body(pc1).contentType(ContentType.JSON)
		 .when().put(EndPointLibrary.updateProject+pid);
		 
		 String pid1 = rlib.getJsonData(res1, "projectId");
		 res1.then().assertThat().statusCode(200);
		
		 String query = "select * from project";
		String result = dlib.readDataFromDBAndValidate(query, 1, pid1);
		 Assert.assertEquals(pid, result);
		 res1.then().log().all();
		 
		 System.out.println("successfully updated");
		 
	}

}
