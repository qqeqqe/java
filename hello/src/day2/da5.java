package day2;

public class da5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 콘솔창에 2, 3, 5, 6의 숫자를 입력할때
		 
		 
		 콘솔창에 2라고 할때 2의 배수입니다 라고 출력하고
		 a가 3의 배수이면 3의 배수라고 출력하고
		 a가 6의 배수라면 6의 배수라고 출력하고
		 a가 2,3,4의 배수가 아니면 2,3,6의 배수가 아납니다 라고 출력하세요
		 
		 a가 6일때 6의 배수라고 출력해야한다
		 */
		
		int a = 12;
		
		if (a % 6 == 0){
			System.out.println(a + "는 6의 배수입니다.");
			}
		
		
		else if( a % 3 == 0){
			System.out.println(a + "는 3의 배수입니다.");
		}	
			
		else if( a % 2 == 0){
			System.out.println(a + "는 2의 배수입니다.");
			}
			
		else {
			System.out.println(a + "는 2,3,4의 배수가 아닙니다.");
			}
			


		
		
		}
			
			
			
		}
		
		
	

