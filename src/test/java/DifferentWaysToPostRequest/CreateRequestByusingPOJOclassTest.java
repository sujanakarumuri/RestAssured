package DifferentWaysToPostRequest;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.testng.annotations.Test;

import CRUDWithBDD.JavaLibrary_RandomNumber;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClassForParsing.POJOclassForCreateRequest;

public class CreateRequestByusingPOJOclassTest {

	@Test
	public void createRequestTest() 
	{
		JavaLibrary_RandomNumber jran=new JavaLibrary_RandomNumber();
		POJOclassForCreateRequest pcr=new POJOclassForCreateRequest("Sujana11","rmg_testing"+jran.getRandomNumber(),"new",25);
		
		
		//step1:
		given().body(pcr).contentType(ContentType.JSON)
		.when().post("http://rmgtestingserver:8084/addProject")
		.then().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}
}
