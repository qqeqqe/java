package day14;

import java.util.ArrayList; 
import java.util.HashMap;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1.0/0.0);
		
		
		try {
			System.out.println(calc(1.0 , 0.0 , '/'));
		} catch (Exception e) {
		
			System.out.println(e.getMessage());  //getMessage 메세지를 출력한다.
		}
		
		
		
		/*ArrayList<Integer> list;*/  //int는 사용못하고 인티저, 즉 문자열을 정수로 바꾸는 인티저만 사용가능하다  
		int num = 0;
		
		try{ 
			num =1/0;
		}catch(ArithmeticException e){
			System.out.println("계산관련 예외가 발생하였습니다.");	
		}catch(Exception e){
			e.printStackTrace();
		}
			System.out.println(num);
	}
		
	
		public static double calc(double num1, double num2, char op) 
				throws Exception, ArithmeticException{
		double res = 0.0;
		if ((op == '/' || op == '%') && num2 == 0.0) 
			throw new ArithmeticException("0으로 나눌수 없습니다"); //throw 던지다 라는 의미 
		//throw 쓰로우 = 리턴을 안한다.
		
		switch (op) {
		case '+': res = num1 + num2; break;
		case '-': res = num1 - num2; break;
		case '*': res = num1 * num2; break;
		case '/': res = num1 / num2; break;
		case '%': res = num1 % num2; break;

		default: 
			throw new Exception("잘못된 연산자입니다.");   
			
		}
		return res;
		}
	
}
