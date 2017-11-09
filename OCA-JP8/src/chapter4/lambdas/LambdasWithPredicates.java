package chapter4.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class LambdasWithPredicates {
	
	public static void main(String[] args) {		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Kangaroo", true, false));
		animals.add(new Animal("Fish", false,true));	// swims
		animals.add(new Animal("Turtle", false, true));
		animals.add(new Animal("Rabbit", true, false));
		
		print(animals,
				// 'ani' is our animal being tested on a function (that is, if ani contains "a")
				ani -> ani.toString().contains("a")
				);
		
		/*
		 * Some Java libs also take a Lambda!
		 * In this case, it uses Comparator functional interface.
		 */
		System.out.println(animals);
		
		Collections.sort( 
						animals, 
						(Animal a, Animal b) -> a.species.compareTo(b.species) 
						);
		
		// using Streams to print - don't mind about that
		animals.stream().forEach(System.out::println);
	}
	
	/* You don't need to implement simple boolean functional interfaces,
	 * Java already gives you one!
	 */
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal a : animals){
			// checker is the lambda, and "a" is an animal tested on this function  
			if(checker.test(a)){
				System.out.println(a + " ");
			}
		}
	}
	
}
