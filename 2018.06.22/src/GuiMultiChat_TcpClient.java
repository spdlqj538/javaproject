import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GuiMultiChat_TcpClient {
	static String nick = null;
	static JTextArea area;
	static JTextField field;
	static DataOutputStream out;

	public static void main(String[] args) {
		nick = JOptionPane.showInputDialog("이름을 입력해주세요. :");
		FrClient f = new FrClient(nick);
		Socket socket;
		try {
			String serverIp = "127.0.0.1";
			socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			Thread receiver = new ClientReceiver(socket);
			receiver.start();
			Thread sender = new ClientSender(socket, nick);
			sender.start();
		} catch (ConnectException e) {
			e.printStackTrace();
			System.out.println("접속에러발생");
		} catch (Exception e) {
			System.out.println("에러");
		}
	}

	static class ClientSender extends Thread {
		Socket socket;
		String name;

		ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			} catch (Exception e) {
				System.out.println("클라이언트 생성자 중에서 에러가 발생하였습니다.");
			}
		}

		public void run() {
			Scanner scanner = new Scanner(System.in);
			try {
				if (out != null) {
					out.writeUTF(name);
				}
				while (out != null) {
					out.writeUTF("[" + name + "]" + scanner.nextLine());
				}
			} catch (IOException e) {
				System.out.println("클라이언트 센더를 실행하는중에 에러가 발생하였습니다.");
			}
		}
	}

	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;

		ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				System.out.println("클라이언트 리시버를 실행하는중에 입출력 에러가 발생하였습니다.");
			}
		}

		public void run() {
			while (in != null) {
				try {
					String string = in.readUTF();
					System.out.println(string);
					area.append(string + "\n");
				} catch (IOException e) {
					System.out.println("클라이언트 리시버 메소드를 실행하는중에 입출력 에러가 발생하였습니다.");
				}
			}
		}
	}

	@SuppressWarnings("serial")
	static class FrClient extends JFrame implements ActionListener {

		public FrClient(String nick) {
			setSize(600, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle(nick + "님의 채팅방");
			setLayout(new BorderLayout());

			JLabel label = new JLabel("This is a server!");
			area = new JTextArea(25, 40);
			field = new JTextField(25);
			field.addActionListener(this);

			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

			JLabel lable_name = new JLabel(nick + "님");
			panel.add(lable_name, BorderLayout.WEST);
			panel.add(field, BorderLayout.CENTER);

			add(label, BorderLayout.NORTH);
			add(area, BorderLayout.CENTER);
			add(panel, BorderLayout.SOUTH);
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == field) {
				try {
					out.writeUTF("[" + nick + "]" + field.getText());
					field.setText("");
				} catch (IOException e1) {
					System.out.println("GUI창에서 메시지 송신 에러가 발생하였습니다.");
				}
			}
			
		}
	}

}
