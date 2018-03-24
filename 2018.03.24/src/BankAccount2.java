
	public class BankAccount2 {
		private String ownerName;
		private int accountNumber;
		private int balance;
		private double rate;

		public String getOwnerName() {
			return ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public int getAccountNumber() {
			return AccountNumber;
		}

		public void setAccountNumber(int AccountNumber) {
			this.AccountNumber = AccountNumber;
		}

		public int getBalance() {
			return Balance;
		}

		public void setBalance(int Balance) {
			this.Balance = Balance;
		}

		public double getRate() {
			return Rate;
		}

		public void setRate(double Rate) {
			this.Rate = Rate;
		}

		public BankAccount2() {}
		
		public BankAccount2(String n, int a, int b, double r) {
			ownerName = n;
			accountNumber = a;
			balance = b;
			rate = r;
		}

}
