package chapter3;

public class StringUsage {

	public static void main(String[] args) {
		
		// String pool stores the same literal strings in the same address
		// therefore, they are the same object
		System.out.println("String" == "String");
		
		// These are the same object too, as both references point to the same object
		String mew = "Mew";
		String mewtwo = mew;
		System.out.println(mew == mewtwo);

		// But THIS way, we explicitly create another object, which doesn't use String pool 
		// - So, not the same objects now
		mewtwo = new String("Mew");
		System.out.println(mew == mewtwo);
		
		// If the second object received "Mew", it would print true, but concat() returns another object
		mew = "Mew";
		mewtwo = "M".concat("ew");
		System.out.println(mew == mewtwo);
		
		// You can use equals() to check if the CONTENT is the same
		System.out.println(mew.equals(mewtwo));
	}

}
