package creational.factory.example0;

public class Female extends Person {

	public Female(String name) {
		setName(name);
	}
	
	@Override
	void sayHello() {
		System.out.println("Hello Ms." + getName());
	}

}
