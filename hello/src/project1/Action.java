package project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Action extends Calculation {
	String op = "";
	int Num1, Num2, sum;
	
	
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();

		
		
		
		if (ob == bu1) {
			System.out.print(".");
		} else if (ob == butten0) {
			System.out.print("0");
		} else if (ob == butten1) {
			System.out.print("1");
		} else if (ob == butten2) {
			System.out.print("2");
		} else if (ob == butten3) {
			System.out.print("3");
		} else if (ob == butten4) {
			System.out.print("4");
		} else if (ob == butten5) {
			System.out.print("5");
		} else if (ob == butten6) {
			System.out.print("6");
		} else if (ob == butten7) {
			System.out.print("7");
		} else if (ob == butten8) {
			System.out.print("8");
		} else if (ob == butten9) {
			System.out.print("9");
		} else if (ob == butten10) {
			System.out.print("10");
		} else if (ob == butten11) {
			System.out.print("초기화를 하였습니다.");
		} else if (ob == butten12) {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (ob == butten13) {
			System.out.print("/");
		} else if (ob == butten14) {
			System.out.print("*");
		} else if (ob == butten15) {
			System.out.print("-");
		} else if (ob == butten16) {
		System.out.println("+");
		
		}
	}

	
	
}

