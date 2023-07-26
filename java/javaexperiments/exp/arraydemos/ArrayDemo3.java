package exp.arraydemos;


public class ArrayDemo3 {

    public static void main(String[] args) {
        Customer customers[] = new Customer[2];
        Customer customer1 = new Customer("yuvraj", 21);
        Customer customer2 = new Customer("ramya", 22);
        customers[0] = customer1;
        customers[1] = customer2;

        for (int i = 0; i < customers.length; i++) {
            Customer it = customers[i];
            int age=it.getAge();
            String name=it.getName();
            System.out.println("age="+age+" name="+name);
        }

        for( Customer it:customers)
        {
            int age=it.getAge();
            String name=it.getName();
            System.out.println("age="+age+" name="+name);
        }

    }
}
