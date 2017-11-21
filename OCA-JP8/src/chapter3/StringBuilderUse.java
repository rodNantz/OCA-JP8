package chapter3;

public class StringBuilderUse {
	public static String abc = "abc"; 
	
	public static void main(String[] args) {	
		/*
		 * Objects A and B are the same, as we make B receive object A. 
		 */
		StringBuilder a = new StringBuilder(abc);
		StringBuilder b = a.append("de");
		b.append("f").append("g");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		/*
		 * To create a different object, you must use the new() constructor
		 */
		b = new StringBuilder().append(a).reverse();
		System.out.println("\na = " + a);
		System.out.println("b = " + b);
		
		//you can also create StringBuilder specifying expected size/capacity of object
		StringBuilder x = new StringBuilder(35);
		x.append("itaquaquecetuba de pinhamonhangaba");
		x.insert(15, "batata".toUpperCase());
		int i = x.indexOf("BATATA");
		
		System.out.println("\n" + i + " x = " + x);
		
		/* sb.substring() ATTENTION
		 * This StringBuildermethod returns a String, and 
		 * DOESN'T MODIFIY the original StringBuilder! 
		 */
		System.out.println("\nsubstring: " + x.substring(15, 21)); // indexes 15 to 20 (21 is exclusive)
		System.out.println(x);
		
	}

}
