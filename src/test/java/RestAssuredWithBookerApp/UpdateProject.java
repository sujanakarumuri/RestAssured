package RestAssuredWithBookerApp;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProject {
	@Test
	public void updateProject()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("checkin", "2013-02-23");
		jobj.put("checkout", "2014-10-23");
		
		JSONObject job=new JSONObject();
		job.put("firstname", "sujana");
		job.put("lastname", "k");
		job.put("totalprice", 2500);
		job.put("depositpaid", 1000);
		job.put("bookingdates", jobj);
		job.put("additionalneeds", "BreakFast");
		
		given()
		.body(job).contentType(ContentType.JSON)
		.when().post("https://restful-booker.herokuapp.com/booking/312")
		.then().assertThat().statusCode(200).log().all();
		
	
	}

}
