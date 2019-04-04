package day7;

public class ex07구구단메서드1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**/
		
/*		기능 - 구구단 전체를 메소드를 이용하여 출력하도록 작성하세요
		
		매개변수 - 구구단 앞자리, 구구단 가운데자리, 구구단의 합 => int i, int center, int sum
		리턴타입 - int
		메소드명 - gugu (내용을 유추할수 있는 이름)
		*/
		
		
		int i = 0, center=0, sum=0;
		int gugu =0; 
		
		
		
		gugu(); // gugudan 메서드를 가져와서 출력 // 그안에 프린터 인 까지 있기때문에 프린트까지 된다
		System.out.println(); // 맨 아래칸에 엔터 한번 더 치는 효과,,,사실 의미 없음
	}
		
	
	
	
	public static void gugu(){ //void 값은 돌려줄필요가 없다는 말이다 리턴을 넣을 필요가 없음 
		// 가로안에 타입 변수명을 안넣는 이유는 아래 for 문에서 초기화 값을 주기 때문이다
		
		for(int i=2; i<=9 ; i++){ // int i 는 지역변수 선언,, 여기서밖에 안쓰기 때문에
			for(int center=1; center<=9 ;center++){ //int center 지역변수 선언,, 여기서밖에 안쓰기 때문에
				 int sum = center*i;  // int sum 지역변수 선언,, 여기서밖에 안쓰기 때문에
			System.out.println(i + "X" + center + "=" + sum);	// 실제 값을 출력 하는 곳
			}
		}
		
		
	}
}
