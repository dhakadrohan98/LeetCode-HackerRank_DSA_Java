package faangm;
import java.util.*;

public class LearnArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(12);
		adq.offer(24);
		System.out.println(adq);
		adq.offerFirst(89);
		// offerFirst() -> Inserts the specified element at the front of this deque.
		adq.offerFirst(76);
		System.out.println(adq);
		
		adq.offerLast(34);
		// offerLast() -> Inserts the specified element at the end of this deque.
		adq.offer(35);
		System.out.println(adq);
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println("************");
		
		System.out.println(adq);
		System.out.println(adq.poll());
		System.out.println(adq);
		System.out.println(adq.pollLast());
		System.out.println(adq);
		System.out.println(adq.pollFirst());
		System.out.println(adq);

	}

}
