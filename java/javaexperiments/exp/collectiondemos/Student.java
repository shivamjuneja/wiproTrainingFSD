package exp.collectiondemos;

public class Student {

	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * Student student1=new Student(1,"somnath"); Student student2=new
	 * Student(2,"somnath") boolean isEqual=student1.equals(student2);
	 */
	@Override
	public boolean equals(Object arg) {
		if (this == arg) {
			return true;
		}
		if (arg == null || !(arg instanceof Student)) {
			return false;
		}

		Student that = (Student) arg;
		return this.id == that.id;
	}

	/**
	 * if two objects are equal, they should have same hashcode if two objects have
	 * different hashcode, they should not be equal if two objects have same
	 * hashcode , the objects may be or may not be equal
	 */
	@Override
	public int hashCode() {
		return id;
	}

}
