package queue.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class P2_PriorityReverse {

	public static void main(String[] args) {

		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
			
			pq.offer(533);
			pq.offer(23);
			pq.offer(32);
			pq.offer(357);
			pq.offer(789);
			
			// always gives 1st priority among greater than all values.
			System.out.println(pq); // [789, 533, 32, 23, 357]
			
			
			pq.poll(); // deleted 1st priority element
			// again it gives 1st position among greater than all values.
			System.out.println(pq); // [533, 357, 32, 23]
			
			
			System.out.println(pq.peek()); // 533

	}

}
