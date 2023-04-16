package faangm;
import java.util.*;

public class LearnMap {

	public static void main(String[] args) {
	int [] nums = new int[] {90,1,2,3,4,56,7,90,2,1,3,4,97,5,6,7,89,97,1,2,3,4,5,6,7,1,8,9};
//	Map<Integer,Integer> map = new HashMap<>();
//	While using HashMap<> class, order is not preserved.
	
	Map<Integer,Integer> map = new TreeMap<>();
	//Under the hood, put the keys in BST(Binary search tree). Before moving further step ahead-> first sort the map.
//	While using TreeMap<> class, elements are inserted in ascending order.
	
	for(int i=0; i<nums.length; i++) {
		
		if(map.containsKey(nums[i])) {
			int val = map.get(nums[i]);
			map.put(nums[i], val+1);
		}
		else {
			map.put(nums[i],1);
		}
	}
	
	System.out.println(map);
	//map.containsKey() & containsValue() method.
	System.out.println(map.containsKey(91));
	System.out.println(map.containsValue(5));
	
	//Remove the keys
	map.remove(90);
	/*
	 * remove(key)-> Removes the mapping for a key from this map if it is present
	 * (optional operation). More formally, if this map contains a mapping from key
	 * k to value v such that Objects.equals(key, k), that mapping is removed.
	 */
	
	System.out.println(map);
	
	for(int i:map.keySet()) {
		System.out.println("Key: "+i+" val: "+map.get(i));
	}
	
	if(map.containsKey(97)) {
		map.put(97, map.get(97)+1);
		//Increasing the value mapped to a passed (as argument) key.
	}
	
	map.putIfAbsent(2, 12);
	/*
	 * putIfAbsent(key, value) -> If the specified key is not already associated
	 * with a value (or is mapped to null) associates it with the given value and
	 * returns null, else returns the current value.
	 */
	
	// if key already exists in map then put() method override previous value for that key.
	System.out.println(map);
	
	for(Map.Entry<Integer, Integer> e: map.entrySet()) {
		System.out.println(e);
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		System.out.println("**************");
	}
	// Iterating through keySet()
	System.out.println("keySet:");
	for(Integer temp:map.keySet()) {
		System.out.println(temp);
	}
	
	System.out.println("valueSet:");
	//Iterating through valueSet()
	for(Integer val:map.values()) {
		System.out.println(val);
	}
	System.out.println("isMapEmpty() if not then clear() it & check again isMapEmpty()");
	System.out.println(map.isEmpty());
	map.clear();
	System.out.println(map.isEmpty());
	System.out.println(map);
	
	
	
	}
}
