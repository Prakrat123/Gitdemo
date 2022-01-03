package Lesson31;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.DynamicParameter;

public class DynamicPara {

	// Every time change some value so that it should not throw erroe 404.
	// Use of data provider 
	
	
	
	@Test(dataProvider = "Bookdata")
	public void test1(String isbn, String aisle)

	{

		RestAssured.baseURI = "http://216.10.245.166";

		String response1 = given().log().all().header("Content-Type", "application/json").body(payload1.b2(isbn, aisle))
				.when().post("/Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract()
				.response().asString();

		System.out.println("Response is  " + response1);

		JsonPath js11 = new JsonPath(response1);

		String placeId = js11.getString("ID");// getting it as string put the "path" in place_id
		System.out.println("place id is " + placeId);

		String message = js11.getString("Msg");// getting it as string put the "path" in place_id
		System.out.println("message id is " + message);
	}
// steps 1  create data provider with array 
	@DataProvider(name = "Bookdata")
	public Object[][] getdata1() {

		return new Object[][] { { "hello1", "1233" }, { "hello2", "2222" }, { "hello3", "3333" } };
	}
}
