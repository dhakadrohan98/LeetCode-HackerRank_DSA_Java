package faangm;
import java.util.*;

public class LearnTreeSet {

	public static void main(String[] args) {
		// Method's TC: O(log n);
		Set<Integer> set = new TreeSet<>();
		//Behind the scene doing in sorted form.
		// Implementing Binary Search Tree(BST).
		
		set.add(32); //unique hash generated internally-> adhdhsji89238
		set.add(23);
		set.add(79);
		set.add(97);
		set.add(63);
		
		System.out.println(set.add(23));
		
		System.out.println(set);
		System.out.println(set.getClass());
//		
//		
		System.out.println(set.remove(63));	
//		// set.remove() => Removes the specified element from this set if it is present (optional operation). 
//		//More formally, removes an element e such that Objects.equals(o, e), if this set contains such an element. 
//		//Returns true if this set contained the element
		System.out.println(set);
		System.out.println(set.contains(343));
//		set.clear();
//		System.out.println(set);
		System.out.println(set.isEmpty());
		

	}

}
