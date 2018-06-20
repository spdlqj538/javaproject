import java.net.*;

public class Test {

	public static void main(String[] args) {
		String hostname = "www.nexon.com";

		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP 주소는" + address.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("IP 주소르 찾을 수 없습니다.");
		}

	}

}
