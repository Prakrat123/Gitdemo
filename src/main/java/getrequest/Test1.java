package getrequest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import Second1.pay1;

public class Test1 {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", " qaclick123")
				.header("Content-Type", "application/json").body(pay1.Addplace()).when().post("maps/api/place/add/json")
				.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
				.header("server", "Apache/2.4.18 (Ubuntu)").extract().asString();

		System.out.println(response);

		JsonPath js = new JsonPath(response);
		String Placeid = js.getString("place_id");

		//System.err.println("place id is " + placeid);
		
		System.out.println("place id is " + Placeid);

		// update place

		String newAddress = "Summer India123 "; 

		given().log().all().queryParam("key", " qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + Placeid + "\",\r\n" + "\"address\":\"" + newAddress + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "")
				.when().put("/maps/api/place/update/json").then().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));

		// Get place

		String getPlaceresponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", Placeid)
				.when().get("/maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract()
				.response().asString();

		JsonPath js1 = new JsonPath(getPlaceresponse);
		String actualaddress = js.getString("address");

		System.out.println(actualaddress);
	}

}
