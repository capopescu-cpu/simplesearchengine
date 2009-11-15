package com.mitalijha.myapplication.util;

public class Prime {

	public static int getNextPrime (int n)
	{
		for (int i=n+1; ; i++)
			if (isPrime(i)==true)
				return i;
	}	
	
	public static boolean isPrime (int n)
	{
		for (int i=2; i<Math.sqrt(n); i++)
			if (n%i==0)
				return false;
		return true;
	}
	
}
