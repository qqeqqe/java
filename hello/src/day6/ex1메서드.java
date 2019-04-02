package day6;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ex1메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//최대 공약수를 구하는 공식을 메서드로 
		
	int num1 = 10, num2 =15;
	int gcdNum = 1;
	gcdNum = gcd(num1,num2);
	
	
	System.out.println(num1 + " 과" + num2 + "의 최대 공약수 : " + gcdNum);
	System.out.println(num1 + " 과" + num2 + "의 최소 공배수 : " + lcm(num1,num2));
	}
	
	
	
	/*기능 - 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메서드
	리턴타입(출력) - 최대공약수 => 정수 =>int
	매개변수(입력) - 두 정수=> int num1, int num2
	메서드명:gcd
	*/
	
	public static int gcd(int num1, int num2){ //
		int gcdNum = 1;
		for(int i=1; i<=num1; i++){
			if(num1 %i ==0 && num2%i==0){
				gcdNum = i;
	
			}
	}
	return gcdNum;
	}
	
	
	/*기능 - 두수의 최소 공배수를 구하는 메서드
	             최소 공배수는 두수의 곱에 최대 공약수로 나눈값이다
	매개변수 - 두 정수 => int num1, int num2
	리턴타팁 - 최소 공배수는 =>정수=>int
	메소드명 - lcm
	*/
	
	public static int lcm(int num1, int num2){ //
		return num1*num2/gcd(num1,num2);
	}
}
