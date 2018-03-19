
public class Rectangle {
	private int x,y;
	private int width, height;
	
	Rectangle() {
		this(0,0,1,1);
	}
	
	Rectangle(int width, int hegiht) {
		this(0,0,width,hegiht);
	}
	
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
}
