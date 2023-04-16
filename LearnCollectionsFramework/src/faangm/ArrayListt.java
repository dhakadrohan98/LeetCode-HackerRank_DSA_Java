package faangm;
import java.util.*;

public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		// DefaultCapacity = 10;
		// size = n
		// Make a new array-> Resize (for increasing) = n + n/2 + 1;  and copy all previous elements into this new array.
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1,50);
		System.out.println(list);
		
//		list.remove(2);
//		System.out.println(list);
		
		list.remove(Integer.valueOf(1));
		System.out.println(list);
//		
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(100);
		newList.add(200);
//		
		list.addAll(newList);
		System.out.println(list);
		// For removing any element in list, TC:O(n). All elements present right side to a removed element gets sifted left side by 1 place.
//		list.clear();
//		System.out.println(list);
		
		// list.contains()-> TC:O(n)
//		System.out.println(list.contains(101));
		
		//foreach loop
//		for(Integer i:list) {
//			System.out.println(i);
//		}
		
		// Iterating over ArrayList collection
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator: "+it.next());
		}
		
	}
}
