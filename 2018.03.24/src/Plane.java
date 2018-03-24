
public class Plane {
	private int num, p_num;
	private String model;
	private static int planes;

	public Plane(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public Plane() {
		// TODO Auto-generated constructor stub
	}

	public Plane(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	public void setNum(int n) {
		num = n;
	}

	public void setPnum(int pn) {
		P_num = pn;
	}

	public void setModel(String m) {
		model = m;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getPnum() {
		return p_num;
	}
	
	public String getModel() {
		return model;
	}
	
	public static int getPlanes() {
		return planes;
	}
	
	public void plane() {}
	
	public void plane(int n, String m, int pn) {
		num = n;
		p_num = pn;
		model = m;
	}
	
	public String toString() {
		return " ½Äº°¹øÈ£ : " + getNum() + " ¸ðµ¨ : " + getModel() + " ½Â°´¼ö : " + getPnum(); 
	}
	public static void main(String[] args) {

		Plane plane1 = new Plane(1,"aa",200);
		Plane plane2 = new Plane(2,"bb");
		Plane plane3 = new Plane();
		plane1.setPlanes(0);
		plane1.getPlanes();
		plane3.setNum(3);
		plane3.Model("cc");
		plane3.setPnum(150);
	}

	
}
