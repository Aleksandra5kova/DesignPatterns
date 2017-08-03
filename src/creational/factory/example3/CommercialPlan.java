package creational.factory.example3;

public class CommercialPlan extends Plan {

	public CommercialPlan() {
		setRate();
	}
	
	@Override
	protected void setRate() {
		rate = 7.5;
	}

}
