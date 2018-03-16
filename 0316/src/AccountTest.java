import java.util.*;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		Scanner scan = new Scanner(System.in);
		
		obj.setName("Tom");
		System.out.println("잔액 :");
		obj.setBalance(scan.nextInt());

		System.out.println("이름은" + obj.getName() + "\n통장 잔고는" + obj.getBalance() + "입니다.");
	}

}
