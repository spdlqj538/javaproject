import java.util.*;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		Scanner scan = new Scanner(System.in);
		
		obj.setName("Tom");
		System.out.println("�ܾ� :");
		obj.setBalance(scan.nextInt());

		System.out.println("�̸���" + obj.getName() + "\n���� �ܰ��" + obj.getBalance() + "�Դϴ�.");
	}

}
