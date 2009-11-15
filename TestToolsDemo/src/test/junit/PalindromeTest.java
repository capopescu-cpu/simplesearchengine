package test.junit;

import com.mitalijha.myapplication.util.Palindrome;
import junit.framework.TestCase;

public class PalindromeTest extends TestCase {
	protected void setUp() {

	  }
	
	public void testIsPalindrome() {
	    System.out.println("Checking palindrome test");
	    assertEquals(true,Palindrome.isPalindrome("a"));
	    assertEquals(true,Palindrome.isPalindrome("Madam"));
	    assertEquals(true,Palindrome.isPalindrome("madaM"));
	    assertEquals(false,Palindrome.isPalindrome("mime"));
	  }
}
