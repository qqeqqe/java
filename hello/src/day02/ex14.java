package day02;

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
			System.out.println(num + " 는 소수");
		
		}
		
		else{
			System.out.println(num + "는 소수가 아닙니다");
		}
		
		
		
		
		
	}

}
