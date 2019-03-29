package day2;

import java.util.Scanner;

public class ex1if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*문제
		콘솔에 입력 받은 점수가 아래와 같다면 아래와 같이 등급으로 출력 하시오
		내 시험점수가 90점이상~100점미만 : A
		내 시험점수가 80점이상~90점미만 : B
		내 시험점수가 70점이상80점대면 : C
		내 시험점수가 70점이하면 : D
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
