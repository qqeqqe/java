package day6;

public class ex3서로소메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*기능 : 두 정수가 주어지면 서로소인지 아닌지를 참 또는 거짓으로 알려주는 메소드
		매게변수 : 두 정수 => int num1, int num2
		리턴타칩 : boolean
		메소드명 : iscoprime*/
		
		int num1=7, num2 = 8;
	
		if (iscoprime(num1,num2)){
			System.out.println("두 수는 서로소");
		}else{
			System.out.println("두수는 서로소가 아닙니다");
		}
		}
	

	
	
	public static int gcd(int num1, int num2){
		int gcdNum = 1;
		for(int i=1; i<=num1; i++){
			if(num1 %i ==0 && num2%i==0){
				gcdNum = i;
			}
	}
	return gcdNum;
	}
		
	

public static boolean iscoprime(int num1, int num2){
	if (gcd(num1,num2)==0){
		return true;
	}else{
		return false;
	}
	}
}
