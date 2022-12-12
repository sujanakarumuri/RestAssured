package crudOperationWithBDDApproach;

    import org.json.simple.JSONObject;
	import org.testng.annotations.Test;
	import CRUDWithBDD.JavaLibrary_RandomNumber;
	import io.restassured.http.ContentType;
	import static io.restassured.RestAssured.*;

	public class CreateProject5Test {
		
		@Test
		public void CreateProjectTest()
		{
			//JavaLibrary_RandomNumber jran=new JavaLibrary_RandomNumber();
			JSONObject jobj=new JSONObject();
			jobj.put("createdBy","Sujana5");
			jobj.put("projectName","rmgtesting5" );
			jobj.put("status","ongoing" );
			jobj.put("teamsize",9 );
			
			given()
			.body(jobj)
			.contentType(ContentType.JSON)
			
			.when()
			.post("http://rmgtestingserver:8084/addProject")
			
			.then()
			.statusCode(500)
			.contentType(ContentType.JSON)
			.log().all();
			
		}

}
