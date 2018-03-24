
public class Televisiom {
	private String model;
	void setModel(String b) {
		model = b;
	}
	String getModel() {
		return model;
	}
	public static void main(String[] args) {
			Televisiom t = new Televisiom();
			t.setModel("STV-101");
			String b = t.getModel();
	}

}
