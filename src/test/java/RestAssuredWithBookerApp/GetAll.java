package RestAssuredWithBookerApp;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAll {
	@Test
	public void getAllProjects()
	{
		when().get("https://restful-booker.herokuapp.com/booking")
		.then().assertThat().statusCode(200).log().all();
	}

}
