package entities;

public class Company extends Employee{
	private Integer employee;
	
	public Company() {
	}
	
	public Company(String name, Double income, Integer employee) {
		super(name, income);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	@Override
	public double calcTax() {
		if(employee<=10) {
			return getIncome() * 0.16;
		}else {
			return getIncome() * 0.14;
		}
	}
}
