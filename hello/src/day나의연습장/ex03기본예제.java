package day나의연습장;

public class ex03기본예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i= 1;
		if ( i == 0){ // 이 갑이 트루면~
		System.out.println(i + "변수의 갑은 0입니다");
		}else{
		System.out.println(i + "변수의 갑은 0이 아닙니다.");
		}
		System.out.println("감사합니다. 프로그램을 종료합니다.");
		System.out.println("--------------------------");
		
		
		while (i<=3){ //일반 적인 반복문 
		System.out.println("뭐야 뭐야");			
			i = i+1; // 또다른 방법으로는 i++;    또 다른방법으로는 i+=1;
		}
		System.out.println("--------------------------");
		
		int a = 3;
		int b = 5;
		// 다른 반보문 중에 do while 이 있는데 이는 실행문이 앞에 있고 조건문이 뒤에 있다는점만 틀리다.
		do{
			System.out.println(a + "는 " + b + "보다 작은 값 입니다.");
			a ++;
			
		}while(a < b );
		
		System.out.println("--------------------------");
		
		
		for (int c= 1; c<=3 ; c++){
			System.out.println("아리랑 아리랑 아리랑");
		}
		System.out.println("--------------------------");
		
		//자 이제 구구단을 만들어 보자꾸나
		
		int e = 0, f=0;
		
		
		for (e=2; e<=9 ; e++){
			System.out.println();
			for(f=1;f<=9 ;f++ ){
				System.out.println(e+"x"+f+"="+(e*f));
			}
		}
		
		System.out.println("--------------------------");
		
		//자 문제 7명의 영어 점수가 아래와 같다면 총합과 평균점수를 구하여라
		
		int [] english = new int [7];
		english[0] = 100;
		english[1] = 20;
		english[2] = 30;
		english[3] = 40;	//만약 배열을 이곳에 6이라고 적으면 배열은 참조변수이기때문에 
		english[4] = 70;
		english[5] = 60;
		english[6] = 70;		//배열을 원하는 지점에 값을 재정의함 또한 배열은 0번부터 되기 때문에 마지막 번지는 -1이다
		
		//390점이 나와야 함
		int sum = 0;
		double average = 0.0;
		for(int g=0; g<7 ; g++){  //여기서 조건부가 g<=7 를 쓰면 안된다.
		
			sum = sum + english[g];
		}
		System.out.println(sum);
		average = (double)sum / (double)english.length;
		
		System.out.println(average);
		
		
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		
	}
	
	
}
