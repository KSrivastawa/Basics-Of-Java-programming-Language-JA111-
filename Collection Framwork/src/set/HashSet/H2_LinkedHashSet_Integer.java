package set.HashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class H2_LinkedHashSet_Integer {

	public static void main(String[] args) {
		
		
		Set<Integer> hs = new LinkedHashSet<>();
		// cannot accept similar values inside the array.
		
		hs.add(9);
		hs.add(9);  // this elements is repeating again -> cannot be accepted
		hs.add(45);
		hs.add(66);
		hs.add(30);
		hs.add(79);
		
		System.out.println(hs);  // [9, 45, 66, 30, 79]  -> only one time 9 is available inside array

		hs.remove(66);
		System.out.println(hs);  // [9, 45, 30, 79]
		
		System.out.println(hs.isEmpty());  // false
		
		System.out.println(hs.contains(79));  // true
		
		System.out.println(hs.size());  // 4
		
		hs.clear();  // clear all elements
		
		System.out.println(hs); // []
		
	}

}
