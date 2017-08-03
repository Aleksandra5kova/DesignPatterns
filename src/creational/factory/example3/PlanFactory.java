package creational.factory.example3;

public class PlanFactory {

	public Plan getPlan(String planType) {

		if (planType.equalsIgnoreCase("DOMESTIC")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIAL")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("INSTITUTIONAL")) {
			return new InstitutionalPlan();
		}
		throw new IllegalArgumentException("There is no such plan type.");
	}

}
