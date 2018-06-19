import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

public class Test extends JFrame {

	ScoreDTO scoreDTO = new ScoreDTO();
	ScoreDAO scoreDAO = new ScoreDAO();
	Vector col = new Vector();

	Test() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI");

		this.setLayout(null);

		Button button1 = new Button("이름");
		button1.setBounds(10, 10, 100, 50);
		this.add(button1);

		JTextField jtf1 = new JTextField(10);
		jtf1.setBounds(115, 10, 100, 50);
		this.add(jtf1);

		JButton jbutton1 = new JButton("추가");
		jbutton1.setBounds(220, 10, 100, 50);
		this.add(jbutton1);

		Button button2 = new Button("국어 점수");
		button2.setBounds(10, 65, 100, 50);
		this.add(button2);

		JTextField jtf2 = new JTextField(10);
		jtf2.setBounds(115, 65, 100, 50);
		this.add(jtf2);

		JButton jbutton2 = new JButton("삭제");
		jbutton2.setBounds(220, 65, 100, 50);
		this.add(jbutton2);

		Button button3 = new Button("수학 점수");
		button3.setBounds(10, 120, 100, 50);
		this.add(button3);

		JTextField jtf3 = new JTextField(10);
		jtf3.setBounds(115, 120, 100, 50);
		this.add(jtf3);

		JButton jbutton3 = new JButton("수정");
		jbutton3.setBounds(220, 120, 100, 50);
		this.add(jbutton3);

		Button button4 = new Button("영어 점수");
		button4.setBounds(10, 175, 100, 50);
		this.add(button4);

		JTextField jtf4 = new JTextField(10);
		jtf4.setBounds(115, 175, 100, 50);
		this.add(jtf4);

		JPanel panel = new JPanel();
		

		col.add("이름");
		col.add("국어 점수");
		col.add("영어 점수");
		col.add("수학 점수");
		col.add("총점");
		col.add("평균");

		DefaultTableModel model = new DefaultTableModel(scoreDAO.getScore(), col);
		JTable table = new JTable(model);
		JScrollPane js = new JScrollPane(table);

		panel.setBounds(200, 5, 800, 300);
		panel.add(js);

		add(panel);
		setSize(1000, 300);
		setVisible(true);

		ActionListener Add = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String name = jtf1.getText();
				int kor, eng, mat, tot, ave;

				kor = Integer.parseInt(jtf2.getText());
				eng = Integer.parseInt(jtf3.getText());
				mat = Integer.parseInt(jtf4.getText());
				tot = kor + eng + mat;
				ave = tot / 3;

				scoreDTO.setName(name);
				scoreDTO.setKor(kor);
				scoreDTO.setEng(eng);
				scoreDTO.setMat(mat);
				scoreDTO.setTot(tot);
				scoreDTO.setAve(ave);

				int result = scoreDAO.insertScore(scoreDTO);

				if (result == 1) {
					jTableRefresh();
				}

			}

		};

		ActionListener Remove = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result = scoreDAO.deleteScore(scoreDTO);	
				if (result == 1) {
					jTableRefresh();
				}
			}
		};

		ActionListener Update = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		};

		jbutton1.addActionListener(Add);
		jbutton2.addActionListener(Remove);
		jbutton3.addActionListener(Update);
	}

	protected void jTableRefresh() {
		
		DefaultTableModel model = new DefaultTableModel(scoreDAO.getScore(),col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}

	public static void main(String[] args) {
		ScoreDAO a = new ScoreDAO();
		a.getConn();
		new Test();
	}
}