package queue.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class L1_Offer_Poll_Peek {

	public static void main(String[] args) {


		Queue<Integer> qLinked = new LinkedList<>();
		
		qLinked.offer(null);   // we can use .add also but this is first preferred
		qLinked.offer(23);
		qLinked.offer(86);
		qLinked.offer(253);
		qLinked.offer(43);
		qLinked.offer(255863);
		System.out.println(qLinked);  // [null, 23, 86, 253, 43, 255863]
		// entering point 1->2-> ------ exit point which is enter first ->n
		// first In first Out (FIFO)
		/*
		 255863
		 43
		 253
		 86
		 23
		 null  --- at peek
		 */
		
		System.out.println(qLinked.poll()); // null
		
		System.out.println(qLinked);  // [23, 86, 253, 43, 255863]
		
		System.out.println(qLinked.peek()); // 23  (first In will be the peek value)
		

	}

}
