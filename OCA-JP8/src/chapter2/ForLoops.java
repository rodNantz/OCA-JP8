package chapter2;

public class ForLoops {

	public static void main(String[] args) {
		/*
		 * Common FOR loop:
		 */
		boolean begin = false;
		int i;
		int j;
		for (i = 3, j = 0, begin = true; // initialize
										 j < i; // while condition
												++j, i--) // increment afterwards 
		{				
			/* The first statements will run before the loop 
			 * starts.
			 */
			if (begin) {
				System.out.println("begin");
				begin = false;
			}
			
			System.out.println(i + " " + j);
			/* Before the loop ends, the increments/decrements will not 
			 * be ran. The new values will be on the next iteration. */
		}
		System.out.println("out: "+ i + " " + j);
		
		
		
		/* enhanced for loop
		 */
		String[] strs = {"uno", "dos", "tr�"};
		for (String s : strs) {
			System.out.print(s + "! ");
		}
		// p.s.: when there's only one statement, braces aren't required
	}

}
