package seungho;

public class Television5Test {

	public static void main(String[] args) {
		Television5 myTv = new Television5();
		myTv.setChannel(11);
		int ch = myTv.getChannel();
		System.out.println("현재 채널은" + ch + "입니다." );

	}

}
