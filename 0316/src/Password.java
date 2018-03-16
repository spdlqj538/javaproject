import java.util.*;

public class Password {

	public static void main(String[] args) {
		String s;
		String s2;
		String id = "abcdef";
		String pw = "abcd";

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		System.out.println("아이디를 입력 하세요 :");
		s = scan.next();

		System.out.println("비밀번호를 입력 하세요 :");
		s2 = scan2.next();

		if (s.equalsIgnoreCase(id) && s2.equalsIgnoreCase(pw)) {
			System.out.println("로그인성공");

		} else {
			System.out.println("로그인실패");
		}

	}

}
