import java.io.*;
import java.net.*;
import java.util.*;

public class Test5 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9100);
		try {
			while (true) {
				Socket socket = ss.accept();
				try {
					PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
					printWriter.println(new Date().toString());
				} finally {
					socket.close();
				}
			}
		} finally {
			ss.close();
		}

	}

}
