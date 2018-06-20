import java.io.*;
import java.net.*;

public class Test3 {

	public static void main(String[] args) throws Exception {
		String website = "https://www.google.co.kr/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjqsIjX_OHbAhWBWbwKHT8DB_cQjRx6BAgBEAU&url=http%3A%2F%2F2proo.net%2F719&psig=AOvVaw0cX0hnPqEfxjq9R78WUrCH&ust=1529574861998220";
		System.out.println("" + website + "사이트에서 이미지를 다운로드합니다.");
		URL url = new URL(website);
		byte[] buffer = new byte[2048];

		try (InputStream in = url.openStream(); OutputStream out = new FileOutputStream("test.jpg");) {
			int length = 0;
			while ((length = in.read(buffer)) != -1) {
				System.out.println("" + length + "바이트 만큼");
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			System.out.println("예외:" + e.getMessage());
		}
	}

}
