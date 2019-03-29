package day3;

public class ex10역별트리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a = 0;
		int i = 0;
		
		
		for(i=1 ;i<=6 ;i++ ){
		 	for(a=1; a<=6-i ; a++ ){
		 	System.out.print(" ");
		 	
		 	}
		 	for(a=1; a<=i ;a++ ){
		 	System.out.print("*");
		 			 				 	
		}
		 	System.out.println();
		
	}
	}
}
