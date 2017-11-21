package chapter2;

public class ForLoops {

	public static void main(String[] args) {
		/*
		 * Common FOR loop:
		 */
		int i;
		int j;
		for (i = 3, j = 0; j < i; ++j, i--){
			/* Before the loop ends, the increments/decrements will not 
			 * be ran. The new values will be on the next iteration. */
			System.out.println(i + " " + j);
		}
		System.out.println("out: "+ i + " " + j);
		
		
		/* enhanced for loop
		 */
		String[] strs = {"uno", "dos", "tré"};
		for (String s : strs) {
			System.out.print(s + "! ");
		}
		// p.s.: when there's only one statement, braces aren't required
	}

}
