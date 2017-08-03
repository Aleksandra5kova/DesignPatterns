package creational.factory.example0;

public abstract class Person {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract void sayHello();

}
