package day04;

import java.util.Scanner;

public class ex02계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num1, num2;
		char op;
		

		num1 = scan.nextInt();		
		num2 = scan.nextInt();
		op = scan.next().charAt(0);
		
		
		
	
 switch (op) {
case '+':
	System.out.println("" + num1 + op + num2 + "=" + (num1+num2));
	break;

case '-':
	System.out.println("" + num1 + op + num2 + "=" + (num1-num2));
	break;
	
case '*':
	System.out.println("" + num1 + op + num2 + "=" + (num1*num2));
	break;
	
case '/':
	switch(num2){
	
	case 0:
		System.out.println("0으로 나눌수 없습니다");
		break;
		
		default:
		System.out.println("" + num1 + op + num2 + "=" + ((double)num1 / num2));
			}
		break;
	
	
	default:
		System.out.println(op + "는 잘못된 산술 연산자입니다");
		break;
		
}
 
	}
	}


