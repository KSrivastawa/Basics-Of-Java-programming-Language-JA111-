package list.ArrayList;

import java.util.ArrayList;

public class A2_StringAdd {

	public static void main(String[] args) {


		ArrayList<String> str = new ArrayList<>();
		
		System.out.println(str);  // []
		
		str.add(null);
		str.add("Hello");
		str.add("Ketan!");
		str.add("How");
		str.add("are");
		str.add("you.");
		
		System.out.println(str);   // [null, Hello, Ketan!, How, are, you.]
		
		String hold = "";
		for(String s: str) {
			
			hold+=s+" ";
			
		}
		System.out.println(hold); // null Hello Ketan! How are you. 

	}

}



























