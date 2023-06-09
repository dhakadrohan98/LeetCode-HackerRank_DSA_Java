1. Mini-Max Sum

  public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long maxSum=0, minSum=0;
    Collections.sort(arr);
    
    for(int i=1; i<arr.size(); i++) {
        maxSum += arr.get(i);
    }
    
    for(int j=0; j<(arr.size()-1); j++) {
        minSum += arr.get(j);
    }
    System.out.println(minSum + " " + maxSum);
        
    }
}

2. Birthday Cake Candles

  public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int tallest = Collections.max(candles);
    int tallestCount = 0;
    
    for(int i=0; i<candles.size(); i++) {
        if(candles.get(i) == tallest) 
        {
            tallestCount++;
        }
    }
    return tallestCount;
    }




3. Time Conversion


public static String timeConversion(String s) {
    String result = "";
    String finalHour = "";
    if(s.contains("PM")) {
        String[] tempStr = s.split(":");
        
        //Converting hour String to int
        int hour = Integer.parseInt(tempStr[0]);
        //Checking hour condition for PM time format
        if(hour < 12) {
            hour += 12;
        }
        //Converting new int hour to a string hour.
        finalHour = String.valueOf(hour);
        //Store min to a min string from string array
        String min = tempStr[1];
        //Extract sec from last tempStr[] string array
        String extractSec = tempStr[2].substring(0,2);
        
        result = finalHour+":"+min+":"+extractSec;
        
    }
    else if(s.contains("AM")) {
        String[] tempStr = s.split(":");
        
        //Converting hour String to int
        int hour = Integer.parseInt(tempStr[0]);
        //Checking hour condition for PM time format
        if(hour == 12) {
            hour -= 12;
            finalHour = String.valueOf(hour);
            finalHour = "0"+finalHour;
        }
        else {
            //Converting new int hour to a string hour.
            finalHour = String.valueOf(hour);
            //Appending 0 before to 1-9 hour


            if(finalHour.equals("1") ) {
                finalHour = "0"+finalHour;
            }
            if(finalHour.equals("2")) {
                finalHour = "0"+finalHour;
            }
            if(finalHour.equals("3")) {
                finalHour = "0"+finalHour;
            }
            if(finalHour.equals("4")) {
                finalHour = "0"+finalHour;
                System.out.println(finalHour);
            }
            if(finalHour.equals("5")) {
                finalHour = "0"+finalHour;
            }
            if(finalHour.equals("6")) {
                finalHour = "0"+finalHour;
            }
            if(finalHour.equals("7")) {
                finalHour = "0"+finalHour;
            }
            if(finalHour.equals("8")) {
                finalHour = "0"+finalHour;
            }
            if(finalHour.equals("9")) {
                finalHour = "0"+finalHour;
            }
        }
    
        //Store min to a min string from string array
        String min = tempStr[1];
        //Extract sec from last tempStr[] string array
        String extractSec = tempStr[2].substring(0,2);
        
        result = finalHour+":"+min+":"+extractSec;
    }
    
    return result;
}


4. Grading Students


public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> result = new ArrayList<Integer>();
    
    for(int i=0; i<grades.size(); i++){
        if(grades.get(i) < 38) {
            result.add(grades.get(i));
        }
        
        else if(grades.get(i)>=38) {
        int tempQuotient = grades.get(i)/5;
        int tempTarget = (tempQuotient+1)*5;
        
        int tempDifference = tempTarget-grades.get(i); 
        if(tempDifference < 3) 
        {
            result.add(tempTarget);
        }
        else {
            result.add(grades.get(i));
        }
        
        }
    }
    return result;
    
    }


5. Apple and Orange




