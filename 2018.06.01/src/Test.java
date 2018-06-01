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
		
		System.out.println("숫자를 입력하세요 :");
		test.setNum(scan.nextInt());
		
		if (test.getNum() % 2 == 0){
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}