package day2;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int min = 1;
		int max = 3;
		int com = (int)(Math.random()*(max-min+1) + min);
		//System.out.println(com);
		
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("����(1),����(2),��(3) �� �ϳ��� �Է��Ͻÿ�");
		user = scan.nextInt();
		
		
		switch (user-com) {
		case 0:
			System.out.println("���º��Դϴ�");
			break;

		case -1: case 2:
			System.out.println("��ǻ�ͽ��Դϴ�.");
			break;
			
		case 1: case -2:
			System.out.println("����� ���Դϴ�");
			break;
			
		default:
			System.out.println("�߸��� �Է��Դϴ�");
			break;
		}
		
		
		//System.out.println(com);
		
	}

}
