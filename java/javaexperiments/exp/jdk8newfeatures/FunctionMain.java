package exp.jdk8newfeatures;


import java.util.function.*;

public class FunctionMain {

	public static void main(String[] args) {
		IIntegerConverter converter1=(input)->Integer.parseInt(input);
		String input1="100";
		int value1=converter1.convert(input1);
		System.out.println("integer value="+value1);

		Function<String,Integer>converter2=(input)->Integer.parseInt(input);
		String input2="50";
		int value2=converter2.apply(input2);
		System.out.println("integer value="+value2);

	}

}
