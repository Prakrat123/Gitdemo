package getrequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Getdata {

	@Test
	public void testResponsecode() {

		// Response resp = RestAssured
		// .get("http://api.openweathermap.org/data/2.5/weather?q=Seoni&appid=22251568e280d13962054cffda90ee1c");

		// int code = resp.getStatusCode();

		int code = get("http://api.openweathermap.org/data/2.5/weather?q=Seoni&appid=22251568e280d13962054cffda90ee1c")
				.getStatusCode();

		System.out.println("statuscode is " + code);

		Assert.assertEquals(code, 200);
	}

	@Test
	public void testbody2() {

//		Response resp = RestAssured
//				.get("http://api.openweathermap.org/data/2.5/weather?q=Seoni&appid=22251568e280d13962054cffda90ee1c");

		// String data = resp.asString();
		String data = get(
				"http://api.openweathermap.org/data/2.5/weather?q=Seoni&appid=22251568e280d13962054cffda90ee1c")
						.asString();

		System.out.println("Data is " + data);

		long time = get("http://api.openweathermap.org/data/2.5/weather?q=Seoni&appid=22251568e280d13962054cffda90ee1c").getTime();
		
		System.out.println("Time is " + time);

	}

}
