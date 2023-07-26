package exp.empms;

public class EmployeeMain {
    public static void main(String args[]){
        Employee array[]=new Employee[2];
        Employee emp1=new Employee();
        emp1.id=1;
        emp1.name="rupesh";
        emp1.balance=10000;
        emp1.credit(500);

         array[0]=emp1;

        Employee emp2=new Employee();
        emp2.id=2;
        emp2.name="sourav";
        emp2.balance=20000;
        emp2.credit(200);

        array[1]=emp2;


        for(int i=0;i<array.length;i++){
          Employee iterated =array[i];
            int emp1Id=iterated.id;
            String emp1Name=iterated.name;
            double emp1Balance=iterated.balance;
            System.out.println(emp1Id+" "+emp1Name+" "+emp1Balance);
        }

    }
}
