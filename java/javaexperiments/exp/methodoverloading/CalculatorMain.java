package exp.methodoverloading;


class CalculatorMain {

    public static void main(String args[]) {

        Calculator calcy = new Calculator();
        int result1 = calcy.add(1, 2);
        int result2 = calcy.add(2, 3, 4);
        String result3 = calcy.add("hi", "hello");
        double subResult1 = calcy.sub(10, 6);
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);
        System.out.println("result3=" + result3);
        System.out.println("sub result=" + subResult1);

    }


}
