package day3;

public class ex03�ִ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 �μ��� �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���
		�ִ����� : �μ��� ������� ���� ū �����
		����� : �μ��� ����߿��� �������� ���ִ� ���
		8 - 1 2 4 8
		12 - 1 2 3 4 6 12
 		8�� 12�� ����� 1 2 4
		8�� 12�� �ִ����� 4
		 */
		
		
		int num1=8, num2=12;
		int i, gcd=1;
		
		for (i=1 ; i<=num2 ; i++ ){
			if(num1 % i == 0 && num2 % i == 0 ){
				gcd = i; 
			}		
		}
						
		System.out.println(num1 + "��" + num2 + "�� �ִ����� : " + gcd);
	}

}
