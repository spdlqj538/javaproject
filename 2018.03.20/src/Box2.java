
public class Box2 {
	int width, length, height;

	Box2(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	}

	boolean isSameBox(Box2 obj) {
		if ((obj.width == width) & (obj.length == length) & (obj.height == height)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Box2 obj1 = new Box2(10, 20, 50);
		Box2 obj2 = new Box2(10, 20, 50);

		System.out.println("obj == obj2 :" + obj1.isSameBox(obj2));
	}

}