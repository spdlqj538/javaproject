import java.io.*;
import java.net.*;

public class Test6 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 9100);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String res = input.readLine();
		System.out.println(res);
		System.exit(0);

	}

}
