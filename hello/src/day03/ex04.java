package day03;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		/*
		 두수가 서로소인지 판펼하세여
		서로소란 두수의 최대 공약수가 1인 두수 사이의 관계를 말함

		3과 7은 서로소 관계

		4와 6은 서로소 관계가 아님
		 */
		
		int num1=4, num2=6;
		int i, gcd=1;
		
		for (i=1 ; i<=num2 ; i++ ){
			if(num1 % i == 0 && num2 % i == 0 ){
				gcd = i; 
			}		
		}
			
			if(gcd == 1){
			System.out.println(num1 + "과" + num2 + "는 서로소 관계");
			
			}else{
				System.out.println(num1 + "과" + num2 + "는 서로소 관계가 아닙니다");
			}
			
			
			
			
	}

}
