package creational.factory.example3;

public class InstitutionalPlan extends Plan {

	public InstitutionalPlan() {
		setRate();
	}
	
	@Override
	protected void setRate() {
		rate = 5.5;
	}

}
