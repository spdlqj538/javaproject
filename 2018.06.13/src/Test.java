import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class Test {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Table Test");
		frame.setPreferredSize(new Dimension(1000, 500));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();

		String colName[] = { "이름", "국어", "수학","영어" };
		DefaultTableModel model = new DefaultTableModel(colName, 0);
		JTable table = new JTable(model);

		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		JPanel panel = new JPanel();

		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		JTextField text3 = new JTextField(10);
		JTextField text4 = new JTextField(10);
		
		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("삭제");
		JButton button3 = new JButton("수정");
		
		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("국어"));
		panel.add(text2);
		panel.add(new JLabel("수학"));
		panel.add(text3);
		panel.add(new JLabel("영어"));
		panel.add(text4);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		contentPane.add(panel, BorderLayout.SOUTH);
		
		button1.addActionListener(new AddActionListener(table,text1,text2,text3,text4));
		button2.addActionListener(new RemoveActionListener(table));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
