package exp.stringdemo;

public class StringBufferEx {

    public static void main(String[] args) {
        StringBuffer result = new StringBuffer();
        for (int i = 1; i <= 10; i++) {
            result.append(i);
        }
        String resultString = result.toString();
        System.out.println("result=" + resultString);

        StringBuffer builder1 = new StringBuffer("ok");
        builder1.append("hi").append("hello");
        System.out.println("builder1=" + builder1);

        String original="hello";
        StringBuffer builder3=new StringBuffer(original);
        builder3.reverse();
        String reverseString=builder3.toString();
        System.out.println("reversestring="+reverseString);

    }
}
