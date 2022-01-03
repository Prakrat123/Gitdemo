package GetData;

public class Method {

	
	public void jam(int i) {
		
		System.out.println(i);
	}
public void jam(int i,String j) {
		
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Method md = new Method();
		
		md.jam(333);
		md.jam(44, "dede");
	}

}
