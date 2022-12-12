package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLibrary.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClassForParsing.POJOclassForCreateRequest;

public class Dataprovider1 {
	
	@Test(dataProvider="project")
	public void projectDataprovider(String createdBy,String projectName,String status, int teamsize)
	{
		JavaUtility jutil=new JavaUtility();
		POJOclassForCreateRequest pj=new POJOclassForCreateRequest(createdBy,projectName+jutil.getRandomNumber(),status, teamsize);
		
		given()
		.body(pj)
		.contentType(ContentType.JSON)
		
		.when().post("http://rmgtestingserver:8084/addProject")
		.then().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
	}

	@DataProvider(name="project")
	  public Object[][] data()
		{
			Object[][] data=new Object[4][4];
			
			data[0][0]="abc";
			data[0][1]="rmg1_server";
			data[0][2]="ongoing";
			data[0][3]=20;
			
			data[1][0]="mno";
			data[1][1]="rmg2_server";
			data[1][2]="started";
			data[1][3]=15;
			
			data[2][0]="pqr";
			data[2][1]="rmg3_sever";
			data[2][2]="new";
			data[2][3]=14;
			
			data[3][0]="xyz";
			data[3][1]="rmg4_server";
			data[3][2]="completed";
			data[3][3]=18;
			
			return data;
		}
	
}
