package crudOperationWithBDDApproach;

	import org.json.simple.JSONObject;
	import org.testng.annotations.Test;
	import CRUDWithBDD.JavaLibrary_RandomNumber;
	import io.restassured.http.ContentType;
	import static io.restassured.RestAssured.*;

	public class CreateProject4Test {
		
		@Test
		public void CreateProjectTest()
		{
			//JavaLibrary_RandomNumber jran=new JavaLibrary_RandomNumber();
			JSONObject jobj=new JSONObject();
			jobj.put("Sujana2","createdBy");
			jobj.put( "rmgtesting23","projectName");
			jobj.put("completed","status");
			jobj.put(11,"teamsize");
			
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
