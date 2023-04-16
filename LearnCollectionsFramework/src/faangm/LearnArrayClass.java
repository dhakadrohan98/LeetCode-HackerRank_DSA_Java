package faangm;
import java.util.*;

public class LearnArrayClass {

	public static void main(String[] args) {
		int[] nums = {1,2,3,10,4,5,11,12,13,14,15};
		
		/*
		 * Arrays.binarySearch(arrayName, searchElement) -> Searches the specified array
		 * of ints for the specified value using the binary search algorithm. The array
		 * must be sorted (as by the sort(int []) method) prior to making this call. If
		 * it is not sorted, the results are undefined. If the array contains multiple
		 * elements with the specified value, there is no guarantee which one will be
		 * found.
		 */
		Arrays.sort(nums);
		// Apply Quick sort internally.
		/*
		 * Parallel sort distribute arrays on different processor for sorting (if we
		 * have more than one processor) it works for more than 8192 elements otherwise run Quick sort.
		 */
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
		System.out.println();
		System.out.println(nums.length);
		int index = Arrays.binarySearch(nums, 78);
		System.out.println("Index: "+index);
		// TC: O(log n)
		/*
		 * Arrays.binarySearch(nums, 78) => index of the search key, if it is contained
		 * in the array; otherwise, (-(insertion point) - 1). The insertion point is
		 * defined as the point at which the key would be inserted into the array: the
		 * index of the first element greater than the key, or a.length if all elements
		 * in the array are less than the specified key. Note that this guarantees that
		 * the return value will be >= 0 if and only if the key is found.
		 * System.out.println(index);
		 */
		
		Arrays.fill(nums, 0);
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}


	}

}
