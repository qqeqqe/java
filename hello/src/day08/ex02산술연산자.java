package day08;

public class ex02산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double isum = calc( 3 ,2  , '/' );
		System.out.println(isum);
	}//메인의 끝
	
	
	/*
	기능 - 두 정수의 산술 연산 결과를 알려주는 메소드
	매개변수 - int a, int b, char op
	리턴타입 - double
	메소드명 - calc
*/
	
	
	public static double calc(int a, int b,char op){
			double sum = 0.0;
			switch(op){
			case '+' : sum =a+b;      		  break;
			//case '+' : return a+b;
			case '-' : sum =a/(double)b;      break;
			//case '-' : return a-b;
			case '/' : sum =a-b;      		  break;
			//case '/' : return a/b;
			case '*' : sum =a*b;      		  break;
			//case '*' : return a*b;
			case '%' : sum =a%b;
			//case '%' : return a%b;
			if( b <= 0 ){
				System.out.println("0으로는 못해여");
			}
			}
			return sum;
			} //clac 메소드 끝
	
	}