public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Initialising final result to 0.
    int appleFallenSamHouse = 0;
    int orangeFallenSamHouse = 0;
    
    //Creating appleDistanceSam list for calculating real distance of all fallen apples  
    List<Integer> appleDisSam = new ArrayList<Integer>();
    
    //Creating orangeDistanceSam List for calculating real distance of all fallen oranges  
    List<Integer> orangeDisSam = new ArrayList<Integer>();
    
    //for apples fallen distance count.
    for(int i=0; i<apples.size(); i++) {
        appleDisSam.add(a + apples.get(i) );
    }
    
    //for apples fallen count in sam's house range.
    for(int i=0; i<appleDisSam.size(); i++) { 
        if(appleDisSam.get(i)>=s && appleDisSam.get(i)<=t) {
            appleFallenSamHouse++;
        }
    }
    
    // For all oranges fallen distance count.
    for(int i=0; i<oranges.size(); i++) {
        orangeDisSam.add(b + oranges.get(i) );
    }
    
    //for oranges fallen count in sam's house range.
    for(int j=0; j<orangeDisSam.size(); j++) { 
        if((orangeDisSam.get(j)>=s) && (orangeDisSam.get(j)<=t)) {
            orangeFallenSamHouse++;
        }
    }
    
    System.out.println(appleFallenSamHouse);
    System.out.println(orangeFallenSamHouse);
 }


6. Number Line Jumps:
   public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
        if(v2>v1){
            return "NO";
        }
        int startingGap = Math.abs(x2-x1);
        
        while(x1!=x2) {
            x1 += v1;
            x2 += v2;
            int newGap = Math.abs(x2-x1);
            if(newGap>=startingGap) return "NO";
        }
        return "YES";
 }


7. Subarray Division:


 public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    
    if(m > s.size()) {
        return 0;
    }
    int count=0; 
    int sum=0; 
    int ways=0;
    
    for(int i=0; i<s.size(); i++) {
      sum = sum + s.get(i);
      count++;
      
      if(count==m && sum==d) {
          count--;
          System.out.println("success: "+count);
          sum = sum - s.get(i-count);
          ways++;
      }
      else if(count==m) {
          count--;
          System.out.println("Failure: "+count);
          sum = sum - s.get(i-count);
      }
    }
    return ways;




8. Breaking the Records:


   public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    int breakingMost=0, breakingLeast=0;
    int highest = scores.get(0);
    int lowest = scores.get(0);
    List<Integer> result = new ArrayList<>();
    
    for(int i=1; i<scores.size(); i++)
    {
        if(scores.get(i) > highest) {
            highest = scores.get(i);
            breakingMost++;
        }
        else if(scores.get(i) < lowest) {
            lowest = scores.get(i);
            breakingLeast++;
        }
    }
    
    result.add(breakingMost);
    result.add(breakingLeast);
    return result;
    
    }


9. Divisible Sum Pairs:


 public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    int pairsCount = 0;
    
    for(int i=0; i<n; i++) {
        for(int j=(i+1); j<n; j++) {
            int pairSum = ar.get(i) + ar.get(j);
            
            if(pairSum%k ==0) {
                pairSum = 0;
                pairsCount++;
            }
            pairSum = 0;
        }
    }
    return pairsCount;
    }


10 Migratory Birds:


public static int migratoryBirds(List<Integer> arr) {
    // Sorting the given array at first place
    Collections.sort(arr);
    HashMap<Integer,Integer> hmap = new HashMap<>();
    int maxFrequency = 0;
    int result = 0;
    
    // Making Hash table
    for(int i=0; i<arr.size(); i++) {
        
        if(hmap.containsKey(arr.get(i))) {
            int value = hmap.get(arr.get(i));
            hmap.put(arr.get(i), value+1);
        }
        else {
            hmap.put(arr.get(i), 1);
        }
    }
    //Printing created HashMap
    System.out.println(hmap);
    
    //Iterating through keys & checking if maxFrequency is less than value of key, then     store that key in result & value in maxFrequency variable.
    for(Integer key:hmap.keySet()) {
        int value = hmap.get(key);
        
        if(maxFrequency < value) {
            maxFrequency = value;
            result = key;
            
        }
    }
    
    return result;
    }


11 Bill Division:


  public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
    int sum=0;
    
    // Total sum of bill for Brain & Anna both
    for(int i=0; i<bill.size(); i++) {
        sum += bill.get(i);
    }


    int reducedBillForAnna = sum - bill.get(k);
    int actual = reducedBillForAnna/2;
    
    if(actual == b) {
        System.out.println("Bon Appetit");
    }
    else if (actual < b) {
        System.out.println(b-actual);
    }
    
}


