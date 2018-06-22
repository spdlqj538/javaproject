import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

class FrServer extends JFrame {
	JTextArea ta;
	JTextField tf;

	public FrServer() {
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("채팅방 서버!");
		setLayout(new BorderLayout());

		JLabel label = new JLabel("This is a server!");
		ta = new JTextArea(25, 40);
		tf = new JTextField(25);

		add(label, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		setVisible(true);
	}
}

public class GuiMultiChat_TcpServer {
	HashMap clients;

	GuiMultiChat_TcpServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}

	public static void main(String args[]) {
		FrServer f = new FrServer();
		new GuiMultiChat_TcpServer().start();
	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");

			while (true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + "]" + "에서 접속하셨습니다.");

				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();

				System.out.println("쓰레드 네임 :" + thread.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();

		while (it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(msg);
			} catch (IOException e) {
				System.out.println("sendToAll 입출력 에러");
			}
		}
	}

	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("서버 리시버 소켓 IO 에러");
			}
		}

		public void run() {
			String name = "";

			try {
				name = in.readUTF();
				sendToAll("#" + name + "님이 들어오셨습니다.");

				clients.put(name, out);
				System.out.println("현재 접속자수는" + clients.size() + "입니다.");
				System.out.print("현재 접속자 목록 :");

				while (in != null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				System.out.println("리시버 도중 io 에러");
			} finally {
				sendToAll("#" + name + "님이 나가셨습니다.");
				clients.remove(name);
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "] 에서 접속을 종료함");
				System.out.println("현재 접속자 수는" + clients.size() + "입니다.");
			}
		}
	}
}
