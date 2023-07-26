package exp.inheritancedemo;

public class DemoMain {
    public static void main(String args[]) {
        Student student1 = new CseStudent(1, "mohit", "java");
        Student student2 = new EceStudent(2, "arghya", "multimeter");

        Student students[] = new Student[2];
        students[0] = student1;
        students[1] = student2;



        for (Student student : students) {
            System.out.println(student.getId() + " " + student.getName());
            boolean isEceStudent = student instanceof EceStudent;
            if (isEceStudent) {
                EceStudent eceStudent = (EceStudent) student;
                System.out.println(eceStudent.getDevice());
            }

            boolean isCseStudent = student instanceof CseStudent;
            if (isCseStudent) {
                CseStudent cseStudent = (CseStudent) student;
                System.out.println(cseStudent.getLanguageUsed());
            }
        }

    }
}
