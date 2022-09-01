package list.Stack;

import java.util.Stack;

public class S1_Push {

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
		 null  --- at bottom
		 */
	}
}
