package day6;

public class ex2합성수메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*기능 - 정수가 주어지면 해당정수가 소수이면 참을 합성수면 거짓을 알려주는 메서드
		매개변수 - 정수 = int num
		리턴타입 - boolean
		메소드명 - isPrime
		*/
		
		
		int num = 9;
		
		if(isPrime(num)){
			System.out.println("소수");
		}else{
			System.out.println("합성수");
		}
	}

	
	public static boolean isPrime(int num){
		int cnt = 0;
		for (int i =1; i<=num; i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt ==2){
			return true;
		}else{
			return false;
			}	
	}
	
	
	
	
	
	
}