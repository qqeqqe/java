package day8;

public class ex06오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		메서드 오버로딩의 조건
		1. 매게 변수의 갯수가 다르다
		2. 매개변수의 갯수가 같지만 자료형이 다른경우
*/		
	System.out.println(sum(1,1));
	System.out.println(sum(1.1,1.2));
	System.out.println(sum(1,1,3));
	}
/*
	기능 - 두 정수의 합을 알려주는 기능
	매개변수 - int num1, int num2
	리턴타칩 - int
	메소드명 - sum
	
	기능 - 두 실수의 합을 알려주는 기능
	매개변수 - double num1, double num2
	리턴타입 - double
	메소드명 - sum
	
	기능 - 세 정수의 합을 알려주는 기능
	매개변수 - int num1, int num2,int num3
	리턴타칩 - int
	메소드명 - sum
	*/
	
	
	public static int sum(int num1, int num2){
		return num1+num2;

	}
	
	
	public static double sum(double num1,double num2){
		return num1+num2;

	}
	
	public static int sum(int num1,int num2,int num3){
		return num1+num2+num3;

	}
	
/*	public static double sum(int num1,int num2){
		return num1+num2;

	}*/
	}
