package DifferentWaysToPostRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateRequestByUsingJSONFileTest {
	@Test
	public void CreateRequestTest()
	{
		File jobj=new File("./src/test/resources/jsonFileCreateRequest.json");
		
		given().body(jobj)
		.contentType(ContentType.JSON)
		.when().post("http://rmgtestingserver:8084/addProject")
		.then().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
		
	}

}
