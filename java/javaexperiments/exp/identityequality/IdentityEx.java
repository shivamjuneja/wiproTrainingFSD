package exp.identityequality;

public class IdentityEx {
	public static void main(String args[]) {
		String str1=new String("hello");
		String str2=str1;
		boolean isSame=str1==str2;
		System.out.println(isSame);
	}

}
