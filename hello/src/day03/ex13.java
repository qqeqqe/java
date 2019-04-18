package day03;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			/*
     *        i=1	공=5  *=1
    ***       i=2	공=4  *=3
   *****      i=3	공=3  *=5
  *******     i=4	공=2  *=7
 *********    i=5	공=1  *=9
***********   i=6	공=0  *=11

 *********    c=7	공=1  *=9        		 
  ******* 	  c=8	공=2  *=7
   *****	  c=9	공=3  *=5     		 
	***       c=10	공=4  *=3
	 *	      c=11	공=5  *=1 		 
		
			a = 공의 계수 = 6-i
			a = 별의 계수 =
			       공의 계수 = 6+i				 
				
				 *의 계수 = 2*i-1
				 
			a = 공의 계수 = 6-i
			a = 별의 계수 =
			       공의 계수 = 6+i
				 
				 */
		
		int i = 0; //줄수
		int a = 0; //공수
		
	
		
		for(i=1 ;i<=6 ; i++ ){
			for(a=1 ; a<=6-i ;a++ ){
				System.out.print(" ");		
			}
			
			
			for(a=1 ;a<=2*i-1 ;a++ ){
				System.out.print("*");
			}
			
				
			
			System.out.println();
			}
		
		
		
		int c = 0; //두번째줄수용
		int d = 0; //두번째공수용
		
		for(c=7 ;c<=11 ; c++ ){
			for(d=1 ;d<=22-d ;d++ ){
				System.out.print("*");
				d++;
		}
			for(d=1; d<=c; d++ ){
				System.out.print(" ");
		
		}
		
		
		System.out.println();
		
		
		}		
		}
}
		

		
		
		
		
		
		


