package com.abhi.algorithm.finder;
// Count occurrence of a string say ("ab")  in a sentence "abc pwr abcabc lmn abcxyx".

public class CountStringInSentence {

	public static void main(String[] args) {
		String str = "abc pwr abcabc lmn abcxyx";
		findString(str, "ab");
	}

	static void findString(String str , String s)
	{
		char[] chs = str.toCharArray();
		
		for(char c: chs)
		{
			System.out.print(c);
		}
		System.out.println();
		String expression = "\\s";
		int count = 0;
		
		String [] partString = str.split(expression);
		for(String st : partString)
		{
			System.out.println("Given :" + st );
			if(st.contains(s))
			{
				 count++;
			}
		}
		System.out.println("total : " + count);
	}

}
