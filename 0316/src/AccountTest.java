import java.util.*;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("�̸� :");
		obj.setName(scan.next());
		
		System.out.println("�ܾ� :");
		obj.setBalance(scan.nextInt());

		System.out.println("�̸���" + obj.getName() + "\n���� �ܰ��" + obj.getBalance() + "�Դϴ�.");
		
	}

}
