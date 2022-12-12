package RestAssuredScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.EndPointLibrary;
import GenericLibrary.Iconstants;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassForParsing.EmployeeDetails;
import pojoClassForParsing.POJOclassForCreateRequest;

public class CreateProjectAndVerifyInDataBase extends BaseClass {
	
	@Test
	public void createProject() throws SQLException
	{
		//baseURI="http://rmgtestingserver";
		//baseURI=Iconstants.DBUrl;
		//port=8084;
		//basePath="addProject";
		
		//step1: create pre requisites
		POJOclassForCreateRequest pj=new POJOclassForCreateRequest("Sujana","QSP"+jlib.getRandomNumber(),"created",10);
		
		//step2: send the request
		
		Response resp=given().body(pj).contentType(ContentType.JSON)
		.when().post(EndPointLibrary.createProject);
		
		//step3:capture the projectID
		String expdata = rlib.getJsonData(resp,"projectId");
		System.out.println(expdata);
		
		//step4:validate the id in database
		String Query = "select * from project";
		String actualdata = dlib.readDataFromDBAndValidate(Query, 1, expdata);
		Assert.assertEquals(expdata, actualdata);
		System.out.println("TC pass");
		
		resp.then().log().all();
		
		
	}

}
