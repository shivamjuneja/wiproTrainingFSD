package exp.jdk8newfeatures;

import java.util.function.*;

public class SupplierMain {

	public static void main(String[] args) {
     IGreet greeter1=()->"welcome";
     String msg1=greeter1.greet();
	 System.out.println("msg1="+msg1);
	 
	 IGreet greeter2=()->{
		 String msg="Good evening";
		 return msg;
	 };
	 String msg2=greeter2.greet();
	 System.out.println("msg2="+msg2);
     
	 Supplier<String> greeter3=()->"hello";
	 String msg3=greeter3.get();
	 System.out.println("msg3="+msg3);
     
	 
	}

}
