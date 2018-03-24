
public class BankAccount {
	int accountNumber;
	String owner;
	int balance;
	
	void deposit(int amount) {
		balance += amount; 
	}
	void withdraw(int amount) {
		balance -= amount; 
	}
	public String toString() {
		return "현재 잔액은" + balance + "입니다.";
	}
	public static void main(String[] args) {
		BankAccount myAccount1 = new BankAccount();
		BankAccount myAccount2 = new BankAccount();
		myAccount1.deposit(10000);
		System.out.println("myAccount1 : " +myAccount1);
		myAccount1.withdraw(8000);
		System.out.println("myAccount1 : " +myAccount1);
		System.out.println("myAccount2 : " +myAccount2);
		int b = myAccount1.transfer(100,myAccount2);
		myAccount1.withdraw(b);
		System.out.println("myAccount1 : " +myAccount1);
		System.out.println("myAccount2 : " +myAccount2);
	}

}
