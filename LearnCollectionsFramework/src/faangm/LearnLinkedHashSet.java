package faangm;
import java.util.*;

public class LearnLinkedHashSet {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		// Implement the property of Set & LinkedList simultaneously.
		//preserve insertion order unlike HashSet (which don't preserve insertion order)
		
		set.add(32); //unique hash generated internally-> adhdhsji89238
		set.add(23);
		set.add(79);
		set.add(97);
		set.add(63);
		
		System.out.println(set.add(23));
		System.out.println(set.add(23));
		System.out.println(set.add(23));
		System.out.println(set.add(23));
		
		System.out.println(set);
		System.out.println(set.getClass());
//		
//		
		System.out.println(set.remove(23));	
//		// set.remove() => Removes the specified element from this set if it is present (optional operation). 
//		//More formally, removes an element e such that Objects.equals(o, e), if this set contains such an element. 
//		//Returns true if this set contained the element
		System.out.println(set);
//		System.out.println(set.contains(343));
//		set.clear();
//		System.out.println(set);
//		System.out.println(set.isEmpty());

	}

}
