package exp.collectiondemos;

import java.util.*;

public class AgeComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
	 int compareVal=s1.getAge()-s2.getAge();
	 return compareVal;
     
	}

}
