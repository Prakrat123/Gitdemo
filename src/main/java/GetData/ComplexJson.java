package GetData;

import io.restassured.path.json.JsonPath;

public class ComplexJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 Json are rapped in One Array

		JsonPath js3 = new JsonPath(payload.courseprice());

		int count = js3.getInt("courses.size()");// Since it is in Array form so we can use .size
		System.out.println("Number of course  " + count);

		int pamount = js3.getInt("dashboard.purchaseAmount");// we need to write in the form of path .....
		System.out.println("Total Amount " + pamount);

		String titleoffirstcourse = js3.getString("courses[2].title");// we need to write in the form Index.....

		System.out.println("Ttile of first course  " + titleoffirstcourse);
		// Print number of all course title and their respective prices

		for (int i = 0; i < count; i++) {
			String s1 = js3.get("courses[" + i + "].title");
			System.out.println(s1);

			// int s2 = js3.getInt("courses[" + i + "].price");

			// System.out.println(s2);
			// othwer way
			System.out.println(js3.getInt("courses[" + i + "].price"));
			// System.out.println(js3.getInt("courses[" + i + "].copies"));
		}
		System.out.println("Print the number copies of RPA");
		
		for (int i = 0; i < count; i++) {
			
			String coursetitle = js3.get("courses[" + i + "].title");
			
			if (coursetitle.equalsIgnoreCase("RPA")) {
				int copies= js3.getByte("courses[" + i + "].price");
				System.out.println(copies);
				
		}
	}

}}
