package day05;

public class ex09공약수배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//두수의 공약수들을 배열에 저장하여 출력하는 코드를 작성하시오
		//공약수는 최대 10개까지 저장
		
		int num1=60, num2=200;
		int i;
		int [] arr = new int [10];
		int cnt = 0;//공약수의 갯수
		
		for (i=1 ; i<=num1 ; i++ ){
			if(cnt == 10){
				break;				
			}
			if(num1 % i == 0 && num2 % i == 0 ){
				arr[cnt] = i;  //i 값을 배열 cnt 값에 넣는다
				cnt++; // 공약수의 갯수를 하나 증가
			}		
		}
						
		for(int j=0 ;j<cnt ; j++){
			System.out.print(arr[j] + " ");
		}
		
		
			
			
			
	
		
	}
}