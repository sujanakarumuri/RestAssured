package DifferentWaysToPostRequest;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import CRUDWithBDD.JavaLibrary_RandomNumber;
import io.restassured.http.ContentType;

public class CreateRequestByusingJSONObjectTest {
	
	@Test
	public void CreateRequestTest()
	{
		JavaLibrary_RandomNumber jran=new JavaLibrary_RandomNumber();
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","Sujana111");
		jobj.put("projectName", "RestAssured"+jran.getRandomNumber());
		jobj.put("status", "Completed");
		jobj.put("teamSize",20);
		
		//step1: precondition===given
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//step2:Action or execution===>when
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		
		//step3:validation===>then
		.then()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.statusLine("HTTP/1.1 201 ")
		.log().all();

		
	}

}
