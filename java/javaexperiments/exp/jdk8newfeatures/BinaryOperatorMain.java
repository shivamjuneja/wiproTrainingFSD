package exp.jdk8newfeatures;

import java.util.function.*;

public class BinaryOperatorMain {

	public static void main(String args[]) {
		IAdder adder1=(num1,num2)->num1+num2;
		int result1=adder1.add(5, 6);
		System.out.println("result1="+result1);

		BinaryOperator<Integer>adder2=(num1,num2)->num1+num2;
		int result2=adder2.apply(7, 8);
		System.out.println("result2="+result2);

		
	}
	
}
