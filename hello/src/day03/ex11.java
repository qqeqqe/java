package day03;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
     *        i=1 공=5  *=1
    ***       i=2 공=4  *=3
   *****      i=3 공=3  *=5
  *******     i=4 공=2  *=7
 *********    i=5 공=1  *=9
***********   i=6 공=0  *=11
                                공=6-i *=2*i-1        		 
		 */
		
		int j = 0; //공수
		int i = 0; //줄수
		
		
		for(i=1 ;i<=6 ;i++ ){
		 	for(j=1; j<=6-i ; j++){
		 	System.out.print(" ");
		 	
		}
		 	for(j=1; j<=2*i-1 ;j++ ){
		 	System.out.print("*");
		 	
		 	
		 			 				 	
		}
		 	System.out.println();
		
	    }  		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
