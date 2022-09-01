package list.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class A1_IntegerAdd {

	public static void main(String[] args) {


	//	ArrayList<String> str = new ArrayList<>();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(0);
		list.add(null);
		list.add(5);
		list.add(56);
		list.add(33);
		System.out.println(list);  // [0, null, 5, 56, 33]
		
		list.add(9);
		System.out.println(list);  // [0, null, 5, 56, 33, 9]
		
		list.add(3, 18);
		System.out.println(list);   // [0, null, 5, 18, 56, 33, 9]
		
		
		List<Integer> newList = new ArrayList<>();
		
		newList.add(7);
		newList.add(22);
		newList.add(80);
		
		list.addAll(newList);
		System.out.println(list);  // [0, null, 5, 18, 56, 33, 9, 7, 22, 80]
		
		
		System.out.println(list.get(3));  // 18

	}

}
