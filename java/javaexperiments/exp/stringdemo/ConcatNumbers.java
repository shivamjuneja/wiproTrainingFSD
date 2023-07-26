package exp.stringdemo;

public class ConcatNumbers {
	public static void main(String args[]) {

		StringBuilder builder1=new StringBuilder();
	    for(int i=0;i<=10;i++) {
	    	builder1.append(i);
	    }
	    String str1=builder1.toString();
	    System.out.println(str1);
	    
	    StringBuilder builder2=new StringBuilder();
	    builder2.append("hi").append("hello").append("good");
	    String str2=builder2.toString();
	    System.out.println(str2);
	    
	}

}
