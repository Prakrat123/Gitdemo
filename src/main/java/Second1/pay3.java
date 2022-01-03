package Second1;

import java.util.Scanner;

public class pay3 {
//
//	
//		public static void main(String[] args) {
//
//			String str5 = "hello wrold";
//			
//			for (int i= 0; i<str5.length(); i++) {
//				System.out.print(str5.charAt(i) + " + ");
//			}
//		}}

	
//
//	public static void main(String[] args) {
//
//		String str5 = "123455566";
//		
//		for (int i= 0; i<str5.length(); i++) {
//			System.out.print(str5.charAt(i) + " + ");
//		}
//	}}

	

	public static void main(String[] args) {

		String str= "This#string%contains^special*characters&.";   
		str = str.replaceAll("[^a-zA-Z0-9]", " ");  
		
		System.out.println(str);  
}}