package com.mitalijha.myapplication;
import java.util.Scanner;

import com.mitalijha.myapplication.util.Palindrome;
import com.mitalijha.myapplication.util.Prime;




public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- PRIME NUMBERS --");
		System.out.print("Enter a number: ");
		int n = Integer.parseInt(sc.nextLine());
		
		if (Prime.isPrime(n) == true)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
		System.out.println();
		
		System.out.println("-- PALINDROMES --");
		System.out.print("Enter a word: ");
		String wd = sc.nextLine();
		
		if (Palindrome.isPalindrome(wd) == true)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		System.out.println();
	}
}
