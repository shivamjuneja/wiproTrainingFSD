package exp.identityequalitydemos;

public class StudentMain {

	public static void main(String[] args) {
		   Student student1=new Student(1,"somnath");
           Student student2=new Student(1,"somnath");
           boolean isSame=student1==student2;
           boolean isEqual=student1.equals(student2);
           System.out.println("is same="+isSame);
           System.out.println("is equals="+isEqual);
	}

}
