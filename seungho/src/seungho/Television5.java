package seungho;

public class Television5 {
	int channel; //ä�ι�ȣ
	int volume; //����
	boolean onOff; //��������
	void print() {
		System.out.println("ä����" + channel + "�̰� ������" + volume + "�Դϴ�.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}

}
