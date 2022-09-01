package set.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class H3_TreeSet_Integer {

	public static void main(String[] args) {
		
		
		Set<Integer> ts = new TreeSet<>();
		// cannot accept similar values inside the array.
		// this will arrange in sorted form of elements. (smaller to larger)
		
		ts.add(9);
		ts.add(9);  // this elements is repeating again -> cannot be accepted
		ts.add(45);
		ts.add(66);
		ts.add(30);
		ts.add(79);
		
		System.out.println(ts);  // [9, 30, 45, 66, 79]  -> only one time 9 is available inside array

		ts.remove(66);
		System.out.println(ts);  // [9, 30, 45, 79]
		
		System.out.println(ts.isEmpty());  // false
		
		System.out.println(ts.contains(79));  // true
		
		System.out.println(ts.size());  // 4
		
		ts.clear();  // clear all elements
		
		System.out.println(ts); // []
		
	}

}

