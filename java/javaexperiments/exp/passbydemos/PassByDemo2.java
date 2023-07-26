package exp.passbydemos;

public class PassByDemo2 {

    public static void main(String[] args) {
        Employee employee = new Employee("arghya");
        PassByDemo2 demo = new PassByDemo2();
        demo.display(employee);
        System.out.println("inside main "+employee.name);
    }

    void display(Employee employee) {
        employee.name="sayantan";
        System.out.println("inside display "+employee.name);
    }

}
