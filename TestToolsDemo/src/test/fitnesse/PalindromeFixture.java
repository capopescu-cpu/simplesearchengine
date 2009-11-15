package test.fitnesse;
import com.mitalijha.myapplication.util.*;
import fit.ColumnFixture;
public class PalindromeFixture extends ColumnFixture {
	public String word;;

    public Boolean Palindrome() {
        boolean answer = Palindrome.isPalindrome(word);
        return answer;
    }
}
