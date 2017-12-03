
public class SnippetHere {

	public static void main(String[] args) throws Throwable {
		
		System.out.println("for loop");
		final int INT1 = 1, INT2 = 3;
		for (int i=INT1; i<INT2; i++) {
			System.out.println(i);     
		}
		
		System.out.println("while loop");
		int i = INT1; 
		while (i++<INT2) { 
			System.out.println(i); 
		}
		
		
		Game g = new Soccer();		// parent reference, child instance
		g.play();
		/*
		 * Overloaded methods mind the reference, not the instance
		 * - thus, the child method play(String) is not available
		 * when using a parent reference. DO NOT mistake it with
		 * overridden methods, which instance type matters instead.  
		 */
		// g.play("hi");
		
		Soccer gs = new Soccer();
		gs.play();
		gs.play("brazuca");
		
		Soccer s = (Soccer) g;
		s.play();
		s.play("jabulani");
		
	}
}

class Game {
	  public void play() throws Exception   {
	    System.out.println("Playing...");
	  }
	}

	class Soccer extends Game {
	   public void play(String ball)    {
	      System.out.println("Playing Soccer with "+ball);      
	   }
	}
