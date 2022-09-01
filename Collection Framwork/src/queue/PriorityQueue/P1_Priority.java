package queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class P1_Priority {

	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(533);
		pq.offer(23);
		pq.offer(32);
		pq.offer(357);
		pq.offer(789);
		
		// always gives 1st priority to the smaller value.
		System.out.println(pq); // [23, 357, 32, 533, 789]
	
		
		pq.poll(); // deleted 1st priority element
		// again it gives 1st position to smaller value.
		System.out.println(pq); // [32, 357, 789, 533]
		
		
		System.out.println(pq.peek()); // 32
		
		
		
	}

}
