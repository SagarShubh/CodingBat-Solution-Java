
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
