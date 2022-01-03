package Lesson31;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Dynamic2Parameter {

	@Test
	//Every time change some value so that it should not throw erroe 404.   

	public void test1() {

		RestAssured.baseURI = "http://216.10.245.166";

		String response1 = given().log().all().header("Content-Type", "application/json").body(payload1.b2("hell333o9090","120034")).when()
				.post("/Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract().response()
				.asString();

		System.out.println("Response is  " + response1);

		JsonPath js11 = new JsonPath(response1);

		String placeId = js11.getString("ID");// getting it as string put the "path" in place_id
		System.out.println("place id is "  +placeId);

		String message = js11.getString("Msg");// getting it as string put the "path" in place_id
		System.out.println("message id is "  +message);

		
	}
}
