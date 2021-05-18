package enums;

public enum CustType {
	SILVER(500) , GOLD(1000), PLATINUM(1500);

	private int minBalance;

	private CustType(int minBalance) {
		this.minBalance = minBalance;
	}

	public int getMinBalance() {
		return minBalance;
	}

	@Override
	public String toString() {
		return "Customer Type: " +name() + " Min Balance: " + getMinBalance();
	}
}
