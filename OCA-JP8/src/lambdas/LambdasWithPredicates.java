package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdasWithPredicates {
	
	public static void main(String[] args) {		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Fish", false,true));	// swims
		animals.add(new Animal("Kangaroo", true, false));
		animals.add(new Animal("Rabbit", true, false));
		animals.add(new Animal("Turtle", false, true));
		
		print(animals, 
				a -> a.toString().contains("a")
				);
	}
	
	/* You don't need to implement simple boolean functional interfaces,
	 * Java already gives you one!
	 */
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal a : animals){
			if(checker.test(a)){
				System.out.println(a + " ");
			}
		}
	}

}
