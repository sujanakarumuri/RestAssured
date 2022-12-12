package crudOperationWithBDDApproach;



	import org.json.simple.JSONObject;
	import org.testng.annotations.Test;
	import CRUDWithBDD.JavaLibrary_RandomNumber;
	import io.restassured.http.ContentType;
	import static io.restassured.RestAssured.*;

	public class CreateProject3Test {
		
		@Test
		public void CreateProjectTest()
		{
			//JavaLibrary_RandomNumber jran=new JavaLibrary_RandomNumber();
			JSONObject jobj=new JSONObject();
			jobj.put("createdBy",123);
			jobj.put("projectName",345 );
			jobj.put("status",456 );
			jobj.put("teamsize",9 );
			
			given()
			.body(jobj)
			.contentType(ContentType.JSON)
			
			.when()
			.post("http://rmgtestingserver:8084/addProject")
			
			.then()
			.statusCode(201)
			.contentType(ContentType.JSON)
			.log().all();
			
		}

	


}
