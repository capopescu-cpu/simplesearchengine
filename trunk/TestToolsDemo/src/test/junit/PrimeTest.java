package test.junit;

import java.util.*;

import com.mitalijha.myapplication.util.Prime;

import junit.framework.*;

public class PrimeTest extends TestCase {

  // Thus, setUp() is optional, but is run right
  // before the test:
  protected void setUp() {

  }

  // All tests have method names beginning with "test":
  public void testIsPrime() {
    System.out.println("Running Prime number test");
    assertEquals(true,Prime.isPrime(2));
    assertEquals(false,Prime.isPrime(4));
    assertEquals(false,Prime.isPrime(49));
  }

  public void testNextPrime() {
	    System.out.println("Running Prime number test");
	    assertEquals(Prime.getNextPrime(2), 3);
	    assertEquals(Prime.getNextPrime(5), 7);
  }

} 
           