package day3;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		/*
		 �μ��� ���μ����� �����ϼ���
		���μҶ� �μ��� �ִ� ������� 1�� �μ� ������ ���踦 ����

		3�� 7�� ���μ� ����

		4�� 6�� ���μ� ���谡 �ƴ�
		 */
		
		int num1=4, num2=6;
		int i, gcd=1;
		
		for (i=1 ; i<=num2 ; i++ ){
			if(num1 % i == 0 && num2 % i == 0 ){
				gcd = i; 
			}		
		}
			
			if(gcd == 1){
			System.out.println(num1 + "��" + num2 + "�� ���μ� ����");
			
			}else{
				System.out.println(num1 + "��" + num2 + "�� ���μ� ���谡 �ƴմϴ�");
			}
			
			
			
			
	}

}
