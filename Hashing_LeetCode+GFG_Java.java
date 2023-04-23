Apply Operations to an array:
class Solution {
   public int[] applyOperations(int[] nums) {
      
       for(int i=0; i<nums.length-1; i++) {
          
           if(nums[i] == nums[i+1]) {
               nums[i] = nums[i] * 2;
               nums[i+1] = 0;
           }
       }
       int j = 0;
      
     for(int i=0; i<nums.length; i++) {
           if(nums[i] != 0) {
               int temp = nums[j];
               nums[j]=nums[i];
               nums[i] = temp;
               j++;
           }
       }
      
       return nums;
   }
}



2 Determine if Two Events Have Conflict:

Version1:

import java.time.LocalTime;
class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
      
		int count=0;
		
		String temp1 = event1[0];
		LocalTime start1 = LocalTime.parse(temp1) ;
		
		String temp2 = event1[1];
		LocalTime end1 = LocalTime.parse(temp2) ;

		String temp3 = event2[0];
		LocalTime start2 = LocalTime.parse(temp3) ;

		String temp4 = event2[1];
		LocalTime end2 = LocalTime.parse(temp4);



			if( ((start1.compareTo(start2)==-1) && (start2.compareTo(end1)==-1)) || ((start1.compareTo(end2)==-1) && 
			(end2.compareTo(end1)==-1) )) {
				return true;
			}
			if( (start1.compareTo(start2)==-1) && (end2.compareTo(end1)==-1) ) {
				return true;
			}
			if( (start2.compareTo(start1)==-1) && (end1.compareTo(end2)==-1) ) {
				return true;
			}
			if( (start1.compareTo(start2)==0) || (start1.compareTo(end2)==0) || (end1.compareTo(start2)==0) || 
					(end1.compareTo(end2)==0) ) {
						return true;
					}
				return false;

	}
}

Version 2:

import java.time.LocalTime;
class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
      
		String temp1 = event1[0];
		LocalTime start1 = LocalTime.parse(temp1) ;
		
		String temp2 = event1[1];
		LocalTime end1 = LocalTime.parse(temp2) ;

		String temp3 = event2[0];
		LocalTime start2 = LocalTime.parse(temp3) ;

		String temp4 = event2[1];
		LocalTime end2 = LocalTime.parse(temp4);

        //1
            if( (start1.compareTo(start2)==-1) && (start2.compareTo(end1)==-1) && (end1.compareTo(end2)==-1) )
            {
				return true;
			}
        //2 
			if( (start1.compareTo(start2)==-1) && (start1.compareTo(end2)==-1) && (end2.compareTo(end1)==-1) ) 
            {
				return true;
			}
        //3    
			if( (start2.compareTo(start1)==-1) && (start2.compareTo(end1)==-1) && (end1.compareTo(end2)==-1) ) 
            {
				return true;
			}
        //4
            if( (start2.compareTo(start1)==-1) && (start2.compareTo(end1)==-1) && (start1.compareTo(end2)==-1) ) {
                return true;    
            }
        //5
			if( (start1.compareTo(start2)==0) || (start1.compareTo(end2)==0) || (end1.compareTo(start2)==0) || 
				(end1.compareTo(end2)==0) ) 
            {
						return true;
			}
		return false;

	}

3. Two Sum:
TC: O(5ms) Efficient Approach (Kumar k)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
		Map<Integer,Integer> map = new HashMap<>();
		int[] result = new int[2];
	
		int b=0;
		
		for(int i=0; i<nums.length; i++) {
			b = target - nums[i];
			if(!map.containsKey(b)) {
				map.put(nums[i], i);
			}
			else {
				result[0] = map.get(b);
				result[1] = i;
			}
		}
        return result;
    }
}

