package exp.jdk8newfeatures;

import java.util.function.*;

public class BiPredicateMain {
	public static void main(String args[]) {
		ISumEven predicate1 = (num1, num2) -> (num1 + num2) % 2 == 0;
		boolean result1 = predicate1.isEven(3, 4);
		System.out.println("result1=" + result1);

		BiPredicate<Integer, Integer> predicate2=(num1, num2) -> (num1 + num2) % 2 == 0;
		boolean result2=predicate2.test(6, 8);
		System.out.println("result2=" + result2);

	    
	}
}
