package exp.genericdemos;

public class Store<T> {
	private  T value;
	
	public T getValue(){
		return value;
	}
	
	public void add(T val) {
		this.value=val;
	}

}
