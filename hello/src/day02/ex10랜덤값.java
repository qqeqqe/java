package day02;

import java.util.Scanner;

public class ex10랜덤값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int min = 1;
		int max = 3;
		int com = (int)(Math.random()*(max-min+1) + min);
		//System.out.println(com);
		
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하시오");
		user = scan.nextInt();
		
		
		switch (user-com) {
		case 0:
			System.out.println("무승부입니다");
			break;

		case -1: case 2:
			System.out.println("컴퓨터승입니다.");
			break;
			
		case 1: case -2:
			System.out.println("사용자 승입니다");
			break;
			
		default:
			System.out.println("잘못된 입력입니다");
			break;
		}
		
		
		//System.out.println(com);
		
	}

}
