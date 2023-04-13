Determine if Two Events Have Conflict:

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
}
