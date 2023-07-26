package exp.collectiondemos;

import java.util.*;

public class ListEx1 {
	
	public static void main(String args[]) {
		ListEx1 demo=new ListEx1();
		List<String> fruits=new ArrayList<>();
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add(0,"grapes");
		boolean contains=fruits.contains("mango");
		System.out.println("mango in collection="+contains);
	    String fruitAtIndex2 =fruits.get(2);
	    System.out.println("element at index 2 "+fruitAtIndex2);
	    System.out.println("display all elements");
	    demo.display(fruits);
	    System.out.println("remove element");
	    fruits.remove(1);
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
