package faangm;
import java.util.*;

public class LearnLinkedListQueue {

	public static void main(String[] args) {
		//One class can implement  multiple interfaces.
		//LinkedList class is implementing Queue interface that's why LinkedList<>() can be written at right side (after = sign).
		Queue<Integer> queue = new LinkedList<>();
		//Offer(element)-> Insert element at rear of queue
		queue.offer(12);
		queue.offer(24);
		queue.offer(36);
		
		System.out.println(queue);
		//queue.poll()-> Remove the first element from queue & return removed element.
		int out = queue.poll();
		System.out.println(out);
		System.out.println(queue);
		
		//queue.peek()-> return Next element to be out from the queue but did not remove that element.
		System.out.println(queue.peek());

	}

}
