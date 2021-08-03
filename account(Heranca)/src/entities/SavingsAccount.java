package entities;

public class SavingsAccount extends Account {
	protected Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		this.balance -= amount - 10;
	}
	
	
	
	
	@Override
	public String toString() {
		var sb = new StringBuilder();
		sb.append("\n");
		sb.append("Holder: ");
		sb.append(holder + "\n");
		sb.append("Number: ");
		sb.append(number + "\n");
		sb.append("Actual balance: ");
		sb.append(balance);
		return sb.toString();
				
	}
	
	
}
