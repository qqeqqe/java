package day2;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, cnt, i;
		
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
				
		for (i=1,cnt=0 ; i<=num ; i++ ){
			
			if(num % i == 0){
				cnt++;
		           }
					
			}
		
		if(cnt == 2){
			System.out.println(num + " �� �Ҽ�");
		
		}
		
		else{
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�");
		}
		
		
		
		
		
	}

}
