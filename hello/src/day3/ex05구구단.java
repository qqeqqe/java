package day3;

public class ex05������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int res = 0;
		int num = 2;
		
		for(num=1; num<=9; num++){//2���� 9�ܱ����� �Է�
			System.out.println(num + "��");
			
			for(i=1; i<=9; i++){ //2�ܽ����� 9���� �����Ѵ�
		res = num * i;		
		System.out.println(num + " X " + i + "=" + res);				
		}
		}
		
		
		
		
	}

}
