package Lesson31;

public class payload1 {

	
	public static String b1() {
		
		return  "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\"bcd\",\r\n"
				+ "\"aisle\":\"2209999907\",\r\n"
				+ "\"author\":\"John wwwfoe\"\r\n"
				+ "}\r\n"
				+ " \r\n"
				+ " ";
	}
	
	
	public static String b2(String isbn  , String aisle) {
		String w = "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John wwwfoe\"\r\n"
				+ "}\r\n"
				+ " \r\n"
				+ " ";
		return w;
		
	}
}
