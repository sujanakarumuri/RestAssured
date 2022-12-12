package QueryParameter;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class QueryParameterUsingGet {
	
	@Test
	public void queryParameter()
	{
		baseURI="https://reqres.in";
		
		
		given()
		.queryParam("QID", "page=2")
		
		.when()
		.get("/api/users?QID")
		
		.then()
		.contentType(ContentType.JSON)
		.log().all();
		
		
	}

}
