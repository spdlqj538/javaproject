import java.net.*;

public class Test {

	public static void main(String[] args) {
		String hostname = "www.nexon.com";

		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP �ּҴ�" + address.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("IP �ּҸ� ã�� �� �����ϴ�.");
		}

	}

}
