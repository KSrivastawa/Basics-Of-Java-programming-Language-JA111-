package queue.ArrayDeque;

import java.util.ArrayDeque;

public class A1_ArrayDeque_poll_peek {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.offer(45);
		ad.offer(33);
		ad.offerFirst(147);
		ad.offerLast(357);
		System.out.println(ad);  // [147, 45, 33, 357]
		
		ad.offer(99);
		ad.offer(18);
		System.out.println(ad); // [147, 45, 33, 357, 99, 18]
		
		System.out.println(ad.peek());  // 147
		
		System.out.println(ad.poll()); // 147
		
		System.out.println(ad.pollFirst());  // 45
		System.out.println(ad.pollLast());  // 18
		
		System.out.println(ad.peekFirst());  // 33
		System.out.println(ad.peekLast());   // 99
		

	}

}
