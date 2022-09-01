package list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A5_LoopsAndIterator {

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
		
		// for loop ==============
		for(int i=0; i<list.size(); i++) {
			System.out.println("for loop element "+list.get(i));
		}
		/*
		 	for loop element 0
			for loop element null
			for loop element 5
			for loop element 56
			for loop element 33
			for loop element 18
			for loop element 68
			for loop element 15
			for loop element 93
		 */
		
		// for each/enhanced ========
		for(Integer i: list) {
			System.out.println("for each loop element "+i);
		}
		/*
		 	for each loop element 0
			for each loop element null
			for each loop element 5
			for each loop element 56
			for each loop element 33
			for each loop element 18
			for each loop element 68
			for each loop element 15
			for each loop element 93
		 */
		
		
		// Iteration
		Iterator<Integer> ite = list.iterator();
		
		
		
		while(true) {
			if(ite.hasNext()) {
				System.out.println("Iterator Elements "+ ite.next());
			}
		}
		/*
		 	Iterator Elements 0
			Iterator Elements null
			Iterator Elements 5
			Iterator Elements 56
			Iterator Elements 33
			Iterator Elements 18
			Iterator Elements 68
			Iterator Elements 15
			Iterator Elements 93
	 */
		
		
		// ===or=also=== any one can prefer at a time or you can take new variable for each to run both
		/*
		while(ite.hasNext()) {
			System.out.println("Iterator "+ ite.next());
		}
		*/
		/*
		 	Iterator 0
			Iterator null
			Iterator 5
			Iterator 56
			Iterator 33
			Iterator 18
			Iterator 68
			Iterator 15
			Iterator 93
		 */
		
	}

}

