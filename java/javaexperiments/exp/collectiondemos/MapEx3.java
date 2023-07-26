package exp.collectiondemos;

import java.util.*;

public class MapEx3 {

	public static void main(String[] args) {
      Student student1=new Student(1,"arghya",22);
      Student student2=new Student(2,"sourav",21);
      Student student3=new Student(3,"chandan",23);
      IdKeyComparator comparator=new IdKeyComparator();
      Map<Integer,Student>map=new TreeMap<>(comparator);
      map.put(student2.getId(),student2);
      map.put(student1.getId(),student1);
      map.put(student3.getId(),student3);
      Set<Integer>keys=map.keySet();
      
      for(Integer key:keys) {
    	  Student student=map.get(key);
    	  System.out.println("id="+student.getId()+ " name=" +student.getName()+" age="+student.getAge());
      }
      
	}

}
