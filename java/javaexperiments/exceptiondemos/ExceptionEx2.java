package exceptiondemos;

public class ExceptionEx2 {

	private Product store[] = new Product[10];

	private int index;

	public static void main(String args[]) {
		ExceptionEx2 demo = new ExceptionEx2();
		try {
			demo.register("samsung", 10000);
			demo.register("motorolla", 15000);
			demo.register("lg", 20000);
		    
		}
		
		catch (InvalidProductPriceException e) {
			String msg = e.getMessage();
			e.printStackTrace();
			System.out.println(msg);
		
		} catch (InvalidProductNameException e) {
			System.out.println("product name is invalid, Check again");
		} 

		catch (Exception e) {
			System.out.println("something went wrong");
		}
		
		finally {
			demo.closeConnection();  
		}
		
		
		demo.displayAll();
	}
	
	void closeConnection() {
		System.out.println("closing connection");
	}

	public void register(String name, double price) throws InvalidProductNameException {
		if (name == null || name.isEmpty()) {
			InvalidProductNameException e = new InvalidProductNameException("invalid product name=" + name);
			throw e;
		}

		if (price < 0) {
			throw new InvalidProductPriceException("invalid product price " + price);
		}

		Product product = new Product(name, price);
		store[index] = product;
		index++;
	}

	public void displayAll() {
		for (Product product : store) {
			if (product != null) {
				System.out.println(product.getName() + " ," + product.getPrice());
			}
		}

	}

}
