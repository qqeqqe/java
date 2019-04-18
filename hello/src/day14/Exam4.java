package day14;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
		 상황설정 : 수학과 학생이 허수를 계산하는 계산기를 만들고 싶어서
		 허수를 계산할수 있는 프로그램을 작성해야 하는 상황
		 
		 * 1 + 2i +3 + 4i = 4 + 6i
			허수1의 실수부 : 1
			허수1의 허수부 : 2
			허수2의 실수부 : 3
			허수2의 허수부 : 4

			(1+2i) + (3+4i) = (4+6i)
			(1+2i) - (3+4i) = (-2-2i)*/

		int hsu1 = 1;
		int hsu2 = 2;
		int hsu3 = 3;
		int hsu4 = -4;
		char op = '+';
		
		
/*		switch (op) {
		case '+': res =  break;
		case '-': res =  break;
		case '*': res =  break;
		case '/': res =  break;
		case '%': res =  break;

		default: 
			throw new Exception("잘못된 연산자입니다.");   
			
		}
		return res;
	}*/
	if(hsu4 < 0) {
			op = 0;
		}

		
		
		System.out.println("(" + hsu1 + "+" + hsu2+ "i"+ ")" + "+"
		+ "(" + hsu3+op + hsu4 + "i" + ")" + "=" + 
		  "(" +(hsu1+hsu3) +op+ (hsu2+hsu4)+"i" + ")" );
		 	//일단 결과값이 나오게 프린트 해보자
			//두번째는 가운데 연산자를 op로 수정해서 값이 틀리게 나오게 한다
		
		
	}

}
