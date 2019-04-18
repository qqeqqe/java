package day11;

import java.util.Scanner;

public class ex06교체할문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		String str = new String(); 
		System.out.println("문자열을 입력하시오 :");
		str = scan.nextLine();
		
		System.out.println("교체될 문자열을 입력하시오 :");
		String searchStr = scan.nextLine();
		
		System.out.println("교체할 문자열을 입력하시오 :");
		String replaceStr = scan.nextLine();
		
		String newStr = ""; //스트링에서만 가능한 방법. 쌍 따음표는 위에 new String(); 이 들어가있다는 말
		newStr = str.replaceAll(searchStr, replaceStr);
		if(newStr == str){
			System.out.println("교체될 문자열이 없습니다.");
		} else{
			System.out.println(newStr);
			}
	}

}
