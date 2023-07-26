package exp.staticdemo;

public class Employee {
    String name;
    int count;

    public Employee(String name) {
        this.name = name;
        count++;
    }

    public int getCount() {
        return count;

    }

    public static void displayCount(Employee employee) {
        System.out.println("count=" + employee.count);
    }


}
