package RestAssuredWithBookerApp;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingHashMap {
	@Test
	public void CreateUsingHashMap()
	{
		
		HashMap map1=new HashMap();
		map1.put("checkin", "2013-02-23");
		map1.put("checkout", "2014-10-23");
		
		HashMap map=new HashMap();
		map.put("firstname", "abc");
		map.put("lastname", "xyz");
		map.put("totalprice", 1500);
		map.put("depositpaid", 500);
		map.put("bookingdates", map1);
		map.put("additionalneeds", "snacks");
		
		given()
		.body(map)
		.contentType(ContentType.JSON)
		
		.when()
		.post("https://restful-booker.herokuapp.com/booking")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

}
