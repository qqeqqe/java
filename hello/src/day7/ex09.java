package day7;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		/* **********     - 공이 10개*//*
		기능 - 별을 나타내는 메소드
		
		매개변수 - int i
		리턴타입 - int
		메소드명 - star */
		
		printLine(10,'*'); //10번째까지 F를 찍으시오
		printLine(8,'*'); // 8번째까지 F를 찍으시오
		}
	
	
	public static void printLine(int cnt,char ch){   //cnt별을 몇개를 찍을것인가
		for(int i =1; i<=cnt ; i++){
			System.out.print(ch);			
		}
		System.out.println();
		
	}
}
