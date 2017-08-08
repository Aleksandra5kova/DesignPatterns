package creational.singleton.example4;

public class DetailedStatement implements StatementType {

	@Override
	public String print() {
		System.out.println("Detailed Statement Created.");
		return "DetailedStatement";
	}
	
}
