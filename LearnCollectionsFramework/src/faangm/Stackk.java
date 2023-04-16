package faangm;
import java.util.*;

public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Bear");
		animals.push("Fox");
		animals.push("Horse");
		System.out.println(animals);
//		System.out.println(animals.peek());
		animals.peek();
		animals.pop();
		System.out.println(animals.pop());
		
//		for(String temp:animals) {
//			System.out.println(temp); 
//		}
	}

}
