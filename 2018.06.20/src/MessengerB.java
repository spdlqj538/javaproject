import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MessengerB {
	protected JTextField textField;
	protected JTextArea textArea;
	DatagramSocket socket;
	DatagramPacket packet;
	InetAddress address = null;
	final int myPort = 6000;
	final int otherPort = 5000;
	
	public MessengerB() throws IOException {
		MyFrame f = new MyFrame();
		address = InetAddress.getByName("127.0.0.2");
		socket = new DatagramSocket(myPort);
	}
	
	public void process() {
		while (true) {
			try {
				byte[] buf = new byte[256];
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet); //��Ŷ�� �޴´�.
				textArea.append("RECIEVED : " + new String(buf) + "\n");//���� ��Ŷ�� �ؽ�Ʈ ������ ǥ���Ѵ�.
			}catch (IOException ioException) {
				ioException.printStackTrace();
			}
		}
	}
	
	class MyFrame extends JFrame implements ActionListener {

	
		public MyFrame() {
			super("MessengerB");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			textField = new JTextField(30);
			textField.addActionListener(this);
			
			textArea = new JTextArea(10,30);
			textArea.setEditable(false);
			
			add(textField, BorderLayout.PAGE_END);
			add(textArea, BorderLayout.CENTER);
			pack();
			setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent evt) {
			String s = textField.getText();
			byte[] buffer = s.getBytes();
			DatagramPacket packet;
			
			packet = new DatagramPacket(buffer, buffer.length, address, otherPort);//��Ŷ�� �����Ѵ�.
			
			try{
				socket.send(packet);//��Ŷ�� ������.
			}catch (IOException e) {
				e.printStackTrace();
			}
			textArea.append("SENT :" + s + "\n");
			textField.selectAll();
			textArea.setCaretPosition(textArea.getDocument().getLength());
			
		}
		
	}	
		
	public static void main(String[] args) throws IOException {
		MessengerB m = new MessengerB();
		m.process();

	}

}
