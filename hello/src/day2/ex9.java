package day2;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 �ܼ�â�� 1~12������ ���ڸ� �Է�������
		 �� �޷��� ������ ���� ������ �ڵ带 �ϼ��Ͻÿ�
		 
		 1.3.5.7.8.10.12���� 31��
		 2���� 28��
		 4.9.11���� 30��
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		int a = 0;
		a = scan.nextInt();
	
		
		
		switch (a) {
		case 1:case 3:case 5:case 7:case 8:case 10:
		case 12:
			System.out.println("31��");	break;
		case 2:	System.out.println("28��");	break;
		case 4:case 9:	
		case 11:	System.out.println("30��");	break;
		
		default:
		  System.out.println("�߸��� �����Դϴ�.");
		  
		}
		
		
	}

}