12. Sales by Match:


   public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here<
    HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
    int pairsCount = 0;
    
    //Creating HashMap for calculating frequency of elements of ArrayList ar 
    for(int i=0; i<ar.size(); i++) {
        if(hmap.containsKey(ar.get(i))) {
            int value = hmap.get(ar.get(i));
            hmap.put(ar.get(i), value+1);
        }
        else {
            hmap.put(ar.get(i),1);
        }
    }
    System.out.println(hmap);
    
    // Main logic for calculating pairsCount.
    for(Integer key:hmap.keySet()) {
        int value = hmap.get(key);
        
        int tempQuotient = value/2;
        while(tempQuotient!=0) {
            pairsCount++;
            tempQuotient--;
        }
    }
    return pairsCount;
 }


13. Drawing Book: 


    public static int pageCount(int n, int p) {
    // Write your code here
    if(p==1 || p==n) 
        return 0;
        
    int startPageNo=1, endPageNo=n;
    int diffFromStart = p -  startPageNo;
    int diffFromEnd = n - p; 
    int minimum = 0; 
        
    
        if(diffFromStart < diffFromEnd) {
            for(int i=2; i<n; i++) {
                if((i%2) == 0) {
                    minimum++;
                }
                if(i==p) {
                    return minimum;
                }
            }
        }
        else if(diffFromStart > diffFromEnd) {
            for(int j=n-1; j>1; j--) {
                if((j%2) != 0) {
                    minimum++;
                }
                if(j==p) {
                  return minimum;  
                }
            }
        }
        else {
            for(int j=n-1; j>1; j--) {
                if((j%2) != 0) {
                    minimum++;
                }
                if(j==p) {
                  return minimum;  
                }
            }
        }
        return minimum;
  }


14. Between two sets:


   public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int start = a.get(a.size()-1);
    int end = b.get(0);
    
    int result = 0;
    int totalSize = a.size() + b.size();
    
    for(int i=start; i<=end; i++) {
        int count = 0;
        
        for(int j=0; j<a.size(); j++) {
            if((i%a.get(j))==0) {
                count++;
            }
        }
        
        for(int j=0; j<b.size(); j++) {
            if((b.get(j)%i)==0) {
                count++;
            }
        }
        
        if(totalSize==count) {
            result++;
        }
    }
    return result;


    }


15. Cats & Mouse:


public static String catAndMouse(int x, int y, int z) {
        
        int diffFromx = Math.abs(x-z);
        int diffFromy = Math.abs(y-z);


        if(diffFromx == diffFromy) {
            return "Mouse C";
        }
        else if(diffFromx > diffFromy) {
            return "Cat B";
        } 
        else {
            return "Cat A";
        }
}


16. Day of the Programmer:


public static String dayOfProgrammer(int year) {
    // Write your code here
    if(year>=1700 && year<=1917) {
        if((year%4)==0) {
            return "12."+"09."+year;
        }
        else {
            return "13."+"09."+year;
        }
    }
// In russian calendar, when the next day after January 31st was February 14th. This means that in 1918, February 14th was the 32nd day of the year in Russia.
    else if(year==1918){
           return "26."+"09."+year;     
    }
    else {
        if(((year%4)==0 && ((year%100)!=0)) || (year%400)==0) {
            return "12."+"09."+year;
        }
        else {
            return "13."+"09."+year;
        }
    }
    
   }


17. Counting Valleys:


public static int countingValleys(int steps, String path) {
    // Write your code here
    int stepTracker=0;
    int valleyCount = 0;
    
    // System.out.println(path.length());
    
    for(int i=0; i<path.length(); i++) {
        int prevStepTracker = stepTracker;
        if(path.charAt(i)=='U') {
            stepTracker++;
        }
        else {
            stepTracker--;
        }
    // Checking if prevStepTracker equals to -1 & currentStepTracker=0 Then & then only increase valleyCount.
        if(stepTracker==0 && prevStepTracker==-1) {
            System.out.println(prevStepTracker);
           valleyCount++;
        }
    }    
    return valleyCount;
}


18. The Hurdle Race:
   public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
    int max=0;
    
    for(int i=0; i<height.size(); i++) {
        
        if(max < height.get(i)) {
            max = height.get(i);
        }
    }
    // If capability of jump by character is equal to or greater than max(height) then return 0; 


      if(k>=max) {
        return 0;
    }
    int potionDose = max-k;
    return potionDose;
}


