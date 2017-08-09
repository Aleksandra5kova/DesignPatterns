package cloning;

public class Student implements Cloneable {

	int rollno;
	String name;

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("Cloning...");
		return super.clone();
	}

	public static void main(String[] args) {

		try {

			Student s = new Student(101, "alex");
			System.out.println(s.rollno + " " + s.name);

			Student clone = (Student) s.clone();
			System.out.println(clone.rollno + " " + clone.name);

		} catch (CloneNotSupportedException e) {
			System.out.println("ERROR!!!!");
			e.printStackTrace();
		}

	}

}