TC: O(n^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int count = 0;
       int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        
        if(nums.length==2 && (nums[0]+nums[1]==target)) {
            result[0] = 0;
            result[1] = 1;
            return result;
        }
        
        for(int i=0; i<nums.length;i++) {
            map.put(nums[i],i);
        }
        
        for(int k=0; k<nums.length; k++) {
            int remain = target-nums[k];
            for(int key: map.keySet()) {
                if(key==remain && (map.get(key)!=k)) {
                    result[0] = k;
                    result[1] = map.get(key);
                    count++;
                    break;
                }
            }
            if(count==1) {
                break;
            }
        }
        return result;
    }
}

4. Cumulative Sum Query:
TC: O(n)
SC: O(n+1)


package faangm;
import java.util.*;

public class prefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,3,1,6,5,7,3,2};
		int[] prefixSum = new int[nums.length+1];
		Map<Integer,Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of queries:");
		int query = sc.nextInt();
		
		for(int i=0,j=1; i<nums.length && j<prefixSum.length; i++,j++) {
			prefixSum[j] = prefixSum[j-1] + nums[i]; 
		}
//		for(int i=0; i<prefixSum.length; i++) {
//			System.out.print(prefixSum[i]+" ");
//		}
		
		for(int i=0; i<prefixSum.length; i++) {
			map.put(i,prefixSum[i]);
		}
		System.out.println(map);
		
		System.out.println("Enter value of l and r for "+ query +" queries one by one:");
		//Run query one by one.
		for(int q=1; q<=query; q++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			int sum = map.get(r) - map.get(l-1);
			System.out.println("Sum for "+q+" query: "+sum);
		}

	}
}

5. Max distance between same elements:
TC: O(n)
SC: O(n)

class Solution
{
    int maxDistance(int arr[], int n)
    {
	   int max = 0;
		int diff=0;
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			}
			else {
				diff = i - map.get(arr[i]);
				if(max < diff) {
					max = diff;
				}
			}
		}
		return max;
    }
}

6. Count-pairs-with-given-sum:
TC: O(n)
SC: O(n)

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        Map<Integer,Integer> map = new HashMap<> ();
        int count=0;
		
		//main Logic
		for(int i=0; i<arr.length; i++) {
			int b = arr[i];
			int a = k - b;
			if(!map.containsKey(a)) {
				if(map.containsKey(b)) {
					int val = map.get(b);
					map.put(b, val+1);
				}
				else {
					map.put(b, 1);
				}
			}
			else {
				count = count + map.get(a);
				if(map.containsKey(b)) {
					int val = map.get(b);
					map.put(b, val+1);
				}
				else {
					map.put(b, 1);
				}
			}
		}
		return count;
    }
}

7.  First Unique Character in a String:
TC: O(n)
SC: O(n)

class Solution {
    public int firstUniqChar(String s) {
        
        char temp='0';
		Map<Character,Integer> map = new HashMap<>();
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			temp = s.charAt(i);
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp)+1);
			}
			else {
				map.put(temp, 1);
			}
		}
		
	// Main Logic
		for(int i=0; i<s.length(); i++) {
			temp = s.charAt(i);
			
			if(map.get(temp)==1) {
				return i;
			}
		}
        return -1;
        
    }
}

8. Find Common Characters:

class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> minFreqOverAll = new HashMap<>();
		
		//Filling a to z with 1000(max) value
		for(char ch='a'; ch<='z'; ch++) {
			minFreqOverAll.put(ch, 1000);
		}
		
		//Frequency map for current word.
		for(String word: words) {
			Map<Character,Integer> freq = new HashMap<>();
			
			for(int i=0; i<word.length(); i++) {
				char ch = word.charAt(i);
	
				if(freq.containsKey(ch)) {
					freq.put(ch, freq.get(ch)+1);
				}
				else if(!freq.containsKey(ch)) {
					freq.put(ch, 1);
				}
			}
			
			for(char ch='a'; ch<='z'; ch++) {
				if(!freq.containsKey(ch)) {
					freq.put(ch, 0);
				}
			}
			
			//making minFreqOverAll in below for loop-> 26 times will run
			for(char temp='a'; temp<='z'; temp++) {
				int minFreq = Math.min(minFreqOverAll.get(temp), freq.get(temp));
				minFreqOverAll.put(temp, minFreq);
			}
		}
		
		List<String> ans = new ArrayList<>();
		for(char ch='a'; ch<='z'; ch++) {
			if(minFreqOverAll.get(ch)>=1) {
				
				while(minFreqOverAll.get(ch)>0) {
					String tempStr = String.valueOf(ch);
					ans.add(tempStr);
					minFreqOverAll.put(ch,minFreqOverAll.get(ch)-1);
				}
			}
		}
        return ans;
    }
}

