package creational.singleton.example4;

public class MiniStatement implements StatementType {

	@Override
	public String print() {
		System.out.println("Mini Statement Created.");
		return "MiniStatement";
	}

}
