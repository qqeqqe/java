package day2;

import java.util.Scanner;

public class ex1if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*����
		�ֿܼ� �Է� ���� ������ �Ʒ��� ���ٸ� �Ʒ��� ���� ������� ��� �Ͻÿ�
		�� ���������� 90���̻�~100���̸� : A
		�� ���������� 80���̻�~90���̸� : B
		�� ���������� 70���̻�80����� : C
		�� ���������� 70�����ϸ� : D
		*/
		
		Scanner scan = new Scanner(System.in);
		int i;
		i = scan.nextInt();
		
		
		if (i == 100){
			System.out.println("A");
		}
		
		
		if (i >= 99){
			System.out.println("B");
		}
		
		
		if (i >=89 ){
			System.out.println("C");
		
		}
		
		if (i >= 80){
			System.out.println("C");
		}
		
		else{
			System.out.println("D");
		}
		
		
		
	}

}
