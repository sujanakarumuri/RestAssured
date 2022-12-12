package crudOperationWithBDDApproach;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjectTest {
	@Test
	public void deleteProjectTest()
	{
		//step1:precondition====>given
		//step2:action===>when
	       when()
	       .delete("http://rmgtestingserver:8084/projects/TY_PROJ_4290")
	       
	       //step3:validation===>then
	       .then()
	       .assertThat().statusCode(204)
	       .log().all();
	}

}
