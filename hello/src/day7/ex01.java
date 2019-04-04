package day7;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*stajun@naver.com*/
		
/*		1.구구단 전체를 출력하는 코드를 작성하세요*/
		
		int a =0; 
		int i =0; 
		int sum = 0;
		
		for(i=2; i<=9 ; i++){
			for(a=1; a<=9 ;a++){
				sum = a*i;
				System.out.println(i + "X" + a + "=" + sum);
				
			}
				
		}
		
		
		
	}

}
