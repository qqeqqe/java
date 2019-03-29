package day3목;

public class ex03최대공약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 두수의 최대 공약수를 구하는 코드를 작성하세요
		최대공약수 : 두수의 공약수중 가장 큰 공약수
		공약수 : 두수의 약수중에서 공통으로 들어가있는 약수
		8 - 1 2 4 8
		12 - 1 2 3 4 6 12
 		8과 12의 공약수 1 2 4
		8과 12의 최대공약수 4
		 */
		
		
		int num1=8, num2=12;
		int i, gcd=1;
		
		for (i=1 ; i<=num2 ; i++ ){
			if(num1 % i == 0 && num2 % i == 0 ){
				gcd = i; 
			}		
		}
						
		System.out.println(num1 + "과" + num2 + "의 최대공약수 : " + gcd);
	}

}
