package project1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener {
	JLabel sum;
	JButton bu1, bu2, butten0, butten1, butten2, butten3, butten4, butten5, butten6, butten7, butten8, butten9,
			butten11, butten12, butten13, butten14, butten15, butten16, AC, backMove;
	
	JFrame butten10;
	

	public MyFrame() {
		super("피카츄 계산기"); // 부모클래스의 j프레임 상속 받기 or setTitle 메소드생성
		setSize(1000, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창을 닫으면 없어지지만 메모리에 남아있다그래서 이 명령어를 넣어야 함

		JPanel c = new JPanel(); // 버튼을 부착할 컨테인 팬을 만듬
		/* JFrame c = new JFrame(); */

		c.setLayout(null); // 위치를 어떻게 할것인가에 대한문

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		
		sum = new JLabel("결과값");

		butten10 = new JFrame();
		ImageIcon leftimg = new ImageIcon(main.class.getResource("/project1/img/pp.png"));
		butten10.setIconImages(getIconImages());

		bu1 = new JButton(".");
		bu2 = new JButton("=");

		butten0 = new JButton("0");

		butten1 = new JButton("1");
		butten2 = new JButton("2");
		butten3 = new JButton("3");
		butten4 = new JButton("4");
		butten5 = new JButton("5");
		butten6 = new JButton("6");
		butten7 = new JButton("7");
		butten8 = new JButton("8");
		butten9 = new JButton("9");

		butten11 = new JButton("N");
		butten12 = new JButton("F");

		butten13 = new JButton("/");
		butten14 = new JButton("*");
		butten15 = new JButton("-");
		butten16 = new JButton("+");

		AC = new JButton("AC");
		backMove = new JButton("<===");

		c.setBackground(Color.white); // 백그라운드 색을 어떻게 할것인가에 대한

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		sum.setBounds(100, 100, 100, 50); // .

		bu1.setBounds(630, 450, 100, 50); // .
		bu2.setBounds(760, 450, 100, 50); // =

		butten0.setBounds(500, 450, 100, 50);
		butten1.setBounds(500, 370, 100, 50);
		butten2.setBounds(630, 370, 100, 50);
		butten3.setBounds(760, 370, 100, 50);

		butten4.setBounds(500, 290, 100, 50);
		butten5.setBounds(630, 290, 100, 50);
		butten6.setBounds(760, 290, 100, 50);

		butten7.setBounds(500, 210, 100, 50);
		butten8.setBounds(630, 210, 100, 50);
		butten9.setBounds(760, 210, 100, 50);

		
		 butten10.setBounds(40, 120, 400, 460);
		
		butten11.setBounds(500, 40, 50, 50); // ON
		butten12.setBounds(570, 40, 50, 50); // OFF

		butten13.setBounds(890, 210, 50, 50);
		butten14.setBounds(890, 290, 50, 50);
		butten15.setBounds(890, 370, 50, 50);
		butten16.setBounds(890, 450, 50, 50);

		AC.setBounds(500, 130, 100, 50); // AC
		backMove.setBounds(630, 130, 100, 50); // backMove
		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		c.add(sum);

		c.add(bu1);
		c.add(bu2);

		c.add(butten0);
		c.add(butten1);
		c.add(butten2);
		c.add(butten3);

		c.add(butten4);
		c.add(butten5);
		c.add(butten6);

		c.add(butten7);
		c.add(butten8);
		c.add(butten9);

		c.add(butten11);
		c.add(butten12);

		c.add(butten13);
		c.add(butten14);
		c.add(butten15);
		c.add(butten16);

		c.add(AC);
		c.add(backMove);
		 /*c.add(butten10);*/

		bu1.addActionListener(this);
		butten0.addActionListener(this);
		butten1.addActionListener(this);
		butten2.addActionListener(this);
		butten3.addActionListener(this);
		butten4.addActionListener(this);
		butten5.addActionListener(this);
		butten6.addActionListener(this);
		butten7.addActionListener(this);
		butten8.addActionListener(this);
		butten9.addActionListener(this);
		/*butten10.addActionListener(this);*/
		butten11.addActionListener(this);
		butten12.addActionListener(this);
		butten13.addActionListener(this);
		butten14.addActionListener(this);
		butten15.addActionListener(this);
		butten16.addActionListener(this);
		
		

		add(c);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	}
}
