package project1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test extends JFrame implements ActionListener {

	JButton bt_test;
	JButton bt_test1;
	
	public test() {
		setTitle("JButton 이벤트처리");
		setSize(400, 200);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel main_panel = new JPanel(); 

		bt_test 	= new JButton("누르시오");
		bt_test1	= new JButton("누르시오1");
		
		bt_test.setPreferredSize(new Dimension(100, 50));
		bt_test1.setPreferredSize(new Dimension(100, 50));
		
		
		bt_test		.setBackground(Color.pink); 
		bt_test1	.setBackground(Color.pink); 
		
		bt_test.addActionListener(this);
		
		main_panel.add(bt_test);
		main_panel.add(bt_test1);

		
		add(main_panel);

		setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e) {
		System.out.println("눌렸다");
		System.out.println("눌렸다");
	}

}
