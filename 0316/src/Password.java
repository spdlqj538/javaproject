import java.util.*;

public class Password {

	public static void main(String[] args) {
		String s;
		String s2;
		String id = "abcdef";
		String pw = "abcd";

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		System.out.println("���̵� �Է� �ϼ��� :");
		s = scan.next();

		System.out.println("��й�ȣ�� �Է� �ϼ��� :");
		s2 = scan2.next();

		if (s.equalsIgnoreCase(id) && s2.equalsIgnoreCase(pw)) {
			System.out.println("�α��μ���");

		} else {
			System.out.println("�α��ν���");
		}

	}

}
