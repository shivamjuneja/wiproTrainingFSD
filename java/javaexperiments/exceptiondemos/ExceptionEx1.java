package exceptiondemos;

public class ExceptionEx1 {

	public static void main(String args[]) {
		ExceptionEx1 demo = new ExceptionEx1();
		Customer customer = demo.fetchCustomerDetails();
		System.out.println("about to display customer");
		demo.display(customer);
		System.out.println("after display finished");
		System.out.println("bye, exiting now");
	}

	Customer fetchCustomerDetails() {
		Customer customer = null;
		return customer;
	}

	void display(Customer customer) {
		try {
			System.out.println("customer details " + customer.getId() + " " + customer.getName());
			System.out.println("customer displayed");
		} catch (NullPointerException e) {
			System.out.println("customer arg is null");
		}
	}

}
