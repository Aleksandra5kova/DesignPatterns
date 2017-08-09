package creational.prototype.example2;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private List<String> empList;

	public Employee() {
		empList = new ArrayList<>();
	}

	public Employee(List<String> empList) {
		super();
		this.empList = empList;
	}

	public List<String> getEmpList() {
		return empList;
	}

	public void loadData() {
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
