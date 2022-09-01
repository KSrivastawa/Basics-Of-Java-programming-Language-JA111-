package list.LinkedList;

import java.util.LinkedList;

public class L1_String {

	public static void main(String[] args) {

		
		LinkedList<String> str = new LinkedList<>();
		
		str.add(null);
		str.add("Ketan");
		str.add("");
		str.add("Ketan");
		str.add("Prashant");
		
		System.out.println(str); // [null, Ketan, , Ketan, Prashant]
		System.out.println(str.size()); // 5
		
		

	}

}
