package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WrappersAndAutoboxing {

	public static void main(String[] args) {
		
		/* When you need to add a Wrapper type of a primitive,
		 * like a Integer, Double etc and passes but only
		 * passes a primitive, Java converts it to you.
		 */
		int i = 20;
		List<Integer> iList = new ArrayList<>();
		iList.add(i); 	// int to Integer
		
		int j = iList.get(iList.indexOf(i));
		Integer h = iList.get(iList.indexOf(i));
		System.out.println(i +", "+ j +", "+ h);
		iList.clear();
		
		
		/*
		 *  An issue with autoboxing and ArrayList   
		 */
		iList.addAll(  Arrays.asList( new Integer[] {4,3,2,1,0} )  );
		ArrayList<Integer> iList2 = new ArrayList<>(iList);
		
		System.out.println("\niList: "+ iList);
		System.out.println("iList.remove(0);");
		iList.remove(0);	
		System.out.println("iList: "+ iList);
		
		System.out.println("\niList2: "+ iList2);
		System.out.println("iList2.remove(new Integer(0));");
		iList2.remove(new Integer(0));
		System.out.println("iList2: "+ iList2);
		
		
		/* We also can convert from String to Wrapper class
		 * or even to primitive type.
		 */
		String sNumber = "123";
		int izin = Integer.parseInt(sNumber);
		Integer izao = Integer.valueOf(sNumber);
		// inverting both works due to autoboxing.
		
		/* COMPARISON OPERATOR == WARNING
		 * Wrappers are still reference types - comparing
		 * two of them will result in FALSE.
		 */
		Integer w1 = 1;
		Integer wOne = new Integer(1);
		System.out.println("\nInteger wrappers comparison: " + (w1 == wOne) );
		
		// If you compare an Wrapper with a primitive, the result will be the expected.
		int p = 1;
		System.out.println("Int Wrapper n' primitive comparison: " + (w1 == p) );
		
		// 
		byte b = 1;
		Byte wb = 1;
		System.out.println("Prim. byte and Wp Integer: " + (w1 == b) );
		// Wrapper Integer and Wrapper Byte compare: will not compile
		// System.out.println("\nWp Integer and Wp byte: " + (w1 == wb) );
		
	}

}
