package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;

	public BusinessAccount() {
		super();

	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount -10;
		}
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
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
		sb.append(balance + "\n");
		sb.append("Loan Limit: ");
		sb.append(loanLimit);
		return sb.toString();
				
	}

}
