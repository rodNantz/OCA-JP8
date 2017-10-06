package chapter1;

public class DefaultValues {
	static boolean bul;
	static byte baite;
	static short xorte;
	static char xar;	// '\u0000'
	static int inte;
	static long lougue;
	static float frout;
	static double dobre;
	static String estringueniu = new String();	// Reference type being initialized
	static String referemssia;	// Reference type, Default value is null
	
	public static void main(String[] args) {
		printe(bul,
				baite,
				xorte,
				xar,
				inte,
				lougue,
				frout,
				dobre,
				estringueniu,
				referemssia
				);
		
		int localVar;
		/*
		 * Local variables don't have an defaul value!
		 * So line below wll give and compilation error 
		 */
		// System.err.println(localVar);
	}

	
	static void printe(Object... wuts){
		System.out.println("\n ~ ~ ~ ~ ~ ~ ");
		for(Object wut : wuts){
			System.out.print(wut.getClass().getName());
			System.out.println(": " + wut);
		}
		System.out.print(" ~ ~ ~ ~ ~ ~ \n");
	}

}
