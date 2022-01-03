package GetData;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
                                         // Best example Api all methods 

public class BaisAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                       // Add place ---->  Post 

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(payload.Addplace1()).when().post("maps/api/place/add/json").then().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)").extract().response()//to verify after assert . For equals to add hamcrets package
				.asString();

		System.out.println(response);
		JsonPath js = new JsonPath(response);// object of Json
		String placeId = js.getString("place_id");// getting it as string  put the "path" in place_id
		System.out.println("palce stored is " + placeId);// printing it

		// update placeid    ---->  Put 

		String newaddress = "Japan in India";

		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeId + "\",\r\n" + "\"address\":\"" + newaddress + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}")
				.when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));

		// Given method----> to get the data 
		
		
		String getPlaceresponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
				.header("Content-Type", "application/json").when().get("maps/api/place/get/json").then().log().all()
				.assertThat().statusCode(200).extract().response().asString();

		JsonPath js2 = new JsonPath(getPlaceresponse);
		String actualaddress = js2.get("address");
		System.out.println("Actual address is " + actualaddress);
		
		Assert.assertEquals(actualaddress, newaddress);

	}

}
