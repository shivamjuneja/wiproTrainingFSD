package exp.stringdemo;

public class StringBuilderEx {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append(i);
        }
        String resultString = result.toString();
        System.out.println("result=" + resultString);

        StringBuilder builder1 = new StringBuilder("ok");
        builder1.append("hi").append("hello");
        System.out.println("builder1=" + builder1);

        String original="hello";
        StringBuilder builder3=new StringBuilder(original);
        builder3.reverse();
        String reverseString=builder3.toString();
        System.out.println("reversestring="+reverseString);

    }
}
