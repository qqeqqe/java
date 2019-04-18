package day04;

public class ex04공약수출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//두수의 공약수를 출력하는 코드를 작성하세요
		//1 , 2 , 4
		
		
		
		int num1=8, num2=12;
		int i, gcd=1;
		
		for (i=1 ; i<=num2 ; i++ ){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
					System.out.print(" " + i);
			
			
			
					
			}		
		}					
	}
}