package day3;

public class ex01��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
 ���� / �μ��� �ּ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���
�ּ� ������� �μ��� ������� ���� ���� �����
������� �μ��� ����� �������� ������ ���

10�� ����� 10 20 30 40 50 60 .....
15�� ����� 15 30 45 60 75 90 ....
10�� 15�� ������� 30 60 90 120
10�� 15�� �ּ� ������� 30
		 */
		
		
		
		int num1 =10, num2 = 15;
		int i, lcm =1;
		
		for(i=1; i<=num1*num2; i++){
			if(i % num1 == 0 && i % num2 == 0){
				//��� �ϰ�� i �� num1�� ��ġ�� �ٲ��ش�. ���������� i�� num2�� ��ġ�� �ٲ��ָ� �ȴ�.
			lcm = i;
			break;
			}
			
		}		
		System.out.println(num1 +"��"+ num2 + "�� �ּ� ������� :" + lcm );
		
		
		
		
		
		
		
		
		
	}

}
