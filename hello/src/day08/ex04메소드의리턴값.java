package day08;

import java.util.Scanner;

public class ex04메소드의리턴값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner scan = new Scanner(System.in);
		int a = 0;
		a = scan.nextInt();*/
		
		/*메소드에서 리턴값이 있을때 구현시 유의사항
		조건문을 통해 리턴하는 경우나 반복문을 통해 리턴할 경우 리턴되지 않는 경우을 항상 생각해야 한다
		반복문 안에서 return을 할 경우 조심해야 한다
		조건문을 통해 return할 경우 조건문이 거짓인 경우를 고려해야한다
		반복문 안에서 return을 할 경우 반복문 조건이 거짓이 되어 반복문이 실행되지 않을 경우를 고려해야한다*/
		
		
	}
		public static int test1(){
			int r = 0;
			for(int i=1; i<=9; i++){
				r += i; 
			return r;
			}
			/*반복문이 무조건 실행되서 리턴이 되는 겨우라 하더라도 자바 컴파일러는
			세세한 내용까지 검사하지 않기 때문에 반복문이 종료 됐을 경우 리턴도 설정해주어야 한다*/
			return 0;
		}
		
		
		/*public static int test(int num){
			if (num >= 0) return 1;
				}*/
		}
