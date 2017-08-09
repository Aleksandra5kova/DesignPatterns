package creational.prototype.example1;

public class Employee implements Prototype {

	private int id;
	private String name, designation, address;
	private double salary;

	public Employee(int id, String name, String designation, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.address = address;
		this.salary = salary;
	}

	public void showRecord() {
		System.out.println(id + "\t" + name + "\t" + designation + "\t\t" + address + "\t" + salary + "\t");
	}

	@Override
	public Prototype getClone() {
		return new Employee(id, name, designation, address, salary);
	}

}
