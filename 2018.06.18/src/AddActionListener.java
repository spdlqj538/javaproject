import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
 
public class AddActionListener implements ActionListener {
	JTable table;
	JTextField name;
	JTextField kor;
	JTextField eng;
	JTextField mat;
	
	AddActionListener (JTable table, JTextField name, JTextField kor, JTextField eng, JTextField mat) {
		this.table = table;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String arr[] = new String[4];
		
		arr[0] = name.getText();
		arr[1] = kor.getText();
		arr[2] = eng.getText();
		arr[3] = mat.getText();
		
		Test test = new Test();
		int tot,ave;
		
		int kor = Integer.parseInt(test.j);
		
		
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow(arr);
		
		
	}
	
 
 
}