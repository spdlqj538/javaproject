
public class Television {
	private int channel;
	private int volume;
	private boolean onOff;

	Television(int c, int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}

	void print() {
		System.out.println("ä����" + channel + "�̰� ������" + volume + " �Դϴ�.");
	}

	public static void main(String[] args) {
		Television mytv = new Television(7,10,true);
		mytv.print();
		Television youtv = new Television(11,20,true);
		youtv.print();
	}

}
