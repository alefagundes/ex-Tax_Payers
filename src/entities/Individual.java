package entities;

public class Individual extends Employee {

	private Double health;

	public Individual() {
	}

	public Individual(String name, Double income, Double health) {
		super(name, income);
		this.health = health;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth_ex(double health) {
		this.health = health;
	}

	@Override
	public double calcTax() {
		if(getIncome()<20000.00) {
			return getIncome()*0.15 - health * 0.5;
		}else {
			return getIncome()*0.25 - health * 0.5;
		}
	}
}