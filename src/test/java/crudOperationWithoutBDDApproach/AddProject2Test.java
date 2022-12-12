package crudOperationWithoutBDDApproach;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProject2Test {
	
	@Test
	public void addProject2()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "GuruCharan");
		jobj.put("projectName", "Students_Edu_Applicat");
		jobj.put("status", "created");
		jobj.put("team", 25);
		
		//precondition
		RequestSpecification reqspec = RestAssured.given();
		reqspec.body(jobj);
		reqspec.contentType(ContentType.JSON);
		
		//Action
		Response response = reqspec.post("http://rmgtestingserver:8084/addProject");
		System.out.println("contenttype="+response.getContentType());
		
		System.out.println("prettystring="+response.asPrettyString());
		
		System.out.println("gettime="+response.getTime());
		System.out.println("status code="+response.getStatusCode());
		System.out.println("session id="+response.getSessionId());
		System.out.println("status line="+response.getStatusLine());
		System.out.println("time in micro seconds="+response.getTimeIn(TimeUnit.MICROSECONDS));
		
		
		//validate
		ValidatableResponse validate = response.then();
		validate.assertThat().contentType(ContentType.JSON);
		validate.assertThat().statusCode(201);
		validate.assertThat().statusLine("HTTP/1.1 201 ");
		validate.log().all();
	}

}
