package chapter2;

public class ArithmOperatorsNumericPromotion {

	public static void main(String[] args) {

		Object obj;
		
		/*
		 * 1. If two values have different types, the less-wide 
		 * type will be cast to the widest type.
		 */
		
		short s = 1;
		long l = 10;
		obj = (s+l);
		System.out.println( valType(s) + " + " + valType(l) + " = " + valType(obj) );
		
		/*
		 * 2. If one of the values is integral and the other is floating-point,  
		 * the integral will be promoted to floating point 
		 */
		
		int i = 10;
		float f = 10.0f;
		obj = (i+f);
		System.out.println( valType(i) + " + " + valType(f) + " = " + valType(obj) );
		
		/*
		 * 3. Smaller data types - byte, short and char, are first promoted
		 * to INT when using a Java binary arithmetic operator. 
		 */

		byte b = 0b10;	// 2 on binary literal
		s = 0x1;		// 1 in hexadecimal
		char c = 'Z';	// 90
		obj = (b+s+c);
		System.out.println( valType(b) + " + " + valType(s) + " + " + valType(c) + " = " + valType(obj) );
		
		s = 10;
		short s2 = 3;
		obj = (s / s2);
		System.out.println( valType(s) + " / " + valType(s2) + " = " + valType(obj) );
		
		/*
		 * 4. After all promotions, resulting type will be the same of
		 * the promoted operands
		 */
		
		
		/*
		 * Extra: hexadecimal literals
		 */
		
		b = 0xF;
		s = 0xF;
		c = 0xF;
		i = 0xF;
		l = 0xF;
		f = 0xF;
		double d = 0xF;
		
		printe(b,s,c,i,l,f,d);
		
	}

	static String valType(Object obj){
		return obj.toString() + " (" + obj.getClass().getName() + ")"; 
	}
	
	static void printe(Object... wuts){
		for(Object wut : wuts){
			System.out.print(wut.getClass().getName() + ": " + wut + "\t");
		}
		System.out.println();
	}
	
}
