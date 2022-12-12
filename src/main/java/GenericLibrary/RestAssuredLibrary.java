package GenericLibrary;

import io.restassured.response.Response;

/*
 * Consists of methods of RestAssured
 * @author sujana
 */

public class RestAssuredLibrary {
	/*
	 * This method will return the json data from the corresponding response body
	 * @author sujana
	 */
	public String getJsonData(Response response, String path)
	{
		String jsonData = response.jsonPath().get(path);
		return jsonData;
		
	}
	
	

}
