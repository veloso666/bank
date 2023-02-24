package entities;

public final class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestate) {
		super(number, holder, balance);
		this.interestRate = interestate;
	}

	public Double getInterestate() {
		return interestRate;
	}

	public void setInterestate(Double interestate) {
		this.interestRate = interestate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	
}
