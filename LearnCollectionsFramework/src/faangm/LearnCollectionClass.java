package faangm;
import java.util.*;

public class LearnCollectionClass {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Anuj",2));
		list.add(new Student("Rohan",4));
		list.add(new Student("Shivam",3));
		list.add(new Student("Ritesh",1));
		
		Student s1 = new Student("Rohan",2);
		Student s2 = new Student("Aku",3);
		System.out.println("Before sorting: "+list);
		
		//Passing anonymous object as: new Comparator<Student>() {-----}
		Collections.sort(list,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
			
		});
	
		System.out.println("After sorting: "+list);
		System.out.println("s1 comparison with s2: "+s1.compareTo(s2));
		
		
		
//		list.add(34);
//		list.add(12);
//		list.add(9);
//		list.add(76);
//		list.add(9);
//		list.add(29);
//		list.add(9);
//		list.add(75);
//		
//		System.out.println("min element: "+Collections.min(list));
//		System.out.println("Ascending order(by default): ");
//		Collections.sort(list);
//		System.out.println(list);
//		
//		Collections.sort(list,Comparator.reverseOrder());
//		System.out.println("Descending order using Comparator.reverseOrder() method-> ");
//		System.out.println(list);
//		
//		System.out.println(Collections.frequency(list, 9));

	}

}
