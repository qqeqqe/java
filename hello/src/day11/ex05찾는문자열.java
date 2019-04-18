package day11;

import java.util.Scanner;

public class ex05찾는문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.println("문자열을 입력하시오 :");
		str = scan.nextLine();
		
		System.out.println("찾을 문자열을 입력하시오 :");
		String search = scan.nextLine();
		
		if(str.contains(search)){ //contains 메서드를 이용해서 검색
			System.out.println(str+"에는 " +search + "가 있습니다");
		}else{
			System.out.println(str+"에는 " +search + "가 없습니다");
		}
	
		if(str.indexOf(search) >=0 ){  //indexOf 메서드를 이용해서 검색
			System.out.println(str+"에는 " +search + "가 있습니다");
		}else{
			System.out.println(str+"에는 " +search + "가 없습니다");
		}		
		
		
	}

}
