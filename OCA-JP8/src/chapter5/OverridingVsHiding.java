package chapter5;

public class OverridingVsHiding { }

/*
 * INSTANCE
 */

class ShadowMonster {
	protected void move(){
		System.out.println("Wooooooooooofff");
	}
}

class Demogorgon extends ShadowMonster {
	/* Good usage of overriding methods
	 */
	protected void move(){
		System.out.println("Wraaaaaah");
	}
}

class Will extends ShadowMonster {
	/* A static method cannot HIDE an instance method
	 */
	protected static void move(){
		System.out.println("Can't move, It hurts everywhere");
	}
}

/*
 * STATIC
 */

class Boulder {
	protected static void move(){
		System.out.println("Can't move, I'm static");
	}
}

class Rock extends Boulder {
	/* Good usage of hiding methods
	 */
	protected static void move(){
		System.out.println("I'm young and static");
	}
}

class RollingStone extends Boulder {
	/* An instance method cannot OVERRIDE a static method
	 */
	protected void move(){
		System.out.println("I can roll");
	}
}

