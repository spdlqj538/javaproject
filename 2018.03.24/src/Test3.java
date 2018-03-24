class Test3 {

	public static void main(String[] args) {
		Test p = new Test();
		p.sub();
	}
	void sub() {
		boolean b1 = false;
		set(b1);
		System.out.println(b1);
	}
	void set(boolean b1) {
		b1 = true;
	}
}
