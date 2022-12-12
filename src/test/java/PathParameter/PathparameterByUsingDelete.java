package PathParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathparameterByUsingDelete {
	@Test
	public void pathparameter()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given()
		.pathParam("pid","TY_PROJ_5562")
		
		.when()
		.delete("/projects/{pid}")
		
		.then()
		.assertThat().statusCode(204)
		.log().all();
	}

}
