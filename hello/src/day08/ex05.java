package day08;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			System.out.println(factorial(5));
		}
	
	
		// 잘못된 재귀 메소드 예제
	public static void print(){
		System.out.println("hello");
		print();
	}
	
	
	
	/*기능 - 정수 num이 주어지면 주어진 정수 num!를 알려주는 메소드
	매개변수 - int num
	리턴타입 - num!=>int
	메서드명 - factorial*/  

	public static int factorial(int num){
		if (num == 1 || num == 0)
			return 1;
		if (num < 0)
			return -1;
		return factorial(num-1)*num;
			
	}

}

