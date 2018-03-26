
public class BankAccount {
	private String name;
	private int number, balance, rate;

	public String getName() {
		return name;
	}

	public void setName(String nm) {
		this.name = nm;
	}

	public int getNumber() {
		return number;
	}

	public void getNumber(int n) {
		this.number = n;
	}

	public int getBalance() {
		return balance;
	}

	public void getBalance(int b) {
		this.balance = b;
	}

	public int getRate() {
		return rate;
	}

	public void getRate(int r) {
		this.rate = r;
	}

	public BankAccount() {

	}

	public BankAccount(int n, int b, int r, String nm) {
		name = nm;
		number = n;
		balance = b;
		rate = r;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
}