package list.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class A4_Contains {

	public static void main(String[] args) {


	//	ArrayList<String> str = new ArrayList<>();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(0);
		list.add(null);
		list.add(5);
		list.add(56);
		list.add(33);
		list.add(18);
		list.add(68);
		list.add(15);
		list.add(93);
		System.out.println(list); // [0, null, 5, 56, 33, 18, 68, 15, 93]  
		
		
		System.out.println(list.contains(50));  // false
		
		System.out.println(list.contains(15));  //  true
		
		
		
	}

}
