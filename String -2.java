
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
