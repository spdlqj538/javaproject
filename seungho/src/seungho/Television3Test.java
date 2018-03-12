package seungho;

public class Television3Test {
	
	public static void main(String[] args) {
			Television3 myTv = new Television3();
			myTv.channel = 7;
			myTv.volume = 9;
			myTv.onOff = true;
			myTv.print();
		
			Television3 yourTv = new Television3();
			yourTv.channel = 9;
			yourTv.volume = 12;
			yourTv.onOff = true;
			yourTv.print();
	}

}
