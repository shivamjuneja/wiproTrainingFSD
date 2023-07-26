package exp.jdk8newfeatures;

public class CalculatorMain {

    public static void main(String args[]){
        ICalculator calculator=new CasioCalculator();
        int addResult=calculator.add(2,3);
        int subResult=calculator.sub(7,4);
        System.out.println("add ="+addResult+" sub result="+subResult);
    }
}
