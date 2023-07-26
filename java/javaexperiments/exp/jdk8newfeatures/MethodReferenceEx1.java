package exp.jdk8newfeatures;

import java.util.*;
import java.util.function.*;

public class MethodReferenceEx1 {

	public static void main(String args[]) {
		CasioCalculator calculator=new CasioCalculator();
		BinaryOperator<Integer>operator1=calculator::sub;
	    int result1=operator1.apply(10, 4);
	    System.out.println("result1="+result1);
	    BinaryOperator<Integer>operator2=calculator::add;
	    int result2=operator2.apply(3,5);
	    System.out.println("result2="+result2);
		  
	    BinaryOperator<Integer>operator3=CasioCalculator::multiply;
	    int result3=operator3.apply(3, 5);
	    System.out.println("result3="+result3);


	    Consumer<String>printer=System.out::println;
	    printer.accept("hello");
	    
	    
	    BiFunction<Integer, String,Student>studentCtrRef=Student::new;
	    Student student=studentCtrRef.apply(1, "sourav");
	    System.out.println("student "+student.getId()+" name="+student.getName());
	    
	    Supplier<ArrayList<String>>arrayListCtrRef=ArrayList::new;
        ArrayList<String>list=arrayListCtrRef.get();
        list.add("hi");
        list.add("hello");
	    
	    System.out.println(list);
	    
	}
	
}
