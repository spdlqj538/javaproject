
class A {
	public void a(int x) {}
}

class B extends A {

	public static void main(String[] args) {
		A a = new B();
		System.out.println("����Ϸ�");
	}

}
//�� : Ŭ���� A�� �⺻ �����ڰ� ���� ������ ������ ������ �߻��Ѵ�. Ŭ����  B�� �⺻ �����ڰ�  Ŭ���� A�� �⺻ �����ڸ� ȣ���Ѵ�.