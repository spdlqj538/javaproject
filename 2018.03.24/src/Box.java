
public class Box {
	private int width, length, height;
	private boolean empty = false;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void settLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public Box() {
		width = 0;
		length = 0;
		height = 0;
		empty = true;
	}
	
	public Box(int w,int l, int h) {
		width = w;
		length = l;
		height = h;
		empty = true;
	}
}
