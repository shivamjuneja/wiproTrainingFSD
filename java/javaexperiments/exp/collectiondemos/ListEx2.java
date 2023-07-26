package exp.collectiondemos;

import java.util.*;

public class ListEx2 {
	
	public static void main(String args[]) {
		ListEx2 demo=new ListEx2();
		List<String> fruits=new LinkedList<>();
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add(0,"grapes");
	    String fruitAtIndex2 =fruits.get(2);
	    System.out.println("element at index 2 "+fruitAtIndex2);
	    System.out.println("display all elements");
	    demo.display(fruits);
	    System.out.println("remove element");
	    fruits.remove(1);
	    fruits.remove("apple");
	    System.out.println("after removing elements");
	    demo.display(fruits);
	    
	}
	
	void display(Collection<String>fruits) {
		for(String iterated:fruits) {
	    	System.out.println("fruit="+iterated);
	    }
	    
	}
	

}
