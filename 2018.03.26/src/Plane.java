
public class Plane {
	public int pnum;
	private static int planes;
	public String company, model;

	public String getModel() {
		return model;
	}

	public void setModel(String m) {
		this.model = m;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pn) {
		this.pnum = pn;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String c) {
		this.company = c;
	}

	private static int getPlanes() {
		return planes;
	}

	public String toString() {
		return "½Â°´¼ö : " + getPnum() + " , ¸ðµ¨¸í : " + getModel() + ", Á¦ÀÛ»ç  :" + getCompany();
	}

	public Plane() {
	}

	public Plane(int pn, String c, String m) {
		pnum = pn;
		model = m;
		company = c;
	}

	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		
	}

}
