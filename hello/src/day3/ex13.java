package day3;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			/*
     *        i=1	��=5  *=1
    ***       i=2	��=4  *=3
   *****      i=3	��=3  *=5
  *******     i=4	��=2  *=7
 *********    i=5	��=1  *=9
***********   i=6	��=0  *=11

 *********    c=7	��=1  *=9        		 
  ******* 	  c=8	��=2  *=7
   *****	  c=9	��=3  *=5     		 
	***       c=10	��=4  *=3
	 *	      c=11	��=5  *=1 		 
		
			a = ���� ��� = 6-i
			a = ���� ��� =
			       ���� ��� = 6+i				 
				
				 *�� ��� = 2*i-1
				 
			a = ���� ��� = 6-i
			a = ���� ��� =
			       ���� ��� = 6+i
				 
				 */
		
		int i = 0; //�ټ�
		int a = 0; //����
		
	
		
		for(i=1 ;i<=6 ; i++ ){
			for(a=1 ; a<=6-i ;a++ ){
				System.out.print(" ");		
			}
			
			
			for(a=1 ;a<=2*i-1 ;a++ ){
				System.out.print("*");
			}
			
				
			
			System.out.println();
			}
		
		
		
		int c = 0; //�ι�°�ټ���
		int d = 0; //�ι�°������
		
		for(c=7 ;c<=11 ; c++ ){
			for(d=1; d<=c; d++ ){
				System.out.print(" ");
		}
		
		for(d=1 ;d<=9 ;d++ ){
			System.out.print("*");
		}
		
		
		System.out.println();
		
		
		}		
		}
}
		

		
		
		
		
		
		


