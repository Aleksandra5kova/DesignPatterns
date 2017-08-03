package creational.factory.example0;

public class Male extends Person {

	public Male(String name) {
		setName(name);
	}

	@Override
	void sayHello() {
		System.out.println("Hello Mr." + getName());
	}

}
