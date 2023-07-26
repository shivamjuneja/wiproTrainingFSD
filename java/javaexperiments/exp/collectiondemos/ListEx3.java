package exp.collectiondemos;

import java.util.*;

public class ListEx3 {

	public static void main(String[] args) {
      Student student1=new Student(1,"arghya",21);
      Student student2=new Student(2,"sourav",22);
      Student student3=new Student(3,"chandan",23);
      List<Student>list=new ArrayList<>();
      list.add(student2);
      list.add(student1);
      list.add(student3);
      AgeComparator ageComparator=new AgeComparator();
      list.sort(ageComparator);
      System.out.println("sort by age");
      for(Student student:list) {
    	  System.out.println(student.getName()+" "+student.getAge());
      }
      System.out.println("sort by name");
      NameComparator nameComparator=new NameComparator();
      list.sort(nameComparator);
      for(Student student:list) {
    	  System.out.println(student.getName()+" "+student.getAge());
      }
      
	}

}
