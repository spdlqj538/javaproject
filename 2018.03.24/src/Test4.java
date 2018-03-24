class Point {int x; int y;}
public class Test4 {

	public static void main(String[] args) {
		Test4 obj = new Test4();
		obj.sub();
	}
	
	void sub() {
		Point p = new Point();
		p.x = 10;
		p.y = 20;
		set(p);
		System.out.println(p.x+","+p.y);
	}
	
	void set(Point p) {
		p.x = 30;
		p.y = 40;
	}
	
	
}
