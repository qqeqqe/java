package day2;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* �ܼ�â�� �Ʒ��� ���� ������ �Է��ϰ�  �Ʒ��� ���� ����Ͻÿ�
		 
		 �����Է�
		 92
		 82
		 62
		 50
		 95.5
		 
		 90�̻� 100���� A����Դϴ�.
		 80�̻� 90���� B����Դϴ�.
		 70�̻� 80�̸� C����Դϴ�.
		 60�̻� 70�̸� D����Դϴ�.
		 0�̻� 60�̸� F����Դϴ�.
		 0���̸�, 100�� �ʰ� : �߸��� �����Դϴ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		double i;
		i = scan.nextDouble();
		
		
		if (i >= 90 && i <=100){
			System.out.println(i + "�� A��� �Դϴ�");
						}
			
		
		else if(i >= 80 && i <=90 ){
			System.out.println(i + "�� B��� �Դϴ�");
		}
		
			
		else if(i >= 70 && i <=80){
			System.out.println(i + "�� C��� �Դϴ�");
		}
		
		
			
		else if(i >= 60 && i <=70){
			System.out.println(i + "�� D��� �Դϴ�");
		}
					
	
		else if(i >= 0 && i <=60){
			System.out.println(i + "�� F��� �Դϴ�");
		}
		
		
		
		else{
			System.out.println("�߸��� �����Դϴ�.");
		}
		
	}

}
