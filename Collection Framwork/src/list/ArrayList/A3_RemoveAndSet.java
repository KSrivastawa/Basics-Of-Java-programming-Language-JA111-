package list.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class A3_RemoveAndSet {

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
		
		list.remove(5);
		System.out.println(list);  // [0, null, 5, 56, 33, 68, 15, 93]
		
		list.remove(Integer.valueOf(68));
		System.out.println(list); // [0, null, 5, 56, 33, 15, 93]
		
		list.set(4, 99);
		System.out.println(list);  // [0, null, 5, 56, 99, 15, 93] replaced those index value with new value
		
		list.removeAll(list); // "data clean" all data removed
		
		
		
	}

}

