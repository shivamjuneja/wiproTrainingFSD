package exp.collectiondemos;

import java.util.*;

public class SetEx1 {
	
	public static void main(String args[]) {
		SetEx1 demo=new SetEx1();
		Set<String> fruits=new HashSet<>();
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("apple");
		boolean contains=fruits.contains("mango");
		System.out.println("mango in collection="+contains);
		System.out.println("display all elements");
	    demo.display(fruits);
	    System.out.println("remove element");
	    fruits.remove("apple");
	    System.out.println("after removing elements");
	    demo.display(fruits);
	    
	    int size=fruits.size();
	    System.out.println("size="+size);
	    
	}
	
	void display(Collection<String>fruits) {
		for(String iterated:fruits) {
	    	System.out.println("fruit="+iterated);
	    }
	    
	}
	

}
