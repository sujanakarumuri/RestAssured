package Assignments;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class RepublicOfIndia {

	@Test
	public void republic()
	{
		when()
		.get("http://restcountries.eu/rest/v1/name/INDIA")
		
		.then()
		.assertThat().statusCode(404)
		.assertThat().contentType(ContentType.HTML)
		.log().all();
		

	}

}
