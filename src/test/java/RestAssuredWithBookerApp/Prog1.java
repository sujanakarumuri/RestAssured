package RestAssuredWithBookerApp;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import CRUDWithBDD.JavaLibrary_RandomNumber;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Prog1 {
	@Test
	public void program1()
	{JavaLibrary_RandomNumber jran=new JavaLibrary_RandomNumber();
		JSONObject jobj=new JSONObject();
		jobj.put("username", "admin"+jran.getRandomNumber());
		jobj.put("password", "password123"+jran.getRandomNumber());
		
		//step1: precondition
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//step2: action
		.when()
		.post("https://restful-booker.herokuapp.com/addProject")
		
		//step3: Validation
		.then()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
		
		
	}

}