19. Designer PDF Viewer:


public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
    
    //Creating hashMap alphabets are mapped with their respective index.
    HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
   hmap.put('a',0);
   hmap.put('b',1);
   hmap.put('c',2);
   hmap.put('d',3);
   hmap.put('e',4);
   hmap.put('f',5);
   hmap.put('g',6);
   hmap.put('h',7);
   hmap.put('i',8);
   hmap.put('j',9);
   hmap.put('k',10);
   hmap.put('l',11);
   hmap.put('m',12);
   hmap.put('n',13);
   hmap.put('o',14);
   hmap.put('p',15);
   hmap.put('q',16);
   hmap.put('r',17);
   hmap.put('s',18);
   hmap.put('t',19);
   hmap.put('u',20);
   hmap.put('v',21);
   hmap.put('w',22);
   hmap.put('x',23);
   hmap.put('y',24);
   hmap.put('z',25);
   
   int max=0;
   
   for(int i=0; i<word.length(); i++) {
       char alphabet = word.charAt(i);
       //Getting index from hmap.get(character) through a given alphabet.
       int index = hmap.get(alphabet);
//Getting value from array h for index of encountered alphabet (found in previous step)
       int value = h.get(index);
       
       System.out.println(value);
       
       if(max < value) {
           max = value;
       }
   }
    return (max * (word.length()));
}


20. Electronics shop: (My approach)


    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
       int expensive=-1, remaining=0;
       // Sorting both arrays if length of arrays is more than 1.
       if(keyboards.length!=1) {
          Arrays.sort(keyboards); 
       }
       if(drives.length!=1) {
           Arrays.sort(drives);
       }
       
       for(int i=keyboards.length-1; i>=0; i--) {
           remaining = b-keyboards[i];
           
           for(int j=drives.length-1; j>=0; j--) {
               
               if(remaining>=drives[j]) {
                   if(expensive < keyboards[i]+drives[j]) {
                   expensive = keyboards[i]+drives[j];
                   }
               }
           }
       }
       
       if(expensive<=b) {
           return expensive;
       }
       else {
           return -1;
       }
 }


21. Angry Professor:


 public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
    int temp = 0;
    
    for(int i=0; i<a.size(); i++) {
        if(a.get(i)<=0)
        {
            temp++;
        }
    }
    if(temp<k) {
        return "YES";
    }
    else 
        return "NO";
}


22. Utopian Tree:


 public static int utopianTree(int n) {
    // Write your code here
    int height = 1;
    for(int i=1; i<=n; i++) {
        if(i%2 != 0) {
            height = height * 2;
        }
        else {
            height = height + 1;
        }
    }
    return height;
}


23. Beautiful Days at the Movies:


 public static int beautifulDays(int i, int j, int k) {
    // Write your code here
        int count = 0;
        
        while(i<=j) {
            int num = i;
            int reverse = rev(num);
            int difference = Math.abs(num-reverse);
            // System.out.println("Diff: "+difference);
            
            if(difference%k == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
    
    public static int rev(int num) {
        int rev=0, rem=0;
        
        while(num!=0) {
            rem = num%10;
            rev = (rev*10) + rem;
            num = num/10;
        }
        return rev;
 }


24. Viral Advertising:


public static int viralAdvertising(int n) {
    // Write your code here
    int currShared = 5;
    int liked = Math.floorDiv(currShared,2);
    int prevShared = 0;
    int cumulative = liked;


    for(int i=2; i<=n; i++) {
        prevShared = currShared;
        
        currShared = (Math.floorDiv(prevShared, 2)) * 3;
        liked = Math.floorDiv(currShared, 2);
        cumulative += liked;
    }    
    return cumulative;
}


25. Cut the sticks:


public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
    ArrayList<Integer> result = new ArrayList<Integer>();
    ArrayList<Integer> temp = new ArrayList<Integer>();
    int element = 0;
    
    while(arr.size() != 0) {
        result.add(arr.size());
        System.out.println(result);
        Collections.sort(arr);
        int minimumElement = arr.get(0);;
        for(int i=0; i<arr.size(); i++) {
            element = arr.get(i)-minimumElement;
            if(element != 0) {
                temp.add(element);
            }
        }
        arr = temp;
    }
    return result;
}


Note: Time limit exceeded from above solution (Not got submitted).


Kumar K solution:
public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
    int totalSticks = arr.size();
    int removedSticks=0;
    Collections.sort(arr);
    List<Integer> stickPieces = new ArrayList<>();
    
    while(removedSticks != totalSticks) {
        System.out.println("RemovedSticks: "+removedSticks);
        int val = arr.get(removedSticks);
        stickPieces.add(totalSticks-removedSticks);
        for(int i=0; i<arr.size(); i++) {
            int num=arr.get(i)-val;
            arr.set(i,num);
            if(arr.get(i) == 0) {
                removedSticks++;
            }
        }
    }
    return stickPieces;
}




26. Sequence Equation:


public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
    int mapIndex = 0;
    List<Integer> result = new ArrayList<>(); 
    
    for(int x=1; x<=p.size(); x++) {
        for(int i=0; i<p.size(); i++) {
            if(x == p.get(i)) {
                mapIndex = i+1;
            }
        }
        
        for(int j=0; j<p.size(); j++) {
            if(mapIndex == p.get(j)) {
                result.add(j+1);
            }
        }
    }
    return result;
 }


