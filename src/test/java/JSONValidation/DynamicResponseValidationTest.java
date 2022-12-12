package JSONValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.util.List;
public class DynamicResponseValidationTest {
	
	@Test
	public void DynamicResponse()
	{
		//prerequisites
		baseURI="http://rmgtestingserver";
		port=8084;
		String actdata="TY_PROJ_1013";
		
		Response resp = when().get("/projects");
		
		boolean flag=false;
		List<String> pid = resp.jsonPath().get("projectId");
		for (String proj : pid) {
			if(proj.equalsIgnoreCase(actdata))
			{
				flag=true;
			}
			Assert.assertTrue(flag);
				
			
			resp.then().assertThat().log().all();
			System.out.println("Test case is passed");
		}
		
		
		
		
		
	}

}
