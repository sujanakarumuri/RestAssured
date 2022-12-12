package PathParameter;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertThat;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PathParameterByUsingPUTTest {
	
	@Test
	public void pathParameterTest()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Ram");
		jobj.put("projectName", "fin_App");
		jobj.put("status", "Completed");
		jobj.put("teamsize", 11);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given()
		.pathParam("pid","TY_PROJ_5556")
		.body(jobj)
		.contentType(ContentType.JSON)

		.when()
		.put("/projects/{pid}")
		
		.then()
		.assertThat().statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
		
		
	}
	

}
