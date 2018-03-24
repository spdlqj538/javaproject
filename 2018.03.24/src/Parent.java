
class Parent {
	Parent() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	public static void main(String[] args) {
		new Child();
		new Parent();
	}

}
