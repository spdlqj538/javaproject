
public class Point {
	private int x,y;
	public  Point(int x, int y) {
		x = x;
		y = y;
	}
}
// 생성자 Point()는 값을 반환하지 않는다, 따라서  void를 삭제한다.

public class MyMath {
	public int getRandom() {
		return (int)Math.random();
	}
	public double getRandom() {
		return Math.random();
	}
}
// 메소드의 반환형이 다르다고 해서 메소드를 중복시킬 수 있는 것은 아니다.

public class MyClass{
	private String gerName() {
		return "MyClass";
	}
	public static String getClassName() {
		return getName;
	}
}
// 정적 메소드 getStringName()에서 인스턴트 메소드 getName()을  호출할 수 없다.