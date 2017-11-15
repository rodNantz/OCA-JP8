package chapter2;

import java.util.BitSet;

public class OtherOperators {
	
	static String timebomb = null;
	static boolean imFalse = false;
	
	public static void main(String[] args) {
		
		/* Bitwise / unconditional operators:
		 * Operate in a 'lazy' way, e.g. in a IF, if the first condition of an AND
		 * is false, the right side operand is still checked anyway 
		 */
		try {
			// exception will be thrown
			if(imFalse & timebomb.equals("boom"))
				System.out.println(" & ");
			System.out.println("Not safe! (will not get here)");
		} catch (NullPointerException npe) {
			System.err.println("operator & " + npe);
		}
		
		/* short-circuit / conditional operators:
		 * 	|| , &&
		 * Operate in a 'smart' way, e.g. in a IF, if the first condition of an AND
		 * is false, the right side operand doesn't need to be checked.
		 */
		try {
			// It evaluates the first operand, and doesn't need to check the last
			if(imFalse && timebomb.equals("boom"))
				System.out.println(" && ");
			System.out.println("\nSafe!");
		} catch (NullPointerException npe) {
			System.err.println("operator && " + npe);
		}
		
		
		/* Other operators:
		 * XOR ^ : if only one of operands is true
		 */
		if(true ^ false)
			System.out.println("true ^ false == true");
		
		if(true ^ true)
			System.out.println("lie");
		else 
			System.out.println("true ^ true == false");
		
		/* Bitwise negation
		 * ~ : Valid for integral types, it negates the 32 bits on it
		 * It's like a ! but for inverting bits on an integral type.
		 */
		
		int five = 5;
		// 101
		System.out.println(five + ": " + Integer.toBinaryString(five));
		
		int notFive = ~ five;
		// a lot of bits then 010 (inverse bits of 101)
		System.out.println(notFive + ": " + Integer.toBinaryString(notFive));
		
		/* MOD
		 * This is an well-known operator, but let's see all its usage
		 */
		
		int m = 15 % 10;
		System.out.println("m = 15 % 10	 	// m value is "+ m);
		
		m %= 3;
		System.out.println("m %= 3  		// m = 5 % 3 which is "+ m);
	}
}
