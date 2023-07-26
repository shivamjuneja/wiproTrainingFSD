package exp.jdk8newfeatures;

import java.util.function.*;

public class BiConsumerMain {

	public static void main(String[] args) {
		IStringMultiply multiplier1=(input,times)->{
			String result="";
			for(int i=0;i<times;i++) {
				result=result+input;
			}
			System.out.println("result="+result);
		};

		multiplier1.multiply("hi", 3);
	    
		BiConsumer<String,Integer>multiplier2=(input,times)->{
			String result="";
			for(int i=0;i<times;i++) {
				result=result+input;
			}
			System.out.println("result="+result);
		};
		multiplier2.accept("hello", 2);
		
		
	}

}