27. Find Digits:


public static int findDigits(int n) {
    // Write your code here
    int tempNum = n;
    int result=0;
    
    while(tempNum!=0) {
        int rem = tempNum%10;
        
        if(rem!=0 && (n%rem) == 0) {
            result++;
        }
        tempNum = tempNum/10;
    }
    return result;
}


28. Circular Array Rotation:


class Result {


    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */
     
     public static void reverse(List<Integer> a, int i, int j) {
        int li = i;
        int ri = j;
        
        while(li<ri) {
            int temp = a.get(li);
            a.set(li, a.get(ri));
            a.set(ri, temp);
            
            li++;
            ri--;
        }
    }
    
    public static void rotate(List<Integer> a,int k) {
        k = k % a.size();
        
        if(k < 0) {
            k = k + a.size();
        }
        System.out.println(a);
        //part1
        reverse(a, 0 , a.size()-k-1);
        System.out.print("Part 1: ");
        System.out.println(a);
        
        //part2
        reverse(a, a.size()-k, a.size()-1);
        System.out.print("Part 2: ");
        System.out.println(a);
        
        //all
        reverse(a, 0, a.size()-1);
        System.out.print("All: ");
        System.out.println(a);
    }




    public static List<Integer> circularArrayRotation(List<Integer>     a, int k, List<Integer> queries) {
    // Write your code here
    List<Integer> result = new ArrayList<Integer>();
    
    rotate(a, k);


    
    for(int i=0; i<queries.size(); i++) {
        result.add(a.get(queries.get(i)));
    }
    return result;
    }
}


29. Counting frequency of array elements:


package maang;
import java.util.*;
import java.io.*;


public class CountingFrqeuencyOfArrayElements {
	
	public static void main(String[] args) {
		int[] arr = new int[]{1,1,1,2,2,8,8,3,3,5,5,5,4,6,6,7,96,96,87,87,96,87};
	HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	
	for(int i=0; i<arr.length; i++) {
		if(hmap.containsKey(arr[i])) {
			int value = hmap.get(arr[i]);
			hmap.put(arr[i], value+1);
		}
		else {
			hmap.put(arr[i], 1);
		}
	}
	
	for(Integer key:hmap.keySet()) {
		System.out.println(key+": "+hmap.get(key));
	}
	System.out.println(hmap.entrySet());
   }
}


30. Missing numbers:


