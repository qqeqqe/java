package day나의연습장;

public class Exam1구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		구구단이나 메서드를 통해 만들어 보자
		기능 - 내가 원하는 시작단부터 끝나는 단수를 지정해서 화면에 출력하시오
		변수 - int start, int end
		메소드명 - gugudan 
		*/
	
		//메서드를 이용한 구구단 실험
	gugudan(2,2); // 범위값을 지정하게 된다
	 
	
	//증감 연산자 실험
		System.out.println();
			int a = 1;
			a++;
	 	System.out.println(a);
	 

		//비교연산자 실험
	 int b = 10 ;
	 if ( b > 0 && b < 5){
		 System.out.print("맞는말이다");
		}else{
		System.out.print("틀린말이다");
		}
	 
	 
	}
	
	
	public static void gugudan(int i,int a){
				for(; i<=a; i++){   // 메서드에서 초기화값을 0으로 주었다
			for (int b=1; b<=9; b++){  // 가운데 숫자 지정 해줬기 때문에 프린트 인에서 1~9까지만 나온다
				System.out.print(i + "X" + b + "=" + i*b+" " );
					}}}
	
	
	
	}
