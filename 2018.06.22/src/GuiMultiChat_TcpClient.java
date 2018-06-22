import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class GuiMultiChat_TcpClient extends JFrame implements ActionListener {

	private BufferedReader in;
	private PrintWriter out;
	private JTextField field;
	private JTextArea area;

	public GuiMultiChat_TcpClient() throws Exception, IOException {
		setTitle("채팅 클라이언트");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		field = new JTextField(100);
		field.addActionListener(this);	
		area = new JTextArea(25, 40);
		area.setEditable(false);
		add(field, BorderLayout.SOUTH);
		add(area, BorderLayout.CENTER);
		setVisible(true);
		Socket socket = new Socket("localhost", 7777);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
		area.append(in.readLine() + "\n");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		out.println(field.getText());
		String response = null;
		try {
			response = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		area.append(response + "\n");

	}

	public static void main(String[] args) throws Exception {
		GuiMultiChat_TcpClient client = new GuiMultiChat_TcpClient();
	}

}
