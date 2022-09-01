package set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class H1_HashSet_Integer {

	public static void main(String[] args) {
		
		
		Set<Integer> hs = new HashSet<>();
		// === this is object which should not arranged values in sequences manner  
		// cannot accept similar values inside the array.
		
		hs.add(9);
		hs.add(9);  // this elements is repeating again -> cannot be accepted
		hs.add(45);
		hs.add(66);
		hs.add(30);
		hs.add(79);
		
		// elements will allocate randomly
		System.out.println(hs);  // [66, 9, 45, 30, 79]  -> only one time 9 is available inside array

		hs.remove(66);
		System.out.println(hs);  // [9, 45, 30, 79]
		
		System.out.println(hs.isEmpty());  // false
		
		System.out.println(hs.contains(79));  // true
		
		System.out.println(hs.size());  // 4
		
		hs.clear();  // clear all elements
		
		System.out.println(hs); // []
		
	}

}
