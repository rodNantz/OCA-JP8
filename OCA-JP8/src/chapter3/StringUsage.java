package chapter3;

public class StringUsage {

	public static void main(String[] args) {
		
		// String pool stores the same literal strings in the same address
		// therefore, they are the same object
		System.out.println("a "+ ("String" == "String"));
		
		// These are the same object too, as both references point to the same object
		String mew = "Mew";
		String mewtwo = mew;
		System.out.println("b " + (mew == mewtwo));

		// But THIS way, we explicitly create another object, which doesn't use String pool 
		// - So, not the same objects now
		mewtwo = new String("Mew");
		System.out.println("c " + (mew == mewtwo));
		
		// If the second object received "Mew", it would print true, but concat() returns another object
		mew = "Mew";
		mewtwo = "M".concat("ew");
		System.out.println("d " + (mew == mewtwo));
		
		// You can use equals() to check if the CONTENT is the same
		System.out.println("e " + (mew.equals(mewtwo)) );
		
		
		/* "BONUS": more hard cases (Enthuware etc)
		 */
	    String hello = "Hello", lo = "lo", abc = "abc";
	    
	    /* two String references with same literals poitn to the 
	     * same object on String pool 	 					  */
		System.out.print("1" + (chapter3.StringBuilderUse.abc == abc) + " ");    
		
		// The same goes with concatenating literals
		System.out.print("2" + (hello == ("Hel"+"lo")) + " ");
		
		/* HOWEVER, it's not valid when concatenating variables
		 * (unless it's a constant/final)					 */
		System.out.print("3" + (hello == ("Hel"+lo)) + " ");		 // false
		final String fLo = "lo";
		System.out.print("4" + (hello == ("Hel"+fLo)) + " ");
		
		/* But there's a method which forces JVM to lookup on the 
		 * String Pool - which is intern(). Then, it returns true
		 * even using a variable.							   */
		System.out.println("5" + (hello == ("Hel"+lo).intern()) );
		
	}

}
