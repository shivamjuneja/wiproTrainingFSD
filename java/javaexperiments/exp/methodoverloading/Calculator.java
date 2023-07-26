package exp.methodoverloading;


/**
 * @author Vineet
 */
public class Calculator {


    /**
     * does sum of num1  and num2 and then return result
     *
     * @param num1
     * @param num2
     * @return result of num1+ num2
     */
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }


    public int add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }

    public String add(String num1, String num2) {
        String result = num1 + num2;
        return result;
    }

    public double sub(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

}
