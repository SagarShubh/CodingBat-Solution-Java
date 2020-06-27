
/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
*/

public String doubleChar(String str) {
    String result = "";

        for ( int i = 0; i < str.length(); i++ ) {
            result = result + str.charAt( i ) + str.charAt( i );
        }

        return result;
}


/*

Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false

*/
public boolean xyzMiddle(String str) {
  int i = str.length()/2-1;
  if (str.length() >= 3 && (str.substring(i, i+3).equals("xyz") || (str.length()%2 == 0 && str.substring(i-1, i+2).equals("xyz"))  )) {
  return true;
     }
  else{ 
  return false;//str.substring(str.)
	}
}



//Return the number of times that the string "hi" appears anywhere in the given string.

public int countHi(String str) {
  int len = str.length()-1;
	int times = 0;
	for(int i = 0; i < len; i++)
	{
		if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
			times++;
	}
	return times;
}



//Given two strings, return true if either of the strings appears at the very end of the other string,
//ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
//Note: str.toLowerCase() returns the lowercase version of a string.

public boolean endOther(String a, String b) {

  int aLen = a.length();
	int bLen = b.length();
	String end;
	String temp;
	a = a.toLowerCase();
	b = b.toLowerCase();
	if(aLen >= bLen)
	{
		end = a.substring(aLen - bLen);
		temp = b;
	}
	else
	{
		end = b.substring(bLen - aLen);
		temp = a;
	}
	return (end.equals(temp));
}



/*
Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.


matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
*/


public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
 
 for(int i =0; i< nums1.length; i++){
   if(Math.abs(nums1[i] - nums2[i]) <=2  && nums1[i] != nums2[i])
        count++;
 }
 return count;

}

