package faangm;
import java.util.*;

public class LearnHashSetStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> studentSet = new HashSet<>();
		
		studentSet.add(new Student("Rohan",1));
		studentSet.add(new Student("Ritesh",2));
		studentSet.add(new Student("Akshu",3));
		studentSet.add(new Student("Shivam",4));
		studentSet.add(new Student("Bhuvan",4));
		//add()-> adds the specified element e to this set if the set contains no element e2 such that Objects.equals(e, e2). 
		//If this set already contains the element, the call leaves the set unchanged and returns false.
		
		System.out.println(studentSet);
		
		Student s1 = new Student("Rohan",1);
		Student s2 = new Student("Rohan",2);
		System.out.println(s1.equals(s2));
		
		
		
		

	}

}
