package exp.collectiondemos;

import java.util.*;

public class SetEx3 {

	public static void main(String[] args) {
      Student student1=new Student(1,"arghya",21);
      Student student2=new Student(2,"sourav",22);
      Student student3=new Student(3,"chandan",23);
      AgeComparator ageComparator=new AgeComparator();
       Set<Student>list=new TreeSet<>(ageComparator);
      list.add(student2);
      list.add(student1);
      list.add(student3);
       for(Student student:list) {
    	  System.out.println(student.getName()+" "+student.getAge());
      }
      
	}

}
