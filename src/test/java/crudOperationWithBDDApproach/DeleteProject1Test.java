package crudOperationWithBDDApproach;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteProject1Test {
	@Test
	public void deleteProjectTest()
	{
		//step1:precondition====>given
		//step2:action===>when
	       when()
	       .delete("http://rmgtestingserver:8084/projects/TY_PROJ_4998")
	       //.delete("http://rmgtestingserver:8084/projects/TY_PROJ_4999")
	       
	       
	       //step3:validation===>then
	       .then()
	       .assertThat().statusCode(204)
	       .log().all();
	}

}
