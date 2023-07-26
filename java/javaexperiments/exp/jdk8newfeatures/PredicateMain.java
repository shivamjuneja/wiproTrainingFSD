package exp.jdk8newfeatures;

import java.util.function.*;

public class PredicateMain {
	public static void main(String args[]) {
         IEven predicate1=(num)->num%2==0;
         boolean result1=predicate1.isEven(10);
         System.out.println("predicate result1="+result1);
       
         Predicate<Integer>predicate2=(num)->num%2==0;
         boolean result2=predicate2.test(12);
         System.out.println("predicate result2="+result2);

	}
}
