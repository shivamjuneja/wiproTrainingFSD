package exp.jdk8newfeatures;

import java.util.function.*;

public class BiFunctionEx {

	public static void main(String args[]) {
		ISubString substringer=(input,position)->{
			String result=input.substring(position);
			return result;
		};
		String substring1=substringer.substring("goodevening", 4);
	    System.out.println("substring 1="+substring1); 
	    
	    BiFunction<String,Integer,String>substringer2=(input,position)->{
			String result=input.substring(position);
			return result;
		};
		String substring2=substringer2.apply("goodevening", 6);
		System.out.println("substring 2="+substring2); 
	    
	    
	}
	
}