public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here
    List<Integer> result = new ArrayList<Integer>();
    
    HashMap<Integer,Integer> hmap = new HashMap<>();
    for(int i=0; i<arr.size(); i++) {
        int key = arr.get(i);
        
        if(hmap.containsKey(key)) {
            int val = hmap.get(key);
            hmap.put(key, val+1);
        }
        else {
            hmap.put(key, 1);
        }
    }
    
    HashMap<Integer,Integer> hmap1 = new HashMap<>();
    for(int j=0; j<brr.size(); j++) {
        int key = brr.get(j);
        
        if(hmap1.containsKey(key)) {
            int val = hmap1.get(key);
            hmap1.put(key, val+1);
        }
        else {
            hmap1.put(key, 1);
        }
    }
    System.out.println(hmap);
    System.out.println("***********************");
    System.out.println(hmap1);
    
    for(Integer key1:hmap1.keySet()) {
        int tempKey = key1;
        int tempVal = hmap1.get(key1);
        
        for(Integer key:hmap.keySet()) {
            int insideKey = key;
            int insideVal = hmap.get(key);


            if(tempKey==insideKey && tempVal!=insideVal) {
                if( !(result.contains(insideKey)) ) {
                result.add(insideKey);
                }
            }
        }
    }
    
    for(Integer key1:hmap1.keySet()) {
        int tempKey = key1;
        
        for(Integer key:hmap.keySet()) {
            
            if(!(hmap.containsKey(tempKey)) && !(result.contains(tempKey))) {
                result.add(tempKey);
            }
        }
    }
    
    Collections.sort(result);
    return result;
    }


31. Find the Median:


public static int findMedian(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    
    int mid = arr.size()/2;
    
    return arr.get(mid);
}


32. Closest Numbers:


public static List<Integer> closestNumbers(List<Integer> arr) {
    // Write your code here
    List<Integer> result = new ArrayList<>();
    Collections.sort(arr);
    int smallestDiff=Math.abs(arr.get(1) - arr.get(0));
    int currDiff = 0;
    
    if(arr.size()==2) {
        result = arr;
        return result;
    }
    else {
        //First for loop for calculating smallestDiff
        for(int i=0; i<arr.size()-1; i++) {
            currDiff = Math.abs(arr.get(i+1) - arr.get(i));
           if(smallestDiff > currDiff) {
               smallestDiff = currDiff;
           }
        }
        System.out.println(smallestDiff);
        
        //Adding that pair of number from list which differences match with smallestDiff
        for(int i=0; i<arr.size()-1; i++) {
            int tempDiff = Math.abs(arr.get(i+1) - arr.get(i));
            
            if(tempDiff==smallestDiff) {
                result.add(arr.get(i));
                result.add(arr.get(i+1));
            }
        }
        
        return result;
     } //else closing
  } //method closing


33. Sherlock & Array:


Wrong Approach:


public static int sum(List<Integer> arr,int i,int j) {
    int sum=0;
    
    for(int k=i; k<=j; k++) {
        sum += arr.get(k);
    }
    return sum;
    }
    
    public static String balancedSums(List<Integer> arr) {
    // Write your code here
    int count=0;
        
        for(int i=1; i<arr.size()-1; i++) {
            int leftSum = sum(arr, 0, i-1);
            System.out.println("leftSum: "+leftSum);
            
            System.out.println("************************");
            
            int rightSum = sum(arr, i+1, arr.size()-1);
            System.out.println("rightSum: "+rightSum);
            System.out.println("End");
            
            if(leftSum==rightSum || (leftSum==0&&rightSum=0) {
                count++;
                break;
            }
        }
        
        if(count==1)
            return "YES";
        else
            return "NO";
}


Right approach:


 public static String balancedSums(List<Integer> arr) {
    // Write your code here
    int totalSum=0;
    int leftSum=0;
    
    for(int i=0; i<arr.size(); i++) {
        totalSum += arr.get(i);
    }  
    
    for(int i=0; i<arr.size(); i++) {
     totalSum = totalSum-arr.get(i);
     
     if(totalSum==leftSum) return "YES";
     else leftSum = leftSum+arr.get(i);
    }
    return "NO";
}


34. Jim and the Orders: (Self solved)


public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Write your code here\
    List<Integer> result = new ArrayList<>();
    List<Integer> serve = new ArrayList<>();
    
    for(int i=0; i<orders.size(); i++) {
        int serveTime = orders.get(i).get(0) + orders.get(i).get(1);
        serve.add(serveTime);
    }
    Collections.sort(serve);
    System.out.println(serve);
    for(int i=0; i<serve.size(); i++) {
        int val = serve.get(i);
                
        for(int j=0; j<orders.size(); j++) {
        int serveTime = orders.get(j).get(0) + orders.get(j).get(1);
        if(val == serveTime && !(result.contains(j+1))) {
            result.add(j+1);
            break;
           }
        }
    }
    return result;
 }


