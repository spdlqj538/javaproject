
public class Box {
	private int width, height, length;
	private boolean empty;

	public int getWidth() {
		return width;
	}

	public void setWidth(int w) {
		this.width = w;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int h) {
		this.height = h;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int l) {
		this.length = l;
	}

	public Box() {
		width = 0;
		height = 0;
		length = 0;
		empty = false;
	}

	public Box(int w, int h, int l) {
		width = w;
		height = h;
		length = l;
		empty = true;
	}

}
