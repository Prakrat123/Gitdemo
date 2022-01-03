package Second1;

public class Sam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Reverse a string
		String str = "Hello";
		char[] cha = str.toCharArray();

		for (int i = cha.length - 1; i >= 0; i--) {
			System.out.print(cha[i]);
		}
		
		// Second approch 
		System.out.print("--------------------------------");
		for (int i = str.length()-1; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}

		
		StringBuilder strb = new StringBuilder(str);
		System.out.println(strb.reverse());
	
		
		StringBuilder strbuilder = new StringBuilder(str);
		System.out.println(strbuilder.reverse());
	}

}
