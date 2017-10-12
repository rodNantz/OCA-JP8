package chapter3;

public class StringBuilderUse {

	public static void main(String[] args) {
		
		/*
		 * Objects A and B are the same, as we make B receive object A. 
		 */
		
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		/*
		 * To create a different object, you must use the new() constructor
		 */
		b = new StringBuilder().append(a).reverse();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//you can also create StringBuilder specifying expected size/capacity of object
		StringBuilder x = new StringBuilder(35);
		x.append("itaquaquecetuba de pinhamonhangaba");
		x.insert(15, "batata");
		int i = x.indexOf("batata");
		
		System.out.println(i + " x = " + x);
	}

}
