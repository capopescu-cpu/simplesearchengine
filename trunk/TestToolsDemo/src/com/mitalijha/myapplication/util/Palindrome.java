package com.mitalijha.myapplication.util;

public class Palindrome {
	
	public static boolean isPalindrome (String word)
	{
		String reverse="";
		int len = word.length();
		
		for (int i=0; i<len; i++)
			reverse += word.charAt(len-i-1);
		
		if (reverse.equals(word))
			return true;
		else
			return false;
	}

}
