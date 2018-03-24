class Outer {
	class Inner {
	}
}

class Test6 {

	public static void main(String[] args) {
		Outer f = new Outer();
		Outer.Inner b =f.new Inner();
	}

}
