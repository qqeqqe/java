package day08;

public class ex03구구단산술 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		기능 - 2단에서 9단 (구구단)을 출력하는 기능
		매개변수 - 두 정수 = int i, int a
		리턴타입 - void
		메소드명 - printMultiTable
		*/
		
		MultiTable(2,6);  // 처음에서 끝에까지의 범위 

	
		}
	
	public static void MultiTable(int i,int a){  //매개변수에서 초기화 값 0으로 선언 한다
		for(; i<=a; i++){
			System.out.println();
/*int i를 메서드에서 0으로 초기화 하였기 때문에 굳이 초기화를 안하며
[[i부터 초기화한 a보다 작거나 같을때까지]][[i를 하나씩 올린다]]*/ 
			for(int b=1; b<=9 ; b++){  //가운데 들어가는 변수, 다른곳에서 쓸일이 없으므로 지역변수를 선언한다
				
				System.out.println(i + " X " + b + " = " + i*b);
				//원레 끝자리에 i*b를 넣어도 되고 25번째 줄에 int sum = i*b; 를 넣어도 상관이 없다 
			}
		}
		

		
	}

}
