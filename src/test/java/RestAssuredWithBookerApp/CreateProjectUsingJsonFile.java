package RestAssuredWithBookerApp;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJsonFile {
	@Test
	public void CreateusingJsonFile()
	{
		File f=new File("C:\\Users\\sujana\\OneDrive\\Desktop\\API\\Postman\\Booker.json");
        given().body(f).contentType(ContentType.JSON)
        .when().post("https://restful-booker.herokuapp.com/booking")
        .then().assertThat().statusCode(200).log().all();
	}

}
