package RestAssuredWithBookerApp;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClassForParsing.PojoForBookerApp;

public class CreateUsingPOJO {
	@Test
	public void CreateProjectUsingPOJO()
	{
		
		JSONObject jobj=new JSONObject();
		jobj.put("checkin", "2018-01-01");
		jobj.put("checkout", "2019-01-02");
		PojoForBookerApp pj=new PojoForBookerApp("sujana123","karumuri123", 2000,true,jobj,"BF&Coffee");
		given().body(pj).contentType(ContentType.JSON)
		.when().post("https://restful-booker.herokuapp.com/booking")
		.then().statusCode(200).log().all();
		
	}

}
