package exp.jdk8newfeatures;

public class AnonymousClassExample {
	
	public static void main(String args[]) {
		ICalculator calculator=new ICalculator() {
			@Override
			public int sub (int num1, int num2) {
				return num1-num2;
			}			
			
		};
		int addResult=calculator.add(3, 4);
		int subResult=calculator.sub(5, 2);
		System.out.println("add ="+addResult);
		System.out.println("sub="+subResult); 
		
		
	}

}
