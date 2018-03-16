import java.util.*;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("이름 :");
		obj.setName(scan.next());
		
		System.out.println("잔액 :");
		obj.setBalance(scan.nextInt());

		System.out.println("이름은" + obj.getName() + "\n통장 잔고는" + obj.getBalance() + "입니다.");
		
	}

}
