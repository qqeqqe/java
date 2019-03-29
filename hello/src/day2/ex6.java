package day2;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 콘솔창에 아래와 같이 점수를 입력하고  아래와 같이 출력하시오
		 
		 점수입력
		 92
		 82
		 62
		 50
		 95.5
		 
		 90이상 100이하 A등급입니다.
		 80이상 90이하 B등급입니다.
		 70이상 80미만 C등급입니다.
		 60이상 70미만 D등급입니다.
		 0이상 60미만 F등급입니다.
		 0점미만, 100점 초과 : 잘못된 점수입니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		double i;
		i = scan.nextDouble();
		
		
		if (i >= 90 && i <=100){
			System.out.println(i + "는 A등급 입니다");
						}
			
		
		else if(i >= 80 && i <=90 ){
			System.out.println(i + "는 B등급 입니다");
		}
		
			
		else if(i >= 70 && i <=80){
			System.out.println(i + "는 C등급 입니다");
		}
		
		
			
		else if(i >= 60 && i <=70){
			System.out.println(i + "는 D등급 입니다");
		}
					
	
		else if(i >= 0 && i <=60){
			System.out.println(i + "는 F등급 입니다");
		}
		
		
		
		else{
			System.out.println("잘못된 점수입니다.");
		}
		
	}

}