35. Mark and Toys: (Greedy)


 public static int maximumToys(List<Integer> prices, int k) {
    // Write your code here
    int count=0;
    
    if(k == prices.get(0) && prices.size()==1) {
        count++;
        return count;
    }
    else {
        count=0;
    }
    
    Collections.sort(prices);    
    int remain = k;
    
    for(int i=0; i<prices.size(); i++) {
        //Checking for first element of ArrayList prices.
        if(remain >= prices.get(i)) {
            count += 1;
        }
        else if(!(remain >= prices.get(i))) {
            break;
        }
        remain = remain - prices.get(i);
    }
    return count;
}


36. Nested ArrayList:


package maang;
import java.util.*;


public class NestedArrayList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ArrayList<Integer>> orders = new ArrayList<>();
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(1);
		arr1.add(2);
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(11);
		arr2.add(22);
		arr2.add(33);
		
		orders.add(arr1);
		orders.add(arr2);
		
		for(int i=0; i<orders.size(); i++)
		{
			for(int j=0; j<orders.get(i).size(); j++) {
				System.out.println(orders.get(i).get(j));
			}
		}
		
		System.out.println(orders);
	}
}


37. Insertion Sort - Part 1:


 public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
    int count=0;
    int min = arr.get(arr.size()-1);
    
    for(int i=arr.size()-2; i>=0; i--) {
        if(min < arr.get(i)) {
            
                arr.set(i+1, arr.get(i));
                for(int j=0; j<n; j++) {
                System.out.print(arr.get(j)+" ");
                }
                System.out.println();
        }
        else {
            arr.set(i+1, min);
            count++;
            for(int j=0; j<n; j++) {
            System.out.print(arr.get(j)+" ");
            }
        System.out.println();
        break;
        }
    }
    
    if(count==0) {
        arr.set(0,min);
        for(int j=0; j<n; j++) {
            System.out.print(arr.get(j)+" ");
        }
    }
}




38. Insertion Sort - Part 2:




class Result {
     
     public static void printList(List<Integer> arr) {
         for(int val:arr) {
             System.out.print(val+" ");
         }
         System.out.println();
     }
     
    public static void checkAgainst(List<Integer> arr, int i, int j) {
        
        for(int k=i; k>=1; k--) {
            
            int val = arr.get(k);
            if(val > arr.get(k-1)) {
                continue;
            }
            else {
                int temp = arr.get(k-1);
                arr.set(k-1,arr.get(k));
                arr.set(k, temp);
            }
        }
    }


    public static void insertionSort2(int n, List<Integer> arr) {
    // Write your code here
    
    for(int i=1; i<arr.size(); i++) {
        checkAgainst(arr,i,0);
        printList(arr);
    }
  }
}


39. Running Time of Algorithms:


public static int runningTime(List<Integer> arr) {
    // Write your code here
    int shift=0;
    
    for(int i=0; i<arr.size(); i++) {
          for(int k=i; k>=1; k--) {
            
            int curr = arr.get(k);
            if(curr < arr.get(k-1)) {
                int temp = curr;
                arr.set(k,arr.get(k-1));
                arr.set(k-1, temp);
                shift++;
            }
        }
    }
    return shift;
}


40. Cavity Map:


public static List<String> cavityMap(List<String> grid) {
    // Write your code here
    
    for(int i=1; i<grid.size()-1; i++) {
            String prev = grid.get(i-1);
            String curr = grid.get(i);
            String next = grid.get(i+1);
            
            for(int j=1; j < curr.length()-1; j++) {
                
                //converting char into int with the help of Character.getNumericValue(c)                   method
                int up = Character.getNumericValue(prev.charAt(j));
                int left = Character.getNumericValue(curr.charAt(j-1));
                int mid = Character.getNumericValue(curr.charAt(j));
                int right = Character.getNumericValue(curr.charAt(j+1));
                int down = Character.getNumericValue(next.charAt(j));
                
                if(mid>up && mid>left && mid>right && mid>down) {
                    char ch = 'X';
                    curr = curr.substring(0, j) + ch+ curr.substring(j + 1);
                    grid.set(i, curr);
                }
            }
        }
        
        List<String> result = new ArrayList<>();
        result = grid;
        System.out.println(result);
        return result;
}
