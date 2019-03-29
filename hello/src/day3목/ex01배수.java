package day3목;

public class ex01배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
 문제 / 두수의 최소 공배수를 구하는 코드를 작성하세요
최소 공배수는 두수의 공배수중 가장 작은 공배수
공배수는 두수의 배수중 공통으로 포함한 배수

10의 배수는 10 20 30 40 50 60 .....
15의 배수는 15 30 45 60 75 90 ....
10과 15의 공배수는 30 60 90 120
10과 15의 최소 공배수는 30
		 */
		
		
		
		int num1 =10, num2 = 15;
		int i, lcm =1;
		
		for(i=1; i<=num1*num2; i++){
			if(i % num1 == 0 && i % num2 == 0){
				//약수 일경우 i 와 num1의 위치를 바꿔준다. 마찬가지로 i와 num2의 위치를 바꿔주면 된다.
			lcm = i;
			break;
			}
			
		}		
		System.out.println(num1 +"과"+ num2 + "의 최소 공배수는 :" + lcm );
		
		
		
		
		
		
		
		
		
	}

}
