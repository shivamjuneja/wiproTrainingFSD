package exp.jdk8newfeatures;

import java.util.function.*;

public class UnaryOperatorMain {

	public static void main(String[] args) {
     ISquare operator1=(num)->num*num;
     int result1=operator1.square(5);
     System.out.println("result1="+result1);
     
     UnaryOperator<Integer>operator2=(num)->num*num;
	 int result2=operator2.apply(6);	
	 System.out.println("result2="+result2);
	 
	 Function<Integer,Integer> operator3=(num)->num*num;
	 int result3=operator3.apply(7);	
	 System.out.println("result3="+result3);
	}

}
