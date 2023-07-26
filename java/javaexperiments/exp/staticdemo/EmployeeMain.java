package exp.staticdemo;

public class EmployeeMain {

    public static void main(String args[]){
        Employee emp1=new Employee("mohit");
        Employee emp2=new Employee("sourav");
        Employee emp3=new Employee("somnath");
        Employee.displayCount(emp3);

        EmployeeMain demo=new EmployeeMain();
        demo.display(emp3);


    }

    void display(Employee employee){
        System.out.println("employee "+employee.name );


    }

}
