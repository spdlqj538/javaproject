
public class Mycounter {
	int counter;
	Mycounter() {
		counter = 1;
	}

	public static void main(String[] args) {
		Mycounter obj1 = new Mycounter();
		Mycounter obj2 = new Mycounter();
		System.out.println("��ü 1�� counter = " + obj1.counter);
		System.out.println("��ü 2�� counter = " + obj2.counter);

	}

}
