package list.Stack;

import java.util.Stack;

public class S2_Pop_Peek {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<>();
		
		st.push(null);
		st.push("Ram");
		st.push("Shyam");
		st.push("Mohon");
		st.push("Sohan");
		System.out.println(st);  // [null, Ram, Shyam, Mohon, Sohan]
		/*
		 * in stack form--
		 Sohan  --- at peek
		 Mohan 
		 Shyam 
		 Ram  
		 null 
		 */
		
		System.out.println(st.pop()); // Sohan
		
		System.out.println(st);  // [null, Ram, Shyam, Mohon]
		
		System.out.println(st.peek());  // Mohon (element pushed last should be at peek)
		
		System.out.println(st.empty()); // false
		
		st.clear();  // clear all elements
		
		System.out.println(st.empty()); // true

	}

}
