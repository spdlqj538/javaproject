import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class AddActionListener implements ActionListener {
	
	static JTable table;
	static JTextField text1;
	static JTextField text2;
	static JTextField text3;
	static JTextField text4;
	
	
	AddActionListener (JTable table, JTextField text1, JTextField text2, JTextField text3, JTextField text4) {
		
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.text4 = text4;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String arr[] = new String[4];
		
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = text3.getText();
		arr[3] = text4.getText();
		
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow(arr);
		
	}

}
