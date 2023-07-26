package exp.jdk8newfeatures;

public class LambdaEx1 {
	
	public static void main(String args[]) {
		ICalculator calculator1=(num1,num2)->num1-num2;
		int addResult=calculator1.add(3, 4);
		int subResult=calculator1.sub(5, 2);
		System.out.println("add ="+addResult);
		System.out.println("sub="+subResult);
		
		ICalculator calculator2=(num1,num2)->{
			System.out.println("inside calcuator 2 sub");
			int result=num1-num2;
			return result;
		};
		
		int subResult2=calculator2.sub(5, 2);		
		System.out.println("sub="+subResult2);
			
	}

}
