package creational.prototype.example2;

import java.util.List;

public class PrototypePatternDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emps = new Employee();
		emps.loadData();

		Employee empsNew1 = (Employee) emps.clone();
		Employee empsNew2 = (Employee) empsNew1.clone();

		List<String> list1 = empsNew1.getEmpList();
		list1.add("John");

		List<String> list2 = empsNew2.getEmpList();
		list2.remove("Pankaj");

		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew1 List: " + list1);
		System.out.println("empsNew2 List: " + list2);

	}

}
