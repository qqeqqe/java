package day나의연습장;

public class ex02역별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		i=0  a<i = 0<0 + 6 -1
		i=1  a<i = 0<1 + 6 -2
		i=2  a<i = 0<2 + 6 -3
		i=3  a<i = 0<3 + 6 -4
		i=4  a<i = 0<4 + 6 -3
		i=5  a<i = 0<5 + 6 -

***********   11개	 
 *********  빈공간1 
  *******   빈공간2
   *****    빈공간3
    ***     빈공간4
     * 		빈공간5
*/		int b= 0;
		int i= 0;
		for (i=0; i<=6; i++){
			for( b=1 ; b<i+1 ; b++){
				System.out.print(" ");
			}
			for(int a=0 ; a<=(2*5+1)-i-b; a++){
				System.out.print("*");
			}
				System.out.println();
		}
	
		
		
	}
}
