import java.util.*;

public class Test {

	int num;

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public static void main(String[] args) {
		Test test = new Test();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� :");
		test.setNum(scan.nextInt());
		
		if (test.getNum() % 2 == 0){
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
}