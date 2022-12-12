package RestAssuredWithBookerApp;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetProject {
	@Test
	public void getProject()
	{
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("https://restful-booker.herokuapp.com/booking/312")
		.then()
		.assertThat().statusCode(200).log().all();
		
	}

}
