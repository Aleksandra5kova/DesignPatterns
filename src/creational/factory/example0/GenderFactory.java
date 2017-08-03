package creational.factory.example0;

public class GenderFactory {

	public Person getPerson(String gender, String name) {

		if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("g")) {
			return new Male(name);
		} else if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f")) {
			return new Female(name);
		}

		throw new IllegalArgumentException("There is no such gender.");
	}

}