9. Longest consecutive subsequence:

My Approach: 
TC: O(nlogn)

class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longest=0;
		int length=0;
		Map<Integer,Integer> map = new HashMap<>();
		Set<Integer> set = new LinkedHashSet<>();
		
		Arrays.sort(nums);
		for(int num:nums) {
			set.add(num);
		}
        
		if(nums.length==0) {
			return length;
		}
		else {
			// Arrays.sort(nums);	
//			map.put(nums[0], 1);
//			int length = 1;
			
			for(int a:set) {
				if(map.containsKey(a-1) && !map.containsKey(a)) {
					map.put(a, 1);
					length++;
				}
				else {
					map.clear();
					System.out.println(map);
					if(longest < length) {
						longest = length;
					}
					map.put(a, 1);
					length=1;
				}
			}
		}
		if(longest < length) {
			longest = length;
		}
//		System.out.println(length);
		return longest;
    }
}

Kumar K approach:(1)

TC: O(n)

class Solution {
    public int longestConsecutive(int[] nums) {
        
        Map<Integer,Boolean> hmap=new HashMap<>();
        for(int num:nums){
            hmap.put(num,true);
        }
        int longestSequence=0;
        Map<Integer,Integer> checkMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hmap.get(nums[i])) continue;
            int num=nums[i];
            int flag=0;
            while(hmap.containsKey(num)){
                if(checkMap.containsKey(num)){
                    checkMap.put(nums[i],checkMap.get(num));
                    flag=-1;
                    break;
                }
                hmap.put(num,false);
                num--;
            }
            if(flag==0)checkMap.put(nums[i],num+1);
            int sequenceLength=nums[i]+1-checkMap.get(nums[i]);
            longestSequence=Math.max(longestSequence,sequenceLength);
        }
        return longestSequence;
    }
}

Kumar K(2):
TC: O(2*n) = O(n)
SC: O(2*n) = O(n)

class Solution {
    public int longestConsecutive(int[] nums) {
        
        Map<Integer,Boolean> present=new HashMap<>();
		Map<Integer,Boolean> checked=new HashMap<>();
		int longestSequence = 0;
		
		for(int num:nums) {
			present.put(num, true);
		}
		System.out.println(present);
		
		for(int a:nums) {
			if(!checked.containsKey(a) && !present.containsKey(a-1)) {
				int currentChain = 0;
				int start = a;
				
				while(present.containsKey(start)) {
					currentChain++;
					checked.put(start, true);
					start++;
				}
				
				longestSequence = Math.max(longestSequence, currentChain);
			}
		}
		return longestSequence;
    }
}

10.Largest subarray with 0 sum:

TC: O(n)
SC: O(n)
class GfG
{
    int maxLen(int arr[], int n)
    {
		int[] prefixSum = new int[arr.length];
		Map<Integer,Integer> prefixSumIndex = new HashMap<>(); //<prefixSum[i],index(first occurence)>
		int tempSum=0, sum=0, largest=0;

		//Build prefixSum array.
		for(int i=0; i<arr.length; i++) {
			tempSum += arr[i];
			prefixSum[i] = tempSum;
		}
		
		
		prefixSumIndex.put(0,-1); // put sum=0 at index=-1 in prefixSumIndex map.
		for(int i=0; i<prefixSum.length; i++) {
			sum = prefixSum[i];
			
			if(prefixSumIndex.containsKey(sum)) {
				int diff = i - prefixSumIndex.get(sum);
				largest = Math.max(largest, diff);
			}
			else {
				prefixSumIndex.put(sum, i);
			}
		}
		return largest;
    }
}
