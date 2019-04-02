package day6;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ex4메서드계산식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num1 = 2020,  num2 = 12;
			char op = '/';
		    
			
			System.out.println(calc(num1,num2,op));
			
		}
	
	
	
	public static double calc(int num1, int num2, char op){
		 double res = 0.0;
		switch (op) {
		case '+':  res = num1+num2;		break;
		case '-':  res = num1-num2;		break;
		case '*':  res = num1*num2;		break;
		case '/':  res = num1/(double)num2;		break;
		case '%':  res = num1%num2;		break;
		
	
		}
		return res;
	}
	
	
	
	
	

		
		
		
	
}
