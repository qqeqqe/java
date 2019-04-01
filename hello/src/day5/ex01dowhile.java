package day5;

import java.util.Scanner;

public class ex01dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*

		순서도

		for (1초기화; 2.5.8조건식; 4.7증감연산){
		3.6실행문}
		 
		
		while 문에서는 조건식이 무조건 있어야 함
		조건식에 true 
		
		1초기화;
		while(2.5.8조건식){
		3.6실행문;
		4.7증감연산;
		}
		 */

		
		int i = 0, sum=0;
		for (i=1 ; i<=10 ; i++ ){
			sum += i;
		System.out.println(sum);	
		}

		
		
		
		
		int i2 = 0, sum1=0;
		while (i2<=10){
			sum1 += i2;
			i2++;
			System.out.println(sum1);
		}
		
		
		
		
		
		
		/*
		 do while : 조건식에 따라 무조건 1번은 실행된다
		 
		 do{ 실행문 
		 }while(조건식);
		 */
		
		int menu;
		Scanner scan = new Scanner(System.in);
		do{ 
			System.out.println("메뉴");
			System.out.println("1.학생정보 추가");
			System.out.println("2.학생정보 수정");
			System.out.println("3.학생정보 삭제");
			System.out.println("4.학생정보 확인");
			System.out.println("5.종료");
			System.out.print("메뉴를 선택하세요 : ");
			
			menu = scan.nextInt();
					}while(menu !=5);
		scan.close();
		
	
		
		
	}

}
