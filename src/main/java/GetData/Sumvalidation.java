package GetData;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Sumvalidation {

	@Test
	public void sumofcourses() {
		int sum = 0;

		JsonPath js4 = new JsonPath(payload.courseprice());

		int count = js4.getInt("courses.size()");
		System.out.println("test" + count);
		for (int i = 0; i < count; i++) {

			int price = js4.getInt("courses[" + i + "].price");////------>
			System.out.println("prise is "+price);
			
			int copies = js4.getInt("courses[" + i + "].copies");////------>
			System.out.println("course is " +copies);
			int amount = price * copies;                        ////------>
			System.out.println("amount is "+amount);
			System.out.println(amount);
			sum = sum + amount;   
			System.out.println("Total sum is " + sum);
			////------>
		}

		System.out.println(sum);
		
		int  pamount = js4.get("dashboard.purchaseAmount");
		Assert.assertEquals(sum , pamount);
	}

}
