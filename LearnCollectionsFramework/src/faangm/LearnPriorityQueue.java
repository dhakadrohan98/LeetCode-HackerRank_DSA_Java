package faangm;
import java.util.*;

public class LearnPriorityQueue {

	public static void main(String[] args) {
	//  Interface = class implementing.	
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		// Comparator.reverseOrder()-> A comparator that imposes the reverse of the natural ordering on Comparable objects.
		pq.offer(24);
		pq.offer(36);
		pq.offer(12);
		pq.offer(48);
		// Under the hood=> min_heap is getting implemented
		// In Heap ds, smallest element is present at the top.
		System.out.println(pq);
		
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
				
	}

}
