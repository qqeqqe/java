package day02;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 콘솔창에 1~12까지의 숫자를 입력했을때
		 각 달력의 마지막 일이 나오게 코드를 완성하시오
		 
		 1.3.5.7.8.10.12월은 31일
		 2월은 28일
		 4.9.11월은 30일
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		int a = 0;
		a = scan.nextInt();
	
		
		
		switch (a) {
		case 1:case 3:case 5:case 7:case 8:case 10:
		case 12:
			System.out.println("31일");	break;
		case 2:	System.out.println("28일");	break;
		case 4:case 9:	
		case 11:	System.out.println("30일");	break;
		
		default:
		  System.out.println("잘못된 정보입니다.");
		  
		}
		
		
	}

}
