package day05;

import java.util.Scanner;

public class ex02array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] kor;
		kor = new int [10]; //배열의 수를 나타냄, 10가지의 배열을 만든다는 말이다
		kor[0] = 10;
		System.out.println(kor[0]);
		System.out.println(kor[9]);
		System.out.println(kor[0]);
		
		
		
		
		
		int i = 0;
		for (i=1 ;i<kor.length; i++ ){ 
		System.out.println(i + "번지" + kor[i]);	
		}
		/*
		Scanner scan = new Scanner(System.in);
		for ( i=0; i<3; i++){
			kor[i] = scan.nextInt();
		}
		scan.close();
		*/
		/*
		
		
		eng = kor;
		for(i=0 ;i<eng.length ;i++){
			System.out.println(i + "번지" + kor[i]);
		}
		
		for (i=0 ;i<eng.length ;i++){
			System.out.println(i + "번지 :" + kor[i]);
		}
		*/
		
		int [ ] eng;
		eng = new int[10]; //eng 배열생성
		//kor 배열의 값을 eng 배열에 복사
		for(i=0; i<eng.length; i++){
			eng[i] = kor[i];
		}
		
		
		
	}

}
