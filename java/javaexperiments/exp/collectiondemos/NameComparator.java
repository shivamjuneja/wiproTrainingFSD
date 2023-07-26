package exp.collectiondemos;

import java.util.*;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		String student1Name=s1.getName();
		String student2Name=s2.getName();
		int compareVal=student1Name.compareTo(student2Name);
		return compareVal;
	}
}
