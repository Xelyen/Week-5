package Notes;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(String firstName, String lastName, double pay) {
		//super refers to class you are inheriting from
		super(firstName, lastName, pay);
	}

	@Override
	public double calculatePay() {
		return this.getPay() * 80;
	}
	
	

}
