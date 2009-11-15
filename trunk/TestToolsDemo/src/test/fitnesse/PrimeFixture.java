package test.fitnesse;

import com.mitalijha.myapplication.util.*;

import fit.ColumnFixture;

public class PrimeFixture extends ColumnFixture{
	public int number;

    public Boolean Prime() {
        boolean answer = Prime.isPrime(number);
        return answer;
    }
    
}