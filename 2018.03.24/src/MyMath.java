
public class Point {
	private int x,y;
	public  Point(int x, int y) {
		x = x;
		y = y;
	}
}
// ������ Point()�� ���� ��ȯ���� �ʴ´�, ����  void�� �����Ѵ�.

public class MyMath {
	public int getRandom() {
		return (int)Math.random();
	}
	public double getRandom() {
		return Math.random();
	}
}
// �޼ҵ��� ��ȯ���� �ٸ��ٰ� �ؼ� �޼ҵ带 �ߺ���ų �� �ִ� ���� �ƴϴ�.

public class MyClass{
	private String gerName() {
		return "MyClass";
	}
	public static String getClassName() {
		return getName;
	}
}
// ���� �޼ҵ� getStringName()���� �ν���Ʈ �޼ҵ� getName()��  ȣ���� �� ����.