package JSONValidation;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import CRUDWithBDD.JavaLibrary_RandomNumber;
import GenericLibrary.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class RequestChainingTest {
	String pid;
	@Test
	public void RequestChaining()
	{
		JavaUtility jran=new JavaUtility();
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","Sujana1");
		jobj.put("projectName", "RestAssured"+jran.getRandomNumber());
		jobj.put("status", "Completed");
		jobj.put("teamSize",20);
		
		//step1: precondition===>given
		RequestSpecification r = given()
		.body(jobj)
		.contentType(ContentType.JSON);
		
		//step2:Action or execution===>when
		Response res = r.when()
		.post("http://rmgtestingserver:8084/addProject");
		
		//step3:validation===>then
		res.then()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.statusLine("HTTP/1.1 201 ")
		.log().all();
		pid = res.jsonPath().get("projectId");
		System.out.println("project id="+pid);
		given()
		.pathParam("p",pid)
		.when().get("http://rmgtestingserver:8084/projects/{p}")
		.then().assertThat().statusCode(200)
		.log().all();
	}

}
