package day3;

public class ex05구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int res = 0;
		int num = 2;
		
		for(num=1; num<=9; num++){//2부터 9단까지의 입력
			System.out.println(num + "단");
			
			for(i=1; i<=9; i++){ //2단시작후 9까지 곱센한다
		res = num * i;		
		System.out.println(num + " X " + i + "=" + res);				
		}
		}
		
		
		
		
	}

}
