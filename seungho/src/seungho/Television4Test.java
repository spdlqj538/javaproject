package seungho;

public class Television4Test {

	public static void main(String[] args) {
		Television4 myTv = new Television4();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		int ch = myTv.getChannel();
		System.out.println("현재 채널은" + ch + "입니다." );

	}

}
