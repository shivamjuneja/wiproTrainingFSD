package exp.genericdemos;

public class StoreMain {

	public static void main(String[] args) {
     Store<Integer> store=new Store<>();
     store.add(79);
     Integer value =store.getValue();
     System.out.println("value="+value); 
	}

}
