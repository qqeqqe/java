package day04;

public class ex5역별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
********* 9
 *******  7
  *****   5
   ***    3
    *     1

i=1 공=0 *=9  10 
i=2 공=1 *=7  
i=3 공=2 *=5
i=4 공=3 *=3
i=5 공=4 *=1
     
     2*(5+1-1)-i
     
     공 = i-1
     별 = ?? 2*
     
     
		 */
		
		int a = 0;
		int i = 0;
		
		for (i=1; i<=10; i++ ){ 
			for(a=1; a<=i-1 ; a++ ){
				System.out.print(" ");
		}
			
			for(a=1; a<= 2*(6-i)-1; a++ ){
			
			System.out.print("*");
			
			}
			System.out.println();
			
		}
	
		
		
		
		
	}

}
