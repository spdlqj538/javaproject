
public class Test5 {
	int s;
	public static void main(String[] args) {
		Test5 p = new Test5();
		p.sub();
	}
	
	void sub() {
		int x = 5;
		setDouble(x);
		System.out.println(x + "");
		System.out.println(s);
	}
	
	void setDouble(int x) {
		x = x*2;
		s = x;
	}

}
