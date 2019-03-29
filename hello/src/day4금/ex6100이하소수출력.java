package day4금;

public class ex6100이하소수출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1부터 100까지 소수를 모두 출력하시오
		
		int num = 6;
		int i, cnt=0;
		
		for(num=1; num<=100; num++){
			for(i=1,cnt=0; i<=num; i++){
			if(num % i == 0){
			cnt++;	
			}
			
			}
			if(cnt ==2){
				System.out.print(" " + num);
			}
			
		}
		
		
		
		
		
	}
}
