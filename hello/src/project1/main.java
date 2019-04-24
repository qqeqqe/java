package project1;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인기 캐릭터 삐까츄의 모습을 가지고 있는 계산기를 만들어 보자

		JFrame tale = new JFrame("삐까츄 계산기");

		// 프레임 사이즈 설정
		tale.setSize(1000, 600);

		// 프레임을 화면 가운데 설정
		tale.setLocationRelativeTo(null);

		// 닫았을대 메모리에서 삭제
		// 이코트를 안적으면 콘솔창에 있는 빨간 네모박스로 닫아야 함
		tale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		JLabel back = new JLabel(); // 배경 이미지가 될녀석
		ImageIcon backGround = new ImageIcon(main.class.getResource("/project1/img/beck.jpg"));
		back.setIcon(backGround);

		JButton butte1 = new JButton(".");
		JButton butte2 = new JButton("=");

		JButton butten0 = new JButton("0");

		JButton butten1 = new JButton("1"); // 이미지를 넣을 라벨 생성
		JButton butten2 = new JButton("2");
		JButton butten3 = new JButton("3");
		JButton butten4 = new JButton("4");
		JButton butten5 = new JButton("5");
		JButton butten6 = new JButton("6");
		JButton butten7 = new JButton("7");
		JButton butten8 = new JButton("8");
		JButton butten9 = new JButton("9");

		JButton butten10 = new JButton("이미지칸 ");

		JButton butten11 = new JButton("N");
		JButton butten12 = new JButton("F");

		JButton butten13 = new JButton("/");
		JButton butten14 = new JButton("*");
		JButton butten15 = new JButton("-");
		JButton butten16 = new JButton("+");

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		// 버튼의 위치좌표와, 버튼의 크기 좌표만 설정
		back.setBounds(0,-20,1000, 600);

		butte1.setBounds(630, 450, 100, 50); // .
		butte2.setBounds(760, 450, 100, 50); // =

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

		butten10.setBounds(40, 40, 400, 460); // 삐까츄 이미지 나올곳

		butten11.setBounds(500, 40, 50, 50); // on
		butten12.setBounds(570, 40, 50, 50); // oFF

		butten13.setBounds(890, 210, 50, 50);
		butten14.setBounds(890, 290, 50, 50);
		butten15.setBounds(890, 370, 50, 50);
		butten16.setBounds(890, 450, 50, 50);

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		// 컨텐츠영역에 버튼 추가
		tale.add(back);

		tale.getContentPane().add(butte1);
		tale.getContentPane().add(butte2);

		tale.getContentPane().add(butten0);
		tale.getContentPane().add(butten1);
		tale.getContentPane().add(butten2);
		tale.getContentPane().add(butten3);

		tale.getContentPane().add(butten4);
		tale.getContentPane().add(butten5);
		tale.getContentPane().add(butten6);

		tale.getContentPane().add(butten7);
		tale.getContentPane().add(butten8);
		tale.getContentPane().add(butten9);

		tale.getContentPane().add(butten10);
		tale.getContentPane().add(butten11);
		tale.getContentPane().add(butten12);

		tale.getContentPane().add(butten13);
		tale.getContentPane().add(butten14);
		tale.getContentPane().add(butten15);
		tale.getContentPane().add(butten16);

		// 정렬을 해주는 레이아웃 객체 생성
		// FlowLayout lay = new FlowLayout();
		// 컨텐츠라는프레임영역을 가져와 레이아웃=배치 를 해준다는 의미
		// 배치 위치는 위에 flowLayout으로 함 .레이아웃을 따로 안할거면 없다로 지정

		// 요놈을 안하면 버튼이 이상하게 나옴 // 컨텐츠에 레이아웃을 해주는데 null 값을 주었다.
		tale.getContentPane().setLayout(null);

		// 프레임이 보이게 설정
		tale.setVisible(true);
		
		
		
		System.out.println();

		// 계산기 스윙으로 만들어 보자
		// 1. 계산기에 필요한 변수
		// =두 정수와 연산자 결과값 = int Num1, int Num2,string,sum
		// 2. 계산기에 들어갈 식
		// =한정된 값이므로 =>

	}

}
