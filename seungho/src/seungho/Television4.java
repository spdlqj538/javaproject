package seungho;

public class Television4 {
	int channel; //채널번호
	int volume; //볼륨
	boolean onOff; //전원상태
	void print() {
		System.out.println("채널은" + channel + "이고 볼륨은" + volume + "입니다.");
	}
	int getChannel() {
		return channel;
	}
}
