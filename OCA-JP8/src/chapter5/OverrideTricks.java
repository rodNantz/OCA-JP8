package chapter5;

class ShadowMonster {
	protected void move(){
		System.out.println("Wooooooooooofff");
	}
}

class DemoDog extends ShadowMonster {
	protected void move(){
		System.out.println("Wraaaaaah");
	}
}

public class OverrideTricks {

	public static void main(String[] args) {
		ShadowMonster shadow = new ShadowMonster();
		shadow.move();
		DemoDog dart = new DemoDog();
		dart.move();
		
		/* This will print the child method, 'cause the 
		 * object type is DemoDog
		 */
		ShadowMonster what = new DemoDog();
		what.move();
	}

}


