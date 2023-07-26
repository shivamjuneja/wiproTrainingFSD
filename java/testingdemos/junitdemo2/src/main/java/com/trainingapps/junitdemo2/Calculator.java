package com.trainingapps.junitdemo2;

public class Calculator {

    private Adder adder;

    public Calculator() {
    }

    public Calculator(Adder adder) {
        this.adder = adder;
    }

    public int addBy10(int num) {
        System.out.println("***inside add by 10");
        int result = adder.add(num, 10);
        return result;
    }

    public int multiply(int num1, int num2) {
        System.out.println("**inside multiply");
        return num1 * num2;
    }

    public int multiplyBy10(int num) {
        System.out.println("**inside multiplyBy10");
        int result = multiply(num, 10);
        return result;
    }

}
